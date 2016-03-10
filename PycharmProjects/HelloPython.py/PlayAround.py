__author__ = 'Willy'

import os
import sys
import random


source = {}


def selection_sort(list):
    for z in range(len(list)):
        #print(z) #z has one added to it every time there's an iteration
        y = z
        for i in range(z,len(list)): #This piece of code check the iteration @ z and the comparisons are made
            #print(z)
            if list[y] > list[i]:
                #print(y,"y") #same thing that z does
                #print(i,"i")
                y = i
        list[z], list[y] = list[y], list[z]
    return list
#print (selection_sort([3,2,6,5,7,3,8,9,0,23,45,63,32,21]))


def bubbleSort(list):

    for i in range(len(list)):
        for k in range(len(list)):

            if(list[k]>list[i]):
             list[k], list[i]= list[i],list[k]
             print(list)

list=[5,10,11,32,67,1,9,8,0,32,27]

##bubbleSort(list)

def fizzbuzz():
    for x in range (1, 101):

        if (x%3==0):
            print(x, " fizz")

        if(x%5==0):
            print(x, " buzz")

        if(x%5==0 and x%3==0):
            print(x, " fizz buzz")

        if(x%5 != 0 and x%3 !=0 ):
            print(x)


#fizzbuzz()

class Animal1:
    # None signifies the lack of a value
    # You can make a variable private by starting it with __
    __name = None
    __height = None
    __weight = None
    __sound = None

    # The constructor is called to set up or initialize an object
    # self allows an object to refer to itself inside of the class
    def __init__(self, name, height, weight, sound):
        self.__name = name
        self.__height = height
        self.__weight = weight
        self.__sound = sound

    def set_name(self, name):
        self.__name = name

    def set_height(self, height):
        self.__height = height

    def set_weight(self, height):
        self.__height = height

    def set_sound(self, sound):
        self.__sound = sound

    def get_name(self):
        return self.__name

    def get_height(self):
        return str(self.__height)

    def get_weight(self):
        return str(self.__weight)

    def get_sound(self):
        return self.__sound

    def get_type(self):
        print("Animal")

    def toString(self):
        return "{} is {} cm tall and {} kilograms and says {}".format(self.__name, self.__height, self.__weight, self.__sound)

# How to create a Animal object
cat = Animal1('Whiskers', 33, 10, 'Meow')

#print(cat.toString())

a =0
b= 0
c= 0
d= 0
e=0
f=0
g=0
h=0
num_list={1,1,1,1,1,1,1,1,1,1,1,1,1,2,3,4,5}

for t in range(9,len(num_list)):

    print(t)


