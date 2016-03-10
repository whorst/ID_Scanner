__author__ = 'Willy'
import re

class Student(object):

    def __init__(self, first = "Jon", last = "Doe", max = 415.0, points = 0):
        grad = [max,points]
        self.__str_fname = first
        self.__str_lname = last
        self.__str_grade = "E"


    def __str__(self):
        return "{} {}:{}".format(self.__str_fname,self.__str_lname, self.__str_grade)


    @property
    def str_fname(self):
        return self.__str_fname

    @property
    def str_lname(self):
        return self.__str_lname

    @property
    def str_grade(self):
        return self.__str_grade


    @str_fname.setter
    def str_fname(self, fname):
        self.__str_fname = fname

    @str_lname.setter
    def str_lname(self, lname):
        self.__str_lname = lname

    @str_grade.setter
    def str_grade(self, grade):


        if isinstance(grade,list)==True:


            max = grade[0]

            try:
                float(max)
            except:
                ValueError
                max = 415.0

            finally:


                num = 0
                for i in grade[1:]:
                    if isinstance(i,int)==False:
                        continue
                    num += i

                int_percent =float( round((num/float(max))*100,0))

                if int_percent >=92:
                    self.__str_grade = "A"
                elif int_percent<= 91 and int_percent >=90:
                    self.__str_grade = "A-"
                elif int_percent<=89 and int_percent >=88:
                    self.__str_grade = "B+"
                elif int_percent<= 87 and int_percent >=82:
                    self.__str_grade = "B"
                elif int_percent<= 81 and int_percent >=80:
                    self.__str_grade = "B-"
                elif int_percent<= 79 and int_percent >=78:
                    self.__str_grade = "C+"
                elif int_percent<= 77 and int_percent >=72:
                    self.__str_grade = "C"
                elif int_percent<= 71 and int_percent >=70:
                    self.__str_grade = "C-"
                elif int_percent<= 69 and int_percent >=68:
                    self.__str_grade = "D+"
                elif int_percent<= 67 and int_percent >=62:
                    self.__str_grade = "D"
                elif int_percent<= 61 and int_percent >=60:
                    self.__str_grade = "D-"
                elif int_percent <=59:
                    self.__str_grade = "E"

        else:
            self.__str_grade = "E"

def main():

    fo = open("Grades",'r')
    fow = open("Graded", 'w')
    obj_list = []

    q =0
    for line in fo.readlines():

        obj_student = Student()

        str_now = line

        words = str_now.split(",")
        obj_student.str_lname = words[0]
        obj_student.str_fname = words[1]

        r = 1
        total = []
        total.insert(0,415.0)
        #This is my last thing <=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=
        for i in words[2:]:
            total.insert(r,int(i))
            r += 1

        obj_student.str_grade = total


        obj_list.insert(q,obj_student)
        q+= 1



    obj_list.sort(key = lambda k : (re.sub("[^a-zA-Z]+", "",k.str_lname+ k.str_fname).lower().replace(" ","")))



    for c in obj_list:
        fow.write(c.__str__()+"\n")


    fo.close()
    fow.close()

    newlist= (bubble_sort(obj_list))

    for c in newlist:
        print(str(c))
exit(0)


def bubble_sort(obj_list):
    for q in range (len(obj_list)):
        for j in range(q):

            curr1 = re.sub("[^a-zA-Z]+", "",(obj_list[j].str_lname + obj_list[j].str_fname).lower().replace(" ",""))
            next1 = re.sub("[^a-zA-Z]+", "",(obj_list[j+1].str_lname + obj_list[j+1].str_fname).lower().replace(" ",""))

            print(curr1, next1)
            exit(0)

            if curr1 > next1:
                temp = obj_list[j]
                obj_list[j] = obj_list[j+1]
                obj_list[j+1] = temp

    return obj_list


if __name__ == '__main__':
     main()

