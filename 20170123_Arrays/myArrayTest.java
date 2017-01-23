import java.util.Arrays;
import java.util.stream.Stream;

class myArrayTest{
  public static void main(String[] args){
    // creating a new empty array with 5 slots
    int[] fiveSlotArray= new int[5];
    // check the length of the array
    System.out.println((int)fiveSlotArray.length);
    // assign object to array
    int[] myArray = {1, 2, 3};
    // access element
    System.out.println(myArray[0]);
    // create multiple array
    int[][] measurements = new int[2][2];
    // assign value to multiple array
    measurements[0][0] = 25;
    measurements[1][1] = 52;
    // access element of multiple array
    System.out.println(measurements[0][0]);
    // flatten array
    int[] flatArray = Arrays.stream(measurements)
        .flatMapToInt(Arrays::stream)
        .toArray();
    // print the flattened array
    // note that an array is initialised with zeros
    for(int i=1; i < flatArray.length; i++){
      System.out.println(flatArray[i]);
    }
  }
}

