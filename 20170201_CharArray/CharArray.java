import java.util.*;

class CharArray{
  public static void main(String[] args){
    String name = "My test +9";
    // create array (not printable)
    char[] charArray = name.toCharArray();
    // create list
    List<Character> listChars = new ArrayList<Character>();
    // loop over 'array' and add characters to 'list'
    for (char c : charArray){
      listChars.add(c);
    }
    // print
    System.out.println(listChars);
  }
}
