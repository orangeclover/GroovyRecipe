/* java だと
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileSample {
   public static void main(String[] args) {
      BufferedReader bufferFile = null;
      try {
         bufferFile = new BufferedReader(new FileReader("../test/input/readLine.txt"));
          while(true){
             String line = null;
             line = bufferFile.readLine();
             if(line == null){
                 break;
             }
             System.out.println("line:"  + line);

          }
      } catch(FileNotFoundException e) {
         e.printStackTrace();
      } catch(IOException e) {
         e.printStackTrace();
      } finally {
         if(bufferFile != null) {
            try {
               bufferFile.close();
            } catch(IOException e) {
               e.printStackTrace();
            }
         }
      }
   }
}

*/

f = new File("../test/input/readLine.txt")
f.eachLine{line->
    println "line: ${line}"
}
