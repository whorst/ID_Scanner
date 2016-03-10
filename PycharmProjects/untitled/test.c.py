__author__ = 'Willy'


fo = open("Test",'a')
fo1 = open("Test",'a')

t =fo.readlines()

one = t[0]
two = t[1]

fo.seek(0)
fo.truncate()



exit()

for line in fo.readlines():
    print(line.rstrip())
    exit(0)
    fo.write(line)






print(one, two)
'''
def addit(a,b,*c):
    print(a, b, c)
    return a+b+sum(c)

addit(3,5,15,21,5)
'''



'''
x = [0,1,2,3,4]

a = "k"
b = int(a)

print(b)

print("\n\nGeorge is a new student.\n".strip() + "Hello" )
'''



'''
double = lambda x: x * 2
print(double(8))
'''
'''
def addit(a,b,c):
    print(a, b, c)
    return a+b+c

addit(3,5,15)
'''


'''

def addit(a=5,b=3,c=10):

    return a+b+c

addit(c=5,b=15)
'''
'''
def addit(a,b,c):
    return a+b+sum(c)

addit(3,5,15,21,5)
'''
'''print(del (True and True))
print(False or True)
print((1==1) and False)
print(not (True and False))
print(True and True)
print(True and True)
print(True and True)
print(True and True)
print(True and True)
print(True and True)
'''

