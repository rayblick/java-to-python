import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ReTest{
  public static void main(String[] args){
    String email = "Testing@gmail.com";
    String pattern;
    pattern = "(.*)(\\@)(.*)";
    Pattern r = Pattern.compile(pattern);
    Matcher m = r.matcher(email);
    if (m.find()) {
      System.out.println("Found value: " + m.group(0) );
      System.out.println("Found value: " + m.group(1) );
      System.out.println("Found value: " + m.group(2) );
      System.out.println("Found value: " + m.group(3) );
    } else {
      System.out.println("No match found");
      }
    }
}
