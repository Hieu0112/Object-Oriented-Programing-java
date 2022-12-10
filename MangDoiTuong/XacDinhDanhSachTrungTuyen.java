
package CodeJava1.MangDoiTuong;
import java.util.*;
class TrungTuyen{
    private String ma,name,Loai;
    private double a,b,c,ut;

    public TrungTuyen(String ma, String name, double a, double b, double c) {
        this.ma = ma;
        this.name = name;
        this.a = a;
        this.b = b;
        this.c = c;
        if(ma.charAt(2)=='1')
            this.ut=0.5;
        else if(ma.charAt(2)=='2')
            this.ut=1;
        else 
            this.ut=2.5;
    }
    private String ChuanHoa(double x){
        double so=(double)((int)x);
        if(so-x==0)
            return String.format("%.0f",x);
        else
            return String.format("%.1f",x);
    }
    public double Diem(){
        return 2*a+b+c+ut;
    }

    public void setLoai(String Loai) {
        this.Loai = Loai;
    }
    
    @Override
    public String toString() {
        return ma+ " "+ name+" "+ChuanHoa(ut)+" "+ChuanHoa(Diem())+" "+Loai;
    }
    
}
public class XacDinhDanhSachTrungTuyen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<TrungTuyen>list=new ArrayList<>();
        int n=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=n;i++){
            list.add(new TrungTuyen(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        int so=Integer.parseInt(sc.nextLine());
        Collections.sort(list, Comparator.comparingDouble(TrungTuyen::Diem).reversed());
        double Diem=list.get(so-1).Diem();
        System.out.println(Diem);
        for(TrungTuyen x:list){
            if(x.Diem()>=Diem){
                x.setLoai("TRUNG TUYEN");
            }
            else 
                x.setLoai("TRUOT");
            System.out.println(x);
        }
    }
}
