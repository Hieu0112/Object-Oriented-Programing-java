
package VaoRaFile;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
public class DocFileVanBan {
    public static void main(String[] args) throws IOException{
        try{
            File file=new File("DATA.in");
            Scanner sc=new Scanner(file);
            while(sc.hasNext()){
                String line=sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
