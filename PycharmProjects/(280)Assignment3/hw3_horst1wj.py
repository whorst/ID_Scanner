__author__ = 'Willy'
import re

'''
I've tried extremely hard to figure out what the problem is and how to fix it and have been running into an issue doing so
I'd like to drop by your office hours sometime and figure out exactly where the issue is.
'''
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

    def __str__(self):
         return "Name:{0}, {1} {2}\nStudentID:{3}\n\n{4}\n\n".format(self.__str_last_name, self.__str_first_name, (is_empty(self.__str_middle_name)), self.str_student_id,cheat_list(self.__li_enrolled_courses))


def main():

    p = 0

    dict_course ={}

    fow = open("Schedule",'w')
    fo_student = open("Students",'r')

    '''
    The code below opens the text file and grabs the data from it anf initializes it to a list
    '''
    with open("CourseEnrollment",'r') as fo_co_enroll:
        enroll_data = fo_co_enroll.read().split('\n\n')

    '''
    The code below opens the text file and grabs the data from it and initializes it to a list. This does it with data from the course,
    however.
    '''

    with open("Courses",'r') as fo_courses:
        course_data = fo_courses.read().split('\n\n')

    '''
    Create a list of course objects
    '''
    li_course_obj = create_li_obj_course(course_data,enroll_data)


    '''
    Loop through or enroll data
    '''
    while p < len(enroll_data)-1:

        '''
        Define a list, g, that is split at every newline
        '''
        g = enroll_data[p].split('\n')
        '''
        The 1st index of g will be non alphanumeric charactersm so get rid of it
        '''
        del g[1]
        '''
        The name of the course is the 0th instance
        '''
        name_course = g[0]
        '''
        This initializes our list of names
        '''
        li_name = g[1:]

        p+=1
    p = 0

    obj_student_list = []
    for line in fo_student.readlines():

        line_data = line.split()
        line_lenght = len(line_data)

        if line_lenght == 4:

            '''
            Set your student's first name, middle name, last name, and list of courses.
            '''
            obj_student = Student(line_data[2],line_data[0])
            obj_student.str_middle_name = line_data[1]
            obj_student.str_student_id = line_data[3]
            obj_student.li_enrolled_courses = search(obj_student.str_student_id, li_course_obj)

            obj_student_list.insert(p,obj_student)

        if line_lenght == 3:

            '''
            Set your student's first name, last name, and list of courses.
            '''

            obj_student = Student(line_data[1],line_data[0])
            obj_student.str_student_id = line_data[2]
            obj_student.li_enrolled_courses = search(obj_student.str_student_id, li_course_obj)

            obj_student_list.insert(p,obj_student)

        p+=1

    '''
    Sort the list of student objects by a concatination of first name and last name.
    '''
    b = sorted(obj_student_list, key = lambda x: (x.str_last_name+x.str_first_name).lower())

    for i in b:
       # print(i.__str__())
        fow.write(i.__str__()+"cut here\n------------------------\n\n")

    fo_student.close()
    fow.close()

'''
Check if the string is empty. If it's not, return the string. Otherwise, Return an empty string.
'''
def is_empty(str):
    com = ''
    if str == 'None':
        com = ''
    else:
      com = str

    return com

'''
Search the list of students for the proper global id
'''
def search(global_id ,li_enroll):
    p=0
    li_temp = []
    for x in li_enroll:
        if global_id in x.li_enrolled_students:
            temp_str = (x.str_course_designator+':' + x.str_course_meeting_times)
            li_temp.insert(p,temp_str)
            li_temp.sort()
            p+=1

    '''
    For every id found, put it in a list and return it
    '''
    return li_temp

"""
This method initializes the list of objects
"""
def create_li_obj_course(course_data, enroll_data):

    p = 0
    li_obj = []

    while p < len(course_data):

        str_course = re.sub(r'-*\n',' ',course_data[p])

        str_course_des = str_course[0:4]
        str_course_time = str_course[6:]

        g = str_course_time.split(" ")

        s = g[0]

        '''
        Proper formatting of the dates
        '''
        if len(s.strip()) == 5:
            g[0] = "M,W,F "
        if len(s.strip()) == 3:
            g[0] = "M,W   "
        if len(s.strip()) == 4:
            g[0]= "T,Th  "


        str_course_time = ''.join(g)
        obj_courses = Course(str_course_des)
        obj_courses.str_course_meeting_times = str_course_time


        li_temp = enroll_data[p].split('\n')

        obj_courses.li_enrolled_students = li_temp[2:]
        li_obj.insert(p, obj_courses)

        p+=1
    return li_obj

'''
This method prints out the list passed to it in the proper format
'''

def cheat_list(li):
    x = "\n".join(li)
    return x

if __name__ == "__main__":
    main()
