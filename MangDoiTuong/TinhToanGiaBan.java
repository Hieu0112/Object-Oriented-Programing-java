
package CodeJava1.MangDoiTuong;
import java.util.*;
class SanPhamBan{
    private String ma;
    private long dg,sl;
    private double mst,pvc;
    public SanPhamBan(String ma, long dg, long sl) {
        this.ma = ma;
        this.dg = dg;
        this.sl = sl;
        if(ma.charAt(0)=='T'){
            this.mst=0.29;
            this.pvc=0.04;
        }
        else if(ma.charAt(0)=='C'){
            this.mst=0.1;
            this.pvc=0.03;
        }
        else if(ma.charAt(0)=='D'){
            this.mst=0.08;
            this.pvc=0.025;
        }
        else{
            this.mst=0.02;
            this.pvc=0.005;
        }
        if(ma.charAt(ma.length()-1)=='C'){
            this.mst=this.mst*0.95;
        }
    }

    private String Tien() {
        double x= mst+pvc+1.0;
        double y=(double)(dg*sl);
        return String.format("%.2f",x*y*1.2/sl);
    }

    @Override
    public String toString() {
        return ma + " " + Tien();
    }
    
    
    
}
public class TinhToanGiaBan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<SanPhamBan>list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            String[] Line=sc.nextLine().split("\\s+");
            list.add(new SanPhamBan(Line[0],Long.parseLong(Line[1]),Long.parseLong(Line[2])));
        }
        for(SanPhamBan x:list){
            System.out.println(x);
        }
    }
}
