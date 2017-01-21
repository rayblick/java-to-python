import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingTextDoc{
  // set file path
  private static final String FILENAME = "demo.txt";

  public static void main(String[] args){
    try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))){
      System.out.println("Starting");
      String line;
      while ((line = br.readLine()) != null){
        System.out.println(line);
      }
    } catch (IOException e){
    }
  }
}

