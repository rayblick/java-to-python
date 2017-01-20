class FormattingStrings{
  public static void main(String[] args){
    // examples from https://docs.oracle.com/javase/tutorial/java/data/numberformat.html
    long n = 14505000;
    System.out.format("%d%n", n);
    System.out.format("%08d%n", n);
    System.out.format("%+8d%n", n);
    System.out.format("%,8d%n", n);
    System.out.format("%+,8d%n%n", n);
    }
}
