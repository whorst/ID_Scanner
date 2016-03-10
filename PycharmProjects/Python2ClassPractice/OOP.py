__author__ = 'Willy'

class parent(object):
    def print_yes(self):
        print"yes"

class child(parent):
    def print_no(self):
        super(child,self).print_yes()
        print "no"


par = parent()
chi = child()

#par.print_yes()
chi.print_no()


class Other (object):
    def override(self):
        print "Other override"

    def implicit(self):
        print "Other implicit"

    def altered(self):
        print "Other altered"


class child (object):

    def __init__(self):
        self.other = Other()

    def override(self):
        self.other.override()

    def implicit(self):
        self.other.implicit()

    def altered(self):
        self.other.altered()
