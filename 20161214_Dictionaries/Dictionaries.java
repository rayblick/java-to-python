import java.util.HashMap;

class Dictionaries{
  public static void main(String[] args){
    HashMap hm = new HashMap();
    hm.put("Ray", 12.50);
    System.out.println((Double) hm.get("Ray"));
    System.out.println(hm);
  }
}
