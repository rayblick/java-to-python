// create class that has 5 methods
public class MethodsForTesting{
  private int x;

  // constructor
  MethodsForTesting(int x){
      this.x = x;
    }
  // methods
  public void getX(){
    System.out.println(this.x);
  }
  public void setX(int y){
    this.x = y;
  }
  public void doubleX(){
    this.x = this.x * 2;
  }
  public void zeroX(){
    this.x = 0;
  }
  public void printX(){
    System.out.println("This is x: " + this.x);
  }
}

