class FormattingStrings():
    def printString(self):
        n = 14505000
        print(n)
        print("{:,}".format(n))
        print("+{:,}".format(n))



if __name__ == "__main__":
    fs = FormattingStrings()
    fs.printString()
