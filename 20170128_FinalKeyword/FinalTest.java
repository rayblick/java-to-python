class FinalTest{
  // final variable
  final int MYFINAL = 6;
  // accessor
  void printFinal(){
    System.out.println(MYFINAL);
  }
  // Try to set final - This results in a compilation error
  // you cannot change a variable if it is final 
  void incrementFinal(){
    MYFINAL++;
  }
  // main
  public static void main(String[] args){
    FinalTest ft = new FinalTest();
    ft.printFinal();
    ft.incrementFinal();
  }
}
