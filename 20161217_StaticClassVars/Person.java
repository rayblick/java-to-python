public class Person{
  private String name;
  private int age;
  static int personCount = 0;

  // empty constructor
  public Person(){
  }

  // constructor
  public Person(String name, int age){
    personCount++;
    this.name = name;
    this.age = age;
  }

  // getter method
  public void getAge(){
    System.out.println(age);
  }

  // Static count accessor
  public void getPersonCount(){
    System.out.println(Person.personCount);
  }
}
