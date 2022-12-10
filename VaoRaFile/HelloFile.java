
package CodeJava1.VaoRaFile;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class HelloFile {
    public static void main(String[] args) throws IOException{
        try{
            File file= new File("Hello.txt");
            Scanner sc= new Scanner(file);
            while(sc.hasNext()){
                String line =sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        
    }
}
