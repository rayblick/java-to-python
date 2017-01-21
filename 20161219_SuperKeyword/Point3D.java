import java.awt.*;

public class Point3D extends Point{
  // create var
  public int z;

  // constructor
  public Point3D(int x, int y, int z){
    super(x, y);
    this.z = z;
    }
  // move method using SUPER
  public void move(int x, int y, int z){
    this.z = z;
    super.move(x, y);
    }

  // getter method
  public void getPoints(){
    System.out.println("x= " + x + " y= " + y + " z= " + z);
   }
}

