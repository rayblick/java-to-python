class myBreakContinueTest{
  public static void main(String[] args){
    // Break statement
    int myCount = 0;
    while (myCount < 10){
      myCount++;
      if (myCount == 5){
        System.out.println("break");
        break;
      }
      System.out.println(myCount);
    }
    // Continue statement
    int myCount2 = 0;
      while (myCount2 < 10){
        myCount2++;
        if (myCount2 == 5){
          System.out.println("Continue");
          continue;
        }
      System.out.println(myCount2);
    }
  }
}


