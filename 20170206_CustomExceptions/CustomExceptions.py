class MyException(Exception):
    # inherit from base class Exception
    def __init__(self, err):
        self.errors = err


if __name__ == "__main__":
    try:
        # force exception to occur
        raise MyException("bad bad error")   
    except MyException as e:
        print("except block")
        print(e.errors)
       
      
