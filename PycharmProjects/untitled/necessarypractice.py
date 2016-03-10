__author__ = 'Willy'


class person(object):
    def __init__(self):
        self.__job = None
        #self.tool = None
    @property
    def job(self):
        return self.__job

    @job.setter
    def job(self, job):
       self.__job = job

    def print_me(self):
        print ("me")

class teacher(object):
    def __init__(self):
        self.__school = None
        self.person= person()

    @property
    def school(self):
        return self.__school

    @school.setter
    def school(self, school):
        self.__school = school

#The four lines of code below me utilize what's known as composition

    def print_me1(self):
        #This works, even when we don't inherit from object.
        self.person.print_me()

joe = teacher()

joe.job = "plumber"
joe.school = "Bedford"
joe.print_me1()
#joe.print()

print(joe.school)

#To override a function, just declare a new function of the same name.
#super(CurrentClass, self).function_name if you'd like to reuse the super class
#Use composition when you'd like to call functions of other classes. Super useful.
#Use inheritance when you want to reuse similar functioning code

#Can we prevent a child from inheriting methods from the parent class?