
package MangDoiTuong;
import java.util.*;
class BangDiem1{
    private String ma,ten,lop;
    private double a,b,c;

    public BangDiem1(String ma, String ten, String lop, double a, double b, double c) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getMa() {
        return ma;
    }
    public String Diem(double x){
        double so=(double)Math.round(x*100)/100;
        return String.format("%.1f",so);
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+lop+" "+a+" "+b+" "+c;
    }
}
public class BangDiemThanhPhan1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<BangDiem1>list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            list.add(new BangDiem1(sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(list, Comparator.comparing(BangDiem1::getMa));
        for(int i=0;i<list.size();i++){
            System.out.println(i+1+" "+list.get(i));
        }
    }
}
