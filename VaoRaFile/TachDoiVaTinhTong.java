
package CodeJava1.VaoRaFile;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class TachDoiVaTinhTong {
    public static void main(String[] args) throws IOException{
        try {
            File file=new File("DATA.in");
            Scanner sc=new Scanner(file);
            String s=sc.next();
            while(s.length()>=2){
                int l=s.length()/2;
                BigInteger so=new BigInteger(s.substring(0, l)).add(new BigInteger(s.substring(l)));
                s=String.valueOf(so);
                System.out.println(s);
            }
            sc.close();
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
