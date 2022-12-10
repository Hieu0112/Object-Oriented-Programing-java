
package VaoRaFile;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.io.IOException;
import java.util.Date;

class Info{
    private String ma;
    private String name;
    private String Class;
    private Date date;
    private double GPA;
    private SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
    Info(int so,String name,String Class,String date,double GPA) throws ParseException{
        this.ma=String.format("%03d",so);
        this.name=name;
        this.Class=Class;
        this.date=sdf.parse(date);
        this.GPA=GPA;
    }

    @Override
    public String toString() {
        return "B20DCCN"+ma+" "+name+" "+Class+" "+
                sdf.format(date)+" "+String.format("%.02f",GPA);
    }
    
}
public class DanhSachSinhVienTRongFile2 {
    public static void main(String[] args) throws ParseException,IOException{
        File file=new File("SV.in");
        Scanner sc=new Scanner(file);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<Info>list=new ArrayList<>();
        for(int i=1;i<=n;i++){
        list.add(new Info(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine())));
        }
        for(Info x:list)
        System.out.println(x);
    }
}
