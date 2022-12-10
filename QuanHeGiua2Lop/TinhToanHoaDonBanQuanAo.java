package QuanHeGiua2Lop;
import java.util.*;

class SanPham{
    private String ma, ten;
    private long loai1, loai2;

    public SanPham(String ma, String ten, long loai1, long loai2) {
        this.ma = ma;
        this.ten = ten;
        this.loai1 = loai1;
        this.loai2 = loai2;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public long getLoai1() {
        return loai1;
    }

    public void setLoai1(long loai1) {
        this.loai1 = loai1;
    }

    public long getLoai2() {
        return loai2;
    }

    public void setLoai2(long loai2) {
        this.loai2 = loai2;
    }
    
}
class HoaDon{
    private String ma,ten;
    private long sl,gia;
    public HoaDon() {
    }

    public HoaDon(int i,String ma, String ten, long sl,long gia) {
        this.ma = ma + "-" + String.format("%03d", i);
        this.ten=ten;
        this.sl = sl;
        this.gia=gia;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public long getSl() {
        return sl;
    }

    public void setSl(long sl) {
        this.sl = sl;
    }

    public long getGia() {
        return gia;
    }

    public void setGia(long gia) {
        this.gia = gia;
    }
    private long giamgia(){
        long tongtien=sl*gia;
        long gg=0;
        if(sl>=150) 
            gg=tongtien*50/100;
        else if
            (sl>=100) gg=tongtien*30/100;
        else if(sl>=50) 
            gg=tongtien*15/100;
        return gg;
    }
    private long tratien(){
        return sl*gia-giamgia();
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + giamgia() + " " + tratien();
    }
    
}
public class TinhToanHoaDonBanQuanAo{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        List<SanPham> a = new ArrayList<>();
        List<HoaDon> b = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n-->0)
            a.add(new SanPham(sc.nextLine(), sc.nextLine(), 
                    Long.parseLong(sc.nextLine()), 
                    Long.parseLong(sc.nextLine())));
        
        n = Integer.parseInt(sc.nextLine());
        for(int i=1;i<=n;i++){
            String[] tokens=sc.nextLine().split("\\s+");
            long sl=Long.parseLong(tokens[1]);
            String ma=tokens[0];
            String masp=ma.substring(0,2);
            int loaiSP=Integer.parseInt(ma.substring(2));
            long giasp=0;
            String tensp="";
            for (SanPham x:a) {
                if(x.getMa().equals(masp)){
                    tensp=x.getTen();
                    if(loaiSP==1)
                        giasp=x.getLoai1();
                    else
                        giasp=x.getLoai2();
                    break;
                }
            }
            b.add(new HoaDon(i, ma, tensp, sl, giasp));
        }
        for (HoaDon hoaDon : b) {
            System.out.println(hoaDon);
        }
    }
}