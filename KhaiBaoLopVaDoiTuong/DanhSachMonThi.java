
package CodeJava1.KhaiBaoLopVaDoiTuong;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class MonThi{
    private String ma,name,Thi;

    public MonThi(String ma, String name, String Thi) {
        this.ma = ma;
        this.name = name;
        this.Thi = Thi;
    }

    public String getMa() {
        return ma;
    }
    
    @Override
    public String toString() {
        return ma+" "+name+" "+Thi;
    }
    
}
public class DanhSachMonThi {
    public static void main(String[] args) throws IOException{
        try {
            File file=new File("MONHOC.in");
            Scanner sc=new Scanner(file);
            int n=Integer.parseInt(sc.nextLine());
            ArrayList<MonThi>list=new ArrayList<>();
            while(sc.hasNextLine()){
                list.add(new MonThi(sc.nextLine(),sc.nextLine(),sc.nextLine()));
            }
            Collections.sort(list, Comparator.comparing(MonThi::getMa));
            for(MonThi x:list){
                System.out.println(x);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
