class CatchingExceptions{
  public static void main(String[] args){
    // assignment
    int x = 6;
    // divide by zero to generate error
    try{
      double output = x/0;
      // Catch the error
    } catch(Exception e){
      System.out.println("Zero division error");
    }
  }
}
