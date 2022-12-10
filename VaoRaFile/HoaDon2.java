package VaoRaFile;
import java.io.File;
import java.util.*;

class MH{
    private String maMH, tenMH, dvtinh;
    
    private long mua, ban;

    public String getMaMH() {
        return maMH;
    }

    public String getTenMH() {
        return tenMH;
    }

    public String getDvtinh() {
        return dvtinh;
    }

    public long getMua() {
        return mua;
    }

    public long getBan() {
        return ban;
    }
    public MH(int i, String ten, String dv, long  a, long b){
        this.maMH = "MH" + String.format("%03d", i);
        this.tenMH = ten;
        this.dvtinh = dv;
        this.mua = a;
        this.ban = b;
    }
}
class KH{
    private String maKH, tenKH, dc;

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }
    
    public KH(int i, String ten, String gt, String ns, String dc){
        this.maKH = "KH"+String.format("%03d", i);
        this.tenKH = ten;
        this.dc = dc;
    }
}
class HD{
    private String maHD, tenKH, dc, tenMH, dv;
    private long soluong, tien, mua, ban;

    public HD(int i, String tenKH, String dc, String tenMH, String dv, long soluong, long mua, long ban) {
        this.maHD = "HD" + String.format("%03d", i);
        this.tenKH = tenKH;
        this.dc = dc;
        this.tenMH = tenMH;
        this.dv = dv;
        this.soluong = soluong;
        this.mua = mua;
        this.ban = ban;
        this.tien = ban * soluong;
    }


    @Override
    public String toString(){
        return maHD + " " + tenKH + " " + dc + " " + tenMH + " " + dv + " " + mua + " " + ban + " " + soluong + " " + tien;
    }
}
public class HoaDon2{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("KH.in"));
        Scanner sc1 = new Scanner(new File("MH.in"));
        Scanner sc2 = new Scanner(new File("HD.in"));
        int n = sc.nextInt();
        ArrayList<KH> a = new ArrayList<>();
        ArrayList<MH> b = new ArrayList<>();
        ArrayList<HD> c = new ArrayList<>();
        sc.nextLine();
        for(int i = 1; i <= n; i++)
            a.add(new KH(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        int m = Integer.parseInt(sc1.nextLine());
        for(int i = 1; i <= m; i++)
            b.add(new MH(i, sc1.nextLine(), sc1.nextLine(), Long.parseLong(sc1.nextLine()), Long.parseLong(sc1.nextLine())));
        int k = sc2.nextInt();
        for(int i = 1; i <= k; i++){
            String s1 = sc2.next(), s2 = sc2.next();
            long soluong = sc2.nextInt();
            int x = Integer.parseInt(s1.substring(2)), y = Integer.parseInt(s2.substring(2));
            c.add(new HD(i, a.get(x-1).getTenKH(), a.get(x-1).getDc(), b.get(y-1).getTenMH(), b.get(y-1).getDvtinh(), soluong, b.get(y-1).getMua(), b.get(y-1).getBan()));
        }
        for(HD s : c)
            System.out.println(s);
    }
}
