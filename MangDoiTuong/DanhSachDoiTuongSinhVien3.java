package CodeJava1.MangDoiTuong;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.*;

class Info3{
    private String ma;
    private String name;
    private String lop;
    private Date date;
    private double gpa;
    private SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
    public Info3(int so,String name,String lop,String date,double gpa)  throws ParseException{
        this.ma="B20DCCN"+String.format("%03d",so);
        this.name=name;
        this.lop=lop;
        this.date=sdf.parse(date);
        this.gpa=gpa;
    }

    public double getGpa() {
        return gpa;
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
        return ma + " " + ChuanHoa() +" "+ lop + " " + sdf.format(date)+ " " + String.format("%.02f", gpa);
    }
}
public class DanhSachDoiTuongSinhVien3 {
    public static void main(String[] args)  throws ParseException{
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<Info3> a=new ArrayList<>();
        for(int i=1;i<=n;i++){
            Info3 sv=new Info3(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()));
            a.add(sv);
        }
        Collections.sort(a,Comparator.comparingDouble(Info3::getGpa).reversed());
        for(Info3 x:a){
            System.out.println(x.toTring());
        }
    }
}

