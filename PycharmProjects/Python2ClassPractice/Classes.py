__author__ = 'Willy'



class myClass(object):

    __arm1  = None
    __leg1 = None
    __type1 = None

    def __init__(self, arm, leg, type):
        self.__arm1 = arm
        self.__leg1 = leg
        self.__type1 = type


    def getArm(self):
        return self.__arm1




cat = myClass(7, 2, 3)

print cat.getArm()
print cat.ge()
print cat.getArm()

#class2.printYes()