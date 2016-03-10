__author__ = 'Willy'

fo_CE = open("CourseEnrollment",'r')

print('Name:Adama, Leland Joseph\n', 'StudentID:adama1l\n', '\n', 'CS05:M,W,F 3:00-3:55\n',
                          'EN08:M,W,F 2:00-2:55\n', 'OT02:T,Th  7:00-8:45\n', 'PH03:T,Th  1:00-2:45\n', '\n',
                          'cut here\n', '------------------------\n', '\n', 'Name:Adama, William \n',
                          'StudentID:adama1w\n', '\n', 'CS05:M,W,F 3:00-3:55\n', 'EN08:M,W,F 2:00-2:55\n',
                          'OT02:T,Th  7:00-8:45\n', 'PH05:T,Th  3:00-4:45\n', '\n', 'cut here\n')

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




