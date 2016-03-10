__author__ = 'Willy'
import re

class Course(object):
    def __init__(self, designator = "tex001", meet = None, li = []):
        self.str_course_designator = designator
        self.str_course_meeting_times= meet
        self.li_enrolled_students = li

    @property
    def str_course_designator(self):
        return self.__str_course_designator

    @property
    def str_course_meeting_times(self):
        return self.__str_course_meeting_times

    @property
    def li_enrolled_students(self):
        return self.__li_enrolled_students

    @str_course_designator.setter
    def str_course_designator(self,des):
        self.__str_course_designator = str(des)

    @str_course_meeting_times.setter
    def str_course_meeting_times(self, meet):
         self.__str_course_meeting_times = str(meet)

    @li_enrolled_students.setter
    def li_enrolled_students(self, enrol):
        self.__li_enrolled_students = list(enrol)

    def __str__(self):
        return "{0}:".format(self.str_course_designator)


    def __repr__(self):
        return "{0}:{1}".format(self.str_course_designator, self.str_course_meeting_times)
#    def __str__(self):
#        return (self.str_course_designator, self.str_course_meeting_times, self.li_enrolled_students)


class Student(object):

    def __init__(self, fname =None ,lname=None ,midname = None, id = None, li =[]):
        self.str_first_name = fname
        self.str_middle_name = midname
        self.str_last_name = lname
        self.str_student_id = id
        self.li_enrolled_courses = li

    @property
    def str_first_name(self):
        return self.__str_first_name

    @property
    def str_middle_name(self):
        return self.__str_middle_name

    @property
    def str_last_name(self):
        return self.__str_last_name

    @property
    def str_student_id(self):
        return self.__str_student_id

    @property
    def li_enrolled_courses(self):
        return self.__li_enrolled_courses


    @str_first_name.setter
    def str_first_name(self,fname):
        self.__str_first_name = str(fname)

    @str_middle_name.setter
    def str_middle_name(self,mname):
        self.__str_middle_name = str(mname)

    @str_last_name.setter
    def str_last_name(self,lname):
        self.__str_last_name = str(lname)

    @str_student_id.setter
    def str_student_id(self,id):
        self.__str_student_id = str(id)

    @li_enrolled_courses.setter
    def li_enrolled_courses(self,course):
        self.__li_enrolled_courses =list(course)

    #def __str__(self):



def main():
    p = 0

    li_student_obj = []
    li_course_obj = []

    with open("CourseEnrollment", 'r') as foce:
       course_enrollment_data = foce.read().split('\n\n')

    with open("CourseEnrollment", 'r') as foc:
       course_data = foc.read().split('\n\n')

    with open("Students",'r') as fos:
        student_data = fos.read()


        print(course_data)
        for x in course_data:
            print(x.replace("----",''))


if __name__ == "__main__":
    main()


#for str_key in sorted(List)