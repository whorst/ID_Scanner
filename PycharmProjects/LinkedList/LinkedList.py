import os
import random
import sys
__author__ = 'Willy'

class Node(object):
        def __init__(self, data = None, next_node = None): #None is a signal object meaning nothing here.
            self.data = data
            self.next_node = next_node

        def get_data(self): # self is a reference to an object
            return self.data

        def get_next(self):   #Return the next node in th list
            return self.next_node

        def set_next(self, new_next): # set The node after the current node
            self.next_node=new_next

class LinkedList(object):

    def __init__(self, head=None):
        self.head = head

    def insert(self, data):
        new_node= Node(data)
        new_node.set_next(self.head)
        self.head = new_node

    @property
    def size(self):
        current = self.head
        count = 0
        while current:
            count+=1
            current = current.get_next()
        return count

    def search(self, data):
        current = self.head
        found = False
        while current and found is False:
            if current.get_data() == data:
                found = True
                print(data, "Has been found")
            else:
                current = current.get_next()
        if (current is None):
            raise ValueError("Data not in list")
        return current


    def delete(self, data):
        current = self.head
        found = False
        while current and found is False:
            if current.get_data() == data:
                found = True
            else:
                previous = current
                current = current.get_next()
        if current is None:
             raise ValueError("Data not in list")
        if previous is None:
            self.head = current.get_next()
        else:
            previous.set_next(current.get_next())

def test_insert():
    l_list = LinkedList()
    l_list.insert("David")
    l_list.insert("Keith")
    l_list.insert("Ryan")
    l_list.insert("Billy")

    l_list.search("Billy")

    print(l_list.size)

test_insert()



