
package CodeJava1.MangDoiTuong;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
class InfoTK{
    private int so;
    private String name;
    private String date;
    private double mon1,mon2,mon3;
    public InfoTK(int so, String name, String date, double mon1, double mon2, double mon3){
        this.so = so;
        this.name = name;
        this.date = date;
        this.mon1 = mon1;
        this.mon2 = mon2;
        this.mon3 = mon3;
    }

    public double getdiem() {
        return mon1+mon2+mon3;
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
        return so + " " + ChuanHoa() + " " + date + " " + getdiem();
    }
}
public class TimThuKhoaKyThi {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<InfoTK> a=new ArrayList<>();
        for(int i=1;i<=n;i++){
            InfoTK sv=new InfoTK(i,sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()));
            a.add(sv);
        }
        Collections.sort(a, Comparator.comparingDouble(InfoTK::getdiem));
        double MAX=a.get(a.size()-1).getdiem();
        for(InfoTK x:a){
            if(x.getdiem()==MAX)
                System.out.println(x.toTring());
        }
    }
}

