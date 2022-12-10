
package KhaiBaoLopVaDoiTuong;
import java.util.Scanner;
class Info{
    private String name;
    private String birthday;
    private double Mon1;
    private double Mon2;
    private double Mon3;
    public Info(String name,String birthday,double Mon1,double Mon2,double Mon3){
        this.name=name;
        this.birthday=birthday;
        this.Mon1=Mon1;
        this.Mon2=Mon2;
        this.Mon3=Mon3;
    }
    public String getName(){
        return name;
    }
    public String getBirthday(){
        return birthday;
    }
    public double Tong(){
        return Mon1+Mon2+Mon3;
    }
}
public class KhaiBaoLopThiSinh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        double c=sc.nextDouble();
        double d=sc.nextDouble();
        double e=sc.nextDouble();
        Info sv=new Info(a,b,c,d,e);
        System.out.print(sv.getName()+ " "+ sv.getBirthday()+ " ");
        System.out.format("%.1f",sv.Tong());
    }
}
