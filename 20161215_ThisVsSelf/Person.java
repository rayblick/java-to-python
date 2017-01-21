public class Person{
  private String name;
  private int age;
  // empty constructor
  public Person(){
  }
  // constructor
  public Person(String name, int age){
    this.name = name;
    this.age = age;
  }
  // getter method
  public void getAge(){
    System.out.println(age);
  }
}
