
package VaoRaFile;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class TinhTong {
    public static boolean isNumeric(String str){
        if(str.length()>=10)    return false;
    for (char c : str.toCharArray())
        {
        if (!Character.isDigit(c)) return false;
        }
    return true;
    }
    public static void main(String[] args) throws IOException{
        try{
            long sum=0;
            File file =new File("DATA.in");
            Scanner sc=new Scanner(file);
            while(sc.hasNext()){
                String token=sc.next();
                if(isNumeric(token))
                    sum+=Integer.parseInt(token);
            }
            System.out.println(sum);
            sc.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
