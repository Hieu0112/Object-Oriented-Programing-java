/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VaoRaFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author trinh
 */
class SanPham{
    private String ma,name;
    private int gia,time;

    public SanPham(String ma, String name, int gia, int time) {
        this.ma = ma;
        this.name = name;
        this.gia = gia;
        this.time = time;
    }

    public String getMa() {
        return ma;
    }

    public String getName() {
        return name;
    }

    public int getGia() {
        return gia;
    }

    public int getTime() {
        return time;
    }

    
}
class KhachHang{
    private String makh,name,dc;
    private SanPham sp;
    private int sl;
    private Date ngaymua;
//    SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
//    Calendar c=Calendar.getInstance();
    private LocalDate ld;
    public KhachHang(int ma, String name, String dc, SanPham sp, int sl,String ngaymua) throws ParseException {
        this.makh = "KH"+String.format("%02d", ma);
        this.name = name;
        this.dc = dc;
        this.sp = sp;
        this.sl = sl;
//        this.ngaymua = sdf.parse(ngaymua);
        this.ld=LocalDate.parse(ngaymua,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public String getMakh() {
        return makh;
    }

    public String getName() {
        return name;
    }

    public SanPham getSp() {
        return sp;
    }
    private int tonhTien(){
        return sl*sp.getGia();
    }
    public LocalDate NgayHetHan(){
        int thang=sp.getTime();
//        c.setTime(ngaymua);
//        c.add(Calendar.MONTH, thang);
//        return c.getTime();
        return ld.plus(thang,ChronoUnit.MONTHS);
    }
    @Override
    public String toString() {
        Month month = NgayHetHan().getMonth();
        int days = NgayHetHan().getDayOfMonth();
        return makh+" "+name+" "+dc+" "+
                sp.getMa()+" "+tonhTien()+" "+
                String.format("%02d/", days) + 
                String.format("%02d/", month.getValue()) + 
                NgayHetHan().getYear();
//                sdf.format(NgayHetHan());
                
    }
    
}
public class TinhNgayHetHanBaoHanh {
    public static void main(String[] args) throws FileNotFoundException,ParseException {
        Scanner sc=new Scanner(new File("MUAHANG.in"));
        List<SanPham>sp=new ArrayList<>();
        List<KhachHang>kh=new ArrayList<>();
        int n=Integer.parseInt(sc.nextLine());
        while(n-->0){
            sp.add(new SanPham(sc.nextLine(),sc.nextLine(), 
                    Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        n=Integer.parseInt(sc.nextLine());
        for (int i = 1; i <=n; i++) {
            String name=sc.nextLine();
            String dc=sc.nextLine();
            String masp=sc.nextLine();
            int sl=Integer.parseInt(sc.nextLine());
            String ngaymua=sc.nextLine();
            for (SanPham x:sp) {
                if(x.getMa().equals(masp)){
                    kh.add(new KhachHang(i, name, dc, x, sl, ngaymua));
                }
            }
        }
        Collections.sort(kh,new Comparator<KhachHang>(){
            @Override
            public int compare(KhachHang o1, KhachHang o2) {
                return o1.NgayHetHan().compareTo(o2.NgayHetHan());
            }
            
        });
        for (KhachHang khachHang : kh) {
            System.out.println(khachHang);
        }
    }
}
