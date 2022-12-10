
package MangDoiTuong;
import java.util.*;
class XangDau{
    private String ma;
    private long gia;
    private double thue;
    private String hang;
    private long sl;

    public XangDau(String ma, long sl) {
        this.ma = ma;
        if(ma.charAt(0)=='X'){
            this.gia=128000;
            this.thue=0.03;
        }
        else if(ma.charAt(0)=='D'){
            this.gia=11200;
            this.thue=0.035;
        }
        else if(ma.charAt(0)=='N'){
            this.gia=9700;
            this.thue=0.02;
        }
        if(ma.contains("BP"))
            this.hang="British Petro";
        else if(ma.contains("ES"))
            this.hang="Esso";
        else if(ma.contains("SH"))
            this.hang="Shell";
        else if(ma.contains("CA"))
            this.hang="Castrol";
        else if(ma.contains("MO"))
            this.hang="Mobil";
        else{
            this.thue=0;
            this.hang="Trong Nuoc";
        }
        this.sl = sl;
    }

    public long getGia() {
        return gia*sl;
    }
    
    public long getThue() {
        return Math.round(thue*getGia());
    }

    public long full() {
        return getGia()+getThue();
    }
    
    @Override
    public String toString() {
        return ma+" "+hang+" "+gia+" "+getThue()+" "+full();
    }
    
}
public class SapXepBangGiaXangDau {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<XangDau>list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            list.add(new XangDau(sc.next(), sc.nextLong()));
        }
        Collections.sort(list, Comparator.comparingLong(XangDau::full).reversed());
        for(XangDau x:list){
            System.out.println(x);
        }
    }
}
