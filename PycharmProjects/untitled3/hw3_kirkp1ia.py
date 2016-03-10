#! /usr/bin/env python

class Course(object):
    """docstring for Course"""

    def __init__(self, str_course_designator="tex001", str_course_meeting_times=None, li_enrolled_students=[]):
        super(Course, self).__init__()
        self.str_course_designator = str_course_designator
        self.str_course_meeting_times = str_course_meeting_times
        self.li_enrolled_students = li_enrolled_students

    @property
    def str_course_designator(self):
        return self.__str_course_designator
    @str_course_designator.setter
    def str_course_designator(self, str_course_designator):
        self.__str_course_designator = str(str_course_designator)

    @property
    def str_course_meeting_times(self):
        return self.__str_course_meeting_times
    @str_course_meeting_times.setter
    def str_course_meeting_times(self, str_course_meeting_times):
        self.__str_course_meeting_times = str(str_course_meeting_times)

    @property
    def li_enrolled_students(self):
        return self.__li_enrolled_students
    @li_enrolled_students.setter
    def li_enrolled_students(self, li_enrolled_students):
        self.__li_enrolled_students = list(li_enrolled_students)

    def __repr__(self):
        return "{0}:{1}".format(self.str_course_designator, self.str_course_meeting_times)

    def __str__(self):
        return "{0}:".format(self.str_course_designator)


class Student(object):
    """docstring for Student"""
    def __init__(self, str_first_name=None, str_last_name=None, str_middle_name=None, str_student_id=None, li_enrolled_courses=[]):
        super(Student, self).__init__()
        self.str_first_name = str_first_name
        self.str_last_name = str_last_name
        self.str_middle_name = str_middle_name
        self.str_student_id = str_student_id
        self.li_enrolled_courses = li_enrolled_courses

    @property
    def str_first_name(self):
        return self.__str_first_name
    @str_first_name.setter
    def str_first_name(self, str_first_name):
        self.__str_first_name = str(str_first_name)

    @property
    def str_middle_name(self):
        return self.__str_middle_name
    @str_middle_name.setter
    def str_middle_name(self, str_middle_name):
        self.__str_middle_name = str(str_middle_name)

    @property
    def str_last_name(self):
        return self.__str_last_name
    @str_last_name.setter
    def str_last_name(self, str_last_name):
        self.__str_last_name = str(str_last_name)

    @property
    def str_student_id(self):
        return self.__str_student_id
    @str_student_id.setter
    def str_student_id(self, str_student_id):
        self.__str_student_id = str(str_student_id)

    @property
    def li_enrolled_courses(self):
        return self.__li_enrolled_courses
    @li_enrolled_courses.setter
    def li_enrolled_courses(self, li_enrolled_courses):
        self.__li_enrolled_courses = list(li_enrolled_courses)

    def get_scedule(self):
        schedule = [x.str_course_meeting_times for x in self.li_enrolled_courses]
        return sorted(schedule, key=lambda x: x.split(":")[0])

    def __str__(self):
        return "Name:{2}, {0} {1}\nStudentID:{3}\n\n\n".format(self.str_first_name, (self.str_middle_name or ''), self.str_last_name, self.str_student_id, "\n".join([repr(x) for x in sorted(self.li_enrolled_courses, key=lambda x: x.str_course_designator)]))

    def __repr__(self):
        return "Name:{2}, {0} {1}\nStudentID:{3}\n\n{4}\n\ncut here\n------------------------\n".format(self.str_first_name, (self.str_middle_name or ''), self.str_last_name, self.str_student_id, "\n".join([repr(x) for x in sorted(self.li_enrolled_courses, key=lambda x: x.str_course_designator)]))

def get_student(li_students, str_student_id):
    st = None
    for s in li_students:
        if s.str_student_id == str_student_id:
            return s
    raise IndexError('%s not found.' % str_student_id)

def get_course(li_courses, str_course_designator):
    st = None
    for s in li_courses:
        if s.str_course_designator == str_course_designator:
            return s
    raise IndexError('%s not found.' % str_course_designator)

def main():
    courses = read_course_instantiation()
    students = read_students()
    enrolments = read_course_enrolment()

    set_relationships(courses, students, enrolments)
    # print Student.get_student(students, 'adama1l').li_enrolled_courses
    # print Student.get_student(students, 'besse1j').li_enrolled_courses

    with open("Schedule", "w") as sched_file:
        sched_file.write("\n".join(repr(x) for x in sorted(students, key=lambda x: "{} {}".format(x.str_last_name, x.str_first_name).upper())) + "\n")

def read_course_enrolment():
    dict_courses = {}
    with open("CourseEnrollment") as ce:
        li_courses = ce.read().strip().split("\n\n")
        for c in li_courses:
            dict_courses[c.split("\n")[0]] = c.split("\n")[2:]

    return dict_courses

def read_course_instantiation():
    li_courses = []
    with open("Courses") as cs:
        li_courses_temp = cs.read().strip().split("\n\n")
        for c in li_courses_temp:
            sched = c.split("\n")[2]
            if sched[:4] == 'T,Th':
                sched = '{} {}'.format(sched[:4], sched[4:])
            elif sched[:4] == 'M,W ':
                sched = '{}  {}'.format(sched[:4], sched[4:])
            li_courses.append(Course(c.split("\n")[0], sched))

    return li_courses

def read_students():
    li_students = []
    with open("Students") as sts:
        for s in sts.readlines()[2:]:
            if s == '':
                continue
            else:
                li_student_indiv = s.split()
                if len(li_student_indiv) == 3:
                    li_student_indiv.insert(1, '')
                li_students.append(Student(li_student_indiv[2], li_student_indiv[0], li_student_indiv[1], li_student_indiv[3]))

    return li_students

def set_relationships(li_courses, li_students, dict_enrolments):
    for c_name, li_stu_ids in dict_enrolments.items():
        c = get_course(li_courses, c_name)
        c.li_enrolled_students = []
        for st_name in li_stu_ids:
            st = get_student(li_students, st_name)
            st.li_enrolled_courses.append(c)
            c.li_enrolled_students.append(st)

if __name__ == "__main__":
    main()
