class ConditionalLogic():
    def main(self):
        a = 1
        b = 2
        c = 3
        print("Testing and/or statements")
        print("a = 1\nb = 2\nc = 3")
        print("-----")
        
        testvar = ("Testing '(a == 2 or b == 2)'... ")
        if (a == 2 or b ==2): 
            print(testvar + "One of them is true")
        else: 
            print(testvar + "false")
        
        testvar = ("Testing '(a == 2 and b == 2)'... ")
        if (a == 2 and b ==2):
            print(testvar + "One of them is true")
        else:
            print(testvar + "false")

        testvar = "Testing '(a == 1 or b == 1 and c == 1)'... "
        if (a == 1 or b == 1 and c == 1): 
            print(testvar + "a is true")
        else: 
            print(testvar + "false")

        testvar = "Testing '(a == 1 or b == 1 and c==1)'... "
        if (a==1 or b==1 and c==1):
            print(testvar + "One of them is true")
        else:
            print(testvar + "false")

        # order of precedence test for and
        testvar = "Testing '(3 != b and 9 == c)'... "
        if (3 != b or 9 == c):
            print(testvar + "true")
        else:
            print(testvar + "false")
    
        # order of precedence test for or
        testvar = "Testing '(9 == c or 3 != b)'... "
        if (9 == c or 3 != b):
            print(testvar + "true")
        else:
            print(testvar + "false")



if __name__ == "__main__":
    cl = ConditionalLogic()
    cl.main()
