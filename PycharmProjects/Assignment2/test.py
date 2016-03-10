__author__ = 'Willy'


a = "howardmoe"
b = "howardcurly"
c = "finelary"

g = [c,a,b]

float("100")

print(float("100"))

exit(0)

print(g)
for q in range (len(g)-1):
    for j in range(q):

        if (g[j]>g[j+1]):
            temp = g[j]
            g[j] = g[j+1]
            g[j+1] = temp


print(g)


if b < a :
    print ("true")
else:
    print ("false")


mylist = [12, 5, 13, 8, 9, 65]

def bubble(badList):
    length = len(badList) - 1
    unsorted = True

    while unsorted:
    	for element in range(0,length):
		    unsorted = False
		    if badList[element] > badList[element + 1]:
			    hold = badList[element + 1]
			    badList[element + 1] = badList[element]
			    badList[element] = hold
			    print(badList)
		    else:
			    unsorted = True

print(bubble(g))