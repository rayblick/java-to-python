import java.lang.reflect.Method;

public class ListClassMethods{
  public static void main(String[] args){
    MethodsForTesting me = new MethodsForTesting(2);
    Method[] methods = me.getClass().getDeclaredMethods();
      for (Method method : methods) {
        System.out.println(method.getName());
      }
  }
}
