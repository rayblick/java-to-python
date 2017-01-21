import java.util.StringTokenizer;
class SplittingStrings{
  public static void main(String[] args){
    StringTokenizer stl;
    String email = "Testing@gmail.com";
    stl = new StringTokenizer(email, "@");
    System.out.println("Token 1: " + stl.nextToken());
    System.out.println("Token 2: " + stl.nextToken());
    }
}
