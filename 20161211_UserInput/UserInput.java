import java.util.Scanner;
import java.util.stream.*;

class UserInput{
  public static void main(String[] args){
    // create scanner
    Scanner in = new Scanner(System.in);
    // create array
    double[] myList = new double[5];
    // loop five times and enter values
    for(int i=0; i<5; i++){
      // ask for user input
      System.out.print("Enter value: " );
      // add value to array
      myList[i] = in.nextDouble();
     }
     // sum and round to 2 decimal places
     double sum = DoubleStream.of(myList).sum();
     System.out.printf("The sum is %5.2f", sum);
    }
}

