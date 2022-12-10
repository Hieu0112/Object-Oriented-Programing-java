
package CodeJava1.MangDoiTuong;
import java.util.*;
public class DanhSachMatHang {
    private String ma,name,donvitinh;
    private long ban,mua,so;

    public DanhSachMatHang(int i, String name,String donvitinh, long mua, long ban) {
        this.so=i;
        this.ma = "MH" +String.format("%03d", i);
        this.name = name;
        this.donvitinh=donvitinh;
        this.ban = ban;
        this.mua = mua;
    }

    public long LoiNhuan() {
        return ban-mua;
    }

    public long getSo() {
        return so;
    }
    
    @Override
    public String toString() {
        return ma + " " + name + " " + donvitinh + " " + mua + " " + ban + " " + LoiNhuan();
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<DanhSachMatHang>list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            list.add(new DanhSachMatHang(i,sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine())));
        }
        Collections.sort(list, Comparator.comparingLong(DanhSachMatHang::LoiNhuan).reversed().thenComparingLong(DanhSachMatHang::getSo));
        for(DanhSachMatHang x:list){
            System.out.println(x.toString());
        }
    }
}
