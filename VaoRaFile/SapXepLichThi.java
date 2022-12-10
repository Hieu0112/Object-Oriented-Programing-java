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

/**
 *
 * @author trinh
 */
class MonThiIn{
    private String ma,mon,hinhthuc;

    public MonThiIn(String ma, String mon, String hinhthuc) {
        this.ma = ma;
        this.mon = mon;
        this.hinhthuc = hinhthuc;
    }

    public String getMa() {
        return ma;
    }

    public String getMon() {
        return mon;
    }

    public String getHinhthuc() {
        return hinhthuc;
    }
    
}
class CaThiIn{
    private Date ngay,gio;
    private String phong;
    String ma;
    SimpleDateFormat sdfd=new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat sdfh=new SimpleDateFormat("HH:mm");

    public CaThiIn(int i,String ngay, String gio, String phong) throws ParseException {
        this.ma="C"+String.format("%03d", i);
        this.ngay = sdfd.parse(ngay);
        this.gio = sdfh.parse(gio);
        this.phong = phong;
    }

    public Date getNgay() {
        return ngay;
    }

    public Date getGio() {
        return gio;
    }

    public String getMa() {
        return ma;
    }
    
    public String getPhong() {
        return phong;
    }
    public String getNgayString() {
        return sdfd.format(ngay);
    }

    public String getGioString() {
        return sdfh.format(gio);
    }
}
class LichThiIn{
    private CaThiIn ct;
    private MonThiIn mt;
    private String manhom,sl;

    public LichThiIn(CaThiIn ct, MonThiIn mt, String manhom, String sl) {
        this.ct = ct;
        this.mt = mt;
        this.manhom = manhom;
        this.sl = sl;
    }

    public CaThiIn getCt() {
        return ct;
    }

    public void setCt(CaThiIn ct) {
        this.ct = ct;
    }

    public MonThiIn getMt() {
        return mt;
    }

    public void setMt(MonThiIn mt) {
        this.mt = mt;
    }

    public String getManhom() {
        return manhom;
    }

    public void setManhom(String manhom) {
        this.manhom = manhom;
    }

    public String getSl() {
        return sl;
    }

    public void setSl(String sl) {
        this.sl = sl;
    }

    @Override
    public String toString() {
        return  ct.getNgayString()+" "+ct.getGioString()+" "+
                ct.getPhong()+" "+mt.getMon()+" "+
                manhom+" "+sl;
    }
}
public class SapXepLichThi {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        List<MonThiIn>l1=new ArrayList<>();
        List<CaThiIn>l2=new ArrayList<>();
        List<LichThiIn>list=new ArrayList<>();
        Scanner sc=new Scanner(new File("MONTHI.in"));
        int n=Integer.parseInt(sc.nextLine());
        while(n-->0){
            l1.add(new MonThiIn(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        sc=new Scanner(new File("CATHI.in"));
        n=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=n;i++){
            l2.add(new CaThiIn(i,sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        sc=new Scanner(new File("LiCHTHI.in"));
        n=sc.nextInt();
        while(n-->0){
            String ma1=sc.next();
            String ma2=sc.next();
            String nhom=sc.next();
            String sl=sc.next();
            LichThiIn tmp=new LichThiIn(l2.get(0),l1.get(0),nhom,sl);
            for(MonThiIn x:l1){
                if(x.getMa().equals(ma2)){
                    tmp.setMt(x);
                    break;
                }
            }
            for(CaThiIn x:l2) {
                if(ma1.equals(x.getMa())){
                    tmp.setCt(x);
                    break;
                }
            }
            for (MonThiIn x:l1) {
                if(x.getMa().equals(ma2)){
                    tmp.setMt(x);
                    break;
                }
            }
            list.add(tmp);
        }
        Collections.sort(list,new Comparator<LichThiIn>(){;

            @Override
            public int compare(LichThiIn o1, LichThiIn o2) {
                if(o1.getCt().getNgay().equals(o2.getCt().getNgay())){
                    return o1.getCt().getGio().after(o2.getCt().getGio())?1:-1;
                }
                else
                    return o1.getCt().getNgay().after(o2.getCt().getNgay())?1:-1;
            }
        });
        
        for (LichThiIn lichThiIn : list) {
            System.out.println(lichThiIn);
        }
    }
}
