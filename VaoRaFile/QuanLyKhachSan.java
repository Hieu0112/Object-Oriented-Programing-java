
package VaoRaFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class InfoKS{
    private String KHloai,TenLoai;
    private double giangay,phiphucvu;

    public InfoKS(String KHloai, String TenLoai, double giangay, double phiphucvu) {
        this.KHloai = KHloai;
        this.TenLoai = TenLoai;
        this.giangay = giangay;
        this.phiphucvu = phiphucvu;
    }

    public String getKHloai() {
        return KHloai;
    }
    public String getTenLoai() {
        return TenLoai;
    }
    public double getGiangay() {
        return giangay;
    }

    public double getPhiphucvu() {
        return phiphucvu;
    }
    
}
class HoaDon{
    private String ma,name,maphong;
    private InfoKS ks;
    private Date den,di;
    SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");

    public HoaDon(int ma, String name, String maphong,InfoKS ks, String den, String di) throws ParseException {
        this.ma ="KH"+String.format("%02d", ma);
        this.name = name;
        this.maphong=maphong;
        this.ks = ks;
        this.den = sdf.parse(den);
        this.di = sdf.parse(di);
    }
    public int soNgay(){
        long time=di.getTime()-den.getTime();
        time/=1000;
        long ngay=TimeUnit.DAYS.convert(time, TimeUnit.SECONDS);
        return (int)ngay;
    }
    public double giamgia(){
        if(soNgay()>=30)
            return 0.06;
        else if(soNgay()>=20)
            return 0.04;
        else if(soNgay()>=10)
            return 0.02;
        return 0;
    }
    public double TongTien(){
        int ngay=soNgay();
        if(ngay==0)
            ngay++;
        double tien=ks.getGiangay()*(double)ngay;
        tien=tien+tien*ks.getPhiphucvu();
        double giamgia=tien-tien*giamgia();
        return giamgia;
    }
    @Override
    public String toString() {
        return ma+" "+name+" "+maphong+" "+soNgay()+" "+
                String.format("%.2f", TongTien());
    }
    
}
public class QuanLyKhachSan {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        List<InfoKS>l1=new ArrayList<>();
        List<HoaDon>l2=new ArrayList<>();
        Scanner sc=new Scanner(new File("DATA.in"));
        int n=Integer.parseInt(sc.nextLine());
        while(n-->0){
            String[] tokens=sc.nextLine().split("\\s+");
            l1.add(new InfoKS(tokens[0], tokens[1], 
                    Double.parseDouble(tokens[2]), Double.parseDouble(tokens[3])));
        }
        n=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=n;i++){
            InfoKS tmp=l1.get(0);
            String name=sc.nextLine();
            String ma=sc.nextLine();
            String den=sc.nextLine();
            String di=sc.nextLine();
            String KHieu=""+ma.charAt(2);
            for (InfoKS x:l1) {
                if(x.getKHloai().equals(KHieu)){
                    tmp=x;
                    break;
                }
            }
            l2.add(new HoaDon(i, name, ma, tmp, den, di));
        }
        Collections.sort(l2,Comparator.comparing(HoaDon::soNgay).reversed());
        for (HoaDon hoaDon : l2) {
            System.out.println(hoaDon);
        }
    }
}

