__author__ = 'Willy'


class food(object):
    taste= None
    color = None
    fruit = None

    def __init__(self,taste1, color1, fruit1):
        self.taste = taste1
        self.color = color1
        self.fruit = fruit1

    def get_taste(self):
        return self.taste

class pie(food):
    def make_sound(self):
        print "Moo"

blue = pie("maybe","no","yes")

blue.taste = "Fuck bitches get money"
print blue.get_taste()

person = raw_input("enter your name")
print("Hello", person )
