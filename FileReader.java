import java.io.*;
import java.util.*;

public class FileReader{
  public static void main(String[] args) throws FileNotFoundException{
      File file = new File("filename.txt");
      Scanner reader = new Scanner(file);
      while (reader.hasNextLine()) {
        String x = reader.next();
        String y = reader.next();
      }
  }
}