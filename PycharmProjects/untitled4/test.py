__author__ = 'Willy'

fo_CE = open("CourseEnrollment",'r')

print(str(None))
exit(0)


data = fo_CE.read().split('\n\n')

p = 0

dict_course ={}
li_name = []


while p < len(data)-1:

    g = data[p].split('\n')

    del g[1]
    name_course = g[0]
    li_name = g[1:]

    dict_course[name_course] = li_name

    p+=1

print(p)

for x in dict_course:
    print(x,":",dict_course[x])

'''    MTO3 = data[p].split('\n')
    del MTO3[1]
    #print(MTO3)

    print(li_name)

    course = MTO3[0]
    li_name = MTO3[1:len(MTO3)]

    #dict_course='''


exit(0)




