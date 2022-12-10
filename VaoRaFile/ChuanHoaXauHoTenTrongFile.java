
package VaoRaFile;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
public class ChuanHoaXauHoTenTrongFile {
    public static void main(String[] args) throws IOException{
        try{
            File file=new File("DATA.in");
            Scanner sc=new Scanner(file);
            while(sc.hasNextLine()){
                String s=sc.nextLine();
                if(s.equals("END")) break;
                s=s.trim().toLowerCase();
                s=s.replaceAll("\\s+"," ");
                String[] str=s.split(" ");
                s="";
                for(int i=0;i<str.length;i++){
                    s+=String.valueOf(str[i].charAt(0)).toUpperCase()+str[i].substring(1);
                    s+=" ";
                }
                System.out.println(s);
            }
            sc.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
