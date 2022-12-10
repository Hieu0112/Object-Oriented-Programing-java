package VaoRaFile;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Ten{
    private String ten,ho,tendem;
    public Ten(String ho,String tendem, String ten){
        this.ten = ten;
        this.ho = ho;
        this.tendem = tendem;
    }
    
    public String getTen(){
        return ten;
    }
    public String getHo(){
        return ho;
    }
    public String getTenDem(){
        return tendem;
    }
    @Override
    public String toString(){
        return ho+" "+tendem+ten;
    }
}
public class ChuanHoaVaSapXep {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        
        
            File f = new File("DANHSACH.in");
            Scanner sc = new Scanner(f);
            ArrayList<Ten> ls = new ArrayList<>();
            while(sc.hasNextLine()){
                String ten = sc.nextLine();
                ten = ten.trim().toLowerCase();
                String[] token = ten.split("\\s+");
                String res="";
                for(String x:token){
                    res = res+ x.substring(0,1).toUpperCase()+x.substring(1)+" ";
                }
                res = res.trim();
                String[] tokens = res.split(" ");
                ten = tokens[tokens.length-1];
                String ho  = tokens[0];
                String td="";
                for(int i = 1; i < tokens.length-1; i++){
                    td = td + tokens[i]+" ";
                }
                String tendem = td;
//                System.out.print(res.trim());
                ls.add(new Ten(ho,tendem,ten));
            }
            Collections.sort(ls,Comparator.comparing(Ten::getTen).thenComparing(Ten::getHo).thenComparing(Ten::getTenDem));
            for(Ten x: ls) System.out.println(x);
        }
       
    
}
