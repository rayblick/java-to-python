import java.util.concurrent.TimeUnit;

class MySleepTest{
  /*
  A simple test of the sleep method.
  Adds 3 seconds to each iteration.
  */
  public static void main(String[] args){
    /*
    Main function executes a hile loop.
    It should take just over 12 seconds.
    */
    // start time
    long startTime = System.currentTimeMillis();
    // Set start value
    int value = 0;
    // iterate up to four
    while(value < 4){
      System.out.println("Increasing value to " + value);
      // SLEEP METHOD
      try{
        TimeUnit.SECONDS.sleep(3);
      } catch(InterruptedException e){
        // ignore
      }
      // increase value
      value++;
    }
    // end time
    long endTime = System.currentTimeMillis();
    long duration = (endTime - startTime);
    System.out.println("total time taken = " + (duration/1000.00));
  }
}
