
package javaproblem1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;


public class javaproblem4 {
    String fileName;
 public static void main(String[] args) throws IOException
    {
      
      List<String> lst = Files.readAllLines(new File("src/text.txt").toPath());
      
      for(int i=0;i<lst.size();i++){
          System.out.println(lst.get(i));
      }
    }
}


