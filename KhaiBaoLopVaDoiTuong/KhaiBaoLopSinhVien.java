
package CodeJava1.KhaiBaoLopVaDoiTuong;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
class Info{
    private String name;
    private String Class;
    private Date date;
    private double GPA;
    private SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
    Info(String name,String Class,String date,double GPA) throws ParseException{
        this.name=name;
        this.Class=Class;
        this.date=sdf.parse(date);
        this.GPA=GPA;
    }

    @Override
    public String toString() {
        return "B20DCCN001"+" "+name+" "+Class+" "+
                sdf.format(date)+" "+String.format("%.02f",GPA);
    }
    
}
public class KhaiBaoLopSinhVien {
    public static void main(String[] args) throws ParseException{
        Scanner sc=new Scanner(System.in);
        Info SV=new Info(sc.nextLine(),sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()));
        System.out.println(SV.toString());
    }
}
