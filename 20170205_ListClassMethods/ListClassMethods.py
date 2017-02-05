class ListClassMethods():
    """
    Note that the getter and setter methods are 
    not considered 'pythonic', I have included 
    them here to match the java example.
    """
    def __init__(self, x):
        self.x = x

    def getX(self):
        print(self.x)

    def setX(self, y):
        self.x = y

    def doubleX(self):
        self.x = self.x * 2

    def zeroX(self):
        self.x = 0

    def printX(self):
        print("This is x: {}".format(self.x))

if __name__ == "__main__":
    from types import FunctionType
    print([x for x, y in ListClassMethods.__dict__.items() if type(y) == FunctionType])
