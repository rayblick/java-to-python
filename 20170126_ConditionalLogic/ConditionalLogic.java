class ConditionalLogic{
  public static void main(String[] args){
    int a = 1, b = 2, c = 3;
    System.out.println("Testing 'and/or' statements'");
    System.out.println("a = 1");
    System.out.println("b = 2");
    System.out.println("c = 3");
    System.out.println("-----");
    // a or b
    System.out.print("Testing '(a==2 || b==2)'... ");
    if (a == 2 || b == 2){
      System.out.println("One of them is true");
    } else{
      System.out.println("false");
    }
    // a and b
    System.out.print("Testing '(a == 2 && b == 2)'... ");
    if (a == 2 && b == 2){
      System.out.println("Both are true");
    }else{
      System.out.println("false");
    }
    // a is true
    System.out.print("Testing '(a == 1 || b == 1 && c==1)'... ");
    if (a == 1 || b==1 && c==1){
      System.out.println("a is true");
    } else{
      System.out.println("false");
    }
    // b and c is true
    System.out.print("Testing '(a == 2 || b == 1 || c == 3)'... ");
    if (a != 2 && b == 2 || c == 2){
      System.out.println("One of them is true");
    } else{
      System.out.println("false");
    }
    // order of precedence test for or
    System.out.print("Testing '((int) 3 != b || (int) 9 == c)'... ");
    if ((int) 3 != b || (int) 9 == c){
      System.out.println("true");
    } else{
      System.out.println("false");
    }
    // order of precedence test for or
    System.out.print("Testing '((int) 9 == c || (int) 3 != b)'... ");
    if ((int) 9 == c || (int) 3 != b){
      System.out.println("true");
    } else{
      System.out.println("false");
    }
  }
}
