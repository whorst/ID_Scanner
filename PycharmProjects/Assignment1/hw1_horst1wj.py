__author__ = 'Willy'


class FizzBuzz(object):

    def __init__(self,value = 0):
        self.num = value
        self.fbn = "FizzBuzz"

    def get_num(self):
        return self.num

    def set_num(self, value):
        value = int(value)
        self.num = value

    def set_fbn(self, no):

        if ((no % 3) == 0):
            self.fbn = "fizz"

        if ((no % 5) == 0):
            self.fbn = "buzz"

        if ((no % 3 ) == 0 and (no % 5) == 0):
            self.fbn = "fizzbuzz"

        if ((no % 3 ) != 0 and (no % 5) != 0):
            self.fbn = str(no)


    def get_fbn(self):
        return self.fbn


def main():
    List = []

    for i in range (0,51):
            #num1 = FizzBuzz()
        List.append(FizzBuzz(i))

    for i in range (0,51):
        new = List[i]

        new.set_num(i)
        new.set_fbn(new.get_num())
        print(new.get_fbn())



if  __name__ =='__main__':
    main()


'''
        num1.set_fbn(num1.get_num())
        num1.get_fbn()
        '''
'''
fbo = FizzBuzz()
if __name__ == '__main__':
    fbo.main()
'''


#num1 = FizzBuzz()
#num1.set_num(15)

#fbn = FizzBuzz()
#fbn.set_fbn(num1.get_num())
#print(fbn.get_fbn())


