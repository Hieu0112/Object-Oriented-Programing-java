
package CodeJava1.VaoRaFile;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.TreeSet;
import java.util.Set;
class WordSet{
    String res="";
    WordSet(String Sourse){
        try {
            Set<String>setA=new TreeSet<>();
            File file=new File(Sourse);
            Scanner sc=new Scanner(file);
            while(sc.hasNext()){
                String token=sc.next();
                setA.add(token.toLowerCase());
            }
            sc.close();
            for(String x:setA){
                res+=x+"\n";
            }
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return res;
    }
    
}
public class LietKeTuKhacNhau {
    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}
