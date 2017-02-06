public class CustomExceptions{
  /**
  *Implement MyException created in the file called
  * MyException.java.
  */
  static void testMethod(int x) throws MyException{
    if(x < 0)
      throw new MyException("bad bad error");
    else
      System.out.print("input valid");
  }

  public static void main(String[] args){
    // use a try catch statement to catch the 
    // exception defined in testMethod
    try {
       testMethod(-14);
    }
    catch (MyException e) {
      e.printStackTrace();
    }
  }
}
