__author__ = 'Willy'
import random
import sys
import os

#Python is dependent on white spaces

print("Hello World")

#This is a comment.    '''and so is this'''

#The main data types are Numbers, Strings, Lists, Tuples, and Dictionaries
#The main Arithmetic operators are + - / * % //(Floor Division) **(exponential)
#One can use () to change the order of operations in math problems

multi_line_quote = '''This quote
is multiple lines'''

name = "Derek"
print("I like the quote:", multi_line_quote) #<<<This concatenates two strings together.

print('\n'*5) #This prints 5 newlines

print("------------------------------------------------------------------------------------------")
#Lists are very basic types of data structures
grocery_list = ['Banana', 'Apple',  'cat'
'16', 'dog', 'elephant ear']

print(grocery_list[0]) #prints the first list item

grocery_list[0]='green apples' #One is able to change the numbered values.
print(grocery_list[1:3]) #Prints the second and up to but not including the 4th value.

Second_and_third = grocery_list[1:3]

#One can put lists inside of lists.

grocery_list.insert(0, "Onions") #Inserts onions to the front of the list.

grocery_list.sort() #Sorts grocery_list in reverse order.
#grocery_list.reverse()#reverses the grocery_list
#del grocery_list[1] #Deletes the first thing in the list
print(grocery_list)

print("------------------------------------------------------------------------------------------")

#Tuples can not be changed, but are a sequence like a list.

pi_tuple = (1,2,11,4,41,73,25,0,68)

convertTuple = list(pi_tuple) #This converts the tuple to a list. You can also convert a list to a tuple.

len(pi_tuple)#returns the length
min(pi_tuple)#returns the minimum
max(pi_tuple)#Returns the maximum


min = min(pi_tuple)
max = max(pi_tuple)

print(max-min)

print("------------------------------------------------------------------------------------------")
#Dictionaries/Maps are values with a unique key to each value

super_villans = {"Masked Mumbler" : "Ed" ,
                 "Galactis" : "Tommy Cruise",
                 "Loki" : "Loki",
                 "The Green Goblin" : "William Duggar DaFoe"}
print(super_villans['Galactis'])
print(super_villans.keys()) #prints the first names
print(super_villans.values()) #prints the second names
print("------------------------------------------------------------------------------------------")
# if else and elif
# elif is else if

age = 16

if age< 21:
    print("You're not old enough to have fun")
else :
     print("You are old enough to have fun")

#The different logical operators are: and, or, and not

if age< 21 and age> 1:
    print("You're not old enough to have fun")
elif not (age == 22) :
     print("You are old enough to have fun")

print("------------------------------------------------------------------------------------------")
# LOOPS

for x in pi_tuple:   #This piece of code will loop through the data structure and print everything
    print (x)

for x in range (0, 10):
    print(x, " " , end = " ") #< This piece of code Prints the numbers in a nice little row

#We can also double up for loops. This is exemplified in minute 21 on Derek Banas videos. I ended at 23 min on the video

i = 0;

while (i<0):
    if(i%2 == 0):
        print(i)
    if (i ==9):
        break
    else:
        i += 1
        continue
    i += 1



print("------------------------------------------------------------------------------------------")
#Functions! Methods basically

def myMethod(firstNumber, lastNumber):
    sumNumber = firstNumber + lastNumber
    return sumNumber

print(myMethod(1, 1))

print("------------------------------------------------------------------------------------------")
#user input

#nt("What is your user input?")
#userInput = sys.stdin.readline()

#print("hello", userInput)

print("------------------------------------------------------------------------------------------")
#Working with Strings

theString = "Print the first word"

print(theString[0:5])
print(theString[-4:]) #< This prints out the last four characters
print(theString[:-4]) #<This prints out everything but the last four chars

print("------------------------------------------------------------------------------------------")
#I/O

#Writing info
#test_file =open("name.txt" "wb") #wb will allow you to write to a file

#test_file.write(bytes("Write me to the text file",'UTF-8')) #Allows to write to the text file.

#test_file.close();

#Reading Info
#test_file = (open(name.txt, "r+")) # r+ is reading and writing
#test_file.read()
#test_file.close()

#To remove the file
#os.remove("name.txt")

print("------------------------------------------------------------------------------------------")
#Objects

class Animal:
    __name = None         #These variables are all private. We need different functions to get and set the values.
    __height = None       #Preceding a value with two underscores makes them private
    __weight = None
    __sound = None
    sound = None

    def __init__(self, name, height, weight, sound):   #Constructors initialize clas objects in other classes
        self.__name = name
        self.__height = height
        self.__sound = sound
        self.__weight = weight


    def set_name(self, name):        #self allows an object to refer to itself inside of a class
        self.__name =name

    def get_name(self, name):
        return self.__name

    def __get__(self, name):
        return self.name

    def toString(self):
        return("The name of the animal is {} and it is {} meters tall and it weighs {} kilos and it sounds like{}".format(self.__name, self.__height,
                                                                                           self.__weight, self.__sound))
    def saySomething(self, sound):



cat = Animal("whiskers", 33, 67, "meow") #Everytime you create an object like this, the constructor (__init__ is utilized)
print(cat.toString())

print("------------------------------------------------------------------------------------------")
#Objects

class dog(Animal):
    print("That was easy")   #That's literally all you have to do. Now every single variable and method in the animal
                             #class is available to you in the dog class






