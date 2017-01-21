class StaticClassVars{
  public static void main(String[] args){
    System.out.println("Creating person 1");
    Person p1 = new Person("P1", 10);
    p1.getPersonCount();
    System.out.println("Creating person 2");
    Person p2 = new Person("P2", 5);
    p2.getPersonCount();
    System.out.println("Creating person 3");
    Person p3 = new Person("P3", 2);
    p3.getPersonCount();
  }
}
