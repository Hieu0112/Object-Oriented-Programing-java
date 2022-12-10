
package CodeJava1.MangDoiTuong;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
class InfoSV1{
    private String ma;
    private String name;
    private String lop;
    private Date date;
    private double gpa;
    public InfoSV1(int so,String name,String lop,String date,double gpa)  throws ParseException{
        this.ma="B20DCCN"+String.format("%03d",so);
        this.name=name;
        this.lop=lop;
        this.date=new SimpleDateFormat("dd/MM/yyyy").parse(date);
        this.gpa=gpa;
    }
    public String ChuanHoa(){
        String s=name;
        s=s.trim().toLowerCase();
        s=s.replaceAll("\\s+"," ");
        String[] str=s.split(" ");
        s="";
        for(int i=0;i<str.length;i++){
            s+=String.valueOf(str[i].charAt(0)).toUpperCase()+str[i].substring(1);
            s+=" ";
        }
        return s;
    }
    public String toTring(){
        return ma + " " + ChuanHoa() +" "+ lop + " " + new SimpleDateFormat("dd/MM/yyyy").format(date)+ " " + String.format("%.02f", gpa);
    }
}
public class DanhSachDoiTuongSinhVien1 {
    public static void main(String[] args)  throws ParseException{
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<InfoSV1> a=new ArrayList<>();
        for(int i=1;i<=n;i++){
            InfoSV1 sv=new InfoSV1(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()));
            a.add(sv);
        }
        for(InfoSV1 x:a){
            System.out.println(x.toTring());
        }
    }
}

