__author__ = 'Willy'



class car (object):
    __engine = None
    __wheel = None
    __transmission = None

    def __init__(self, eng,whe, trans):
        self.__engine = eng
        self.__wheel = whe
        self.__transmission = trans

    def getWheel(self):
        return self.__wheel


ford = car(4, 4, 4)
print "***"
print ford.getWheel()