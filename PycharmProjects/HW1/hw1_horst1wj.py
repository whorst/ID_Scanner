#!/usr/bin/env python
# HW #1: FizzBuzz
# Author: Will Horst
# Due: 5Feb2016

class FizzBuzz(object):
    def __init__(self, value = 0):
        self.num = value

    @property
    def num(self):
        return self.__num

    @num.setter
    def num(self, value):
        value = int(value)
        self.__num = value
        self.fbn = value

    @property
    def fbn(self):
        return self.__fbn

    @fbn.setter
    def fbn(self, value):
        if ((value % 3) == 0):
            self.__fbn = "Fizz"

        if ((value % 5) == 0):
            self.__fbn = "Buzz"

        if ((value % 3) == 0 and (value % 5) == 0):
            self.__fbn = "FizzBuzz"

        if ((value % 3) != 0 and (value % 5) != 0):
            self.__fbn = "%s" % str(value)

    def __str__(self):
        return "The number is {} and fbn is {}".format(self.num, self.fbn)

def main():
    list = []
    for i in range(0, 51):
        fb_obj = FizzBuzz(i)
        list.append(fb_obj.fbn)
        print list[i]

if __name__ == '__main__':
     main()





