/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanHeGiua2Lop;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class KH{
    private String ma,name,gt,ns,dc;

    
    public KH(int ma, String name, String gt, String ns, String dc){
        this.ma = "KH"+String.format("%03d",ma);
        this.name = name;
        this.gt = gt;
        this.ns = ns;
        this.dc = dc;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGt() {
        return gt;
    }

    public void setGt(String gt) {
        this.gt = gt;
    }

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }
    
    
}

class MH{
    private String ma,name,dvt;
    private long mua,ban;

    public MH(int ma, String name, String dvt, long mua, long ban) {
        this.ma ="MH"+String.format("%03d",ma);
        this.name = name;
        this.dvt = dvt;
        this.mua = mua;
        this.ban = ban;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDvt() {
        return dvt;
    }

    public void setDvt(String dvt) {
        this.dvt = dvt;
    }

    public long getMua() {
        return mua;
    }

    public void setMua(long mua) {
        this.mua = mua;
    }

    public long getBan() {
        return ban;
    }

    public void setBan(long ban) {
        this.ban = ban;
    }
    
}

class HoaDon{
    private String ma;
    private KH kh;
    private MH mh;
    private long sl;

    public HoaDon(int ma, KH kh, MH mh, long sl) {
        this.ma = "HD"+String.format("%03d",ma);
        this.kh = kh;
        this.mh = mh;
        this.sl = sl;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public KH getKh() {
        return kh;
    }

    public void setKh(KH kh) {
        this.kh = kh;
    }

    public MH getMh() {
        return mh;
    }

    public void setMh(MH mh) {
        this.mh = mh;
    }

    public long getSl() {
        return sl;
    }

    public void setSl(long sl) {
        this.sl = sl;
    }
    public long loinhuan(){
        return (mh.getBan()-mh.getMua())*sl;
    }
    @Override
    public String toString() {
        return ma+" "+kh.getName()+" "+kh.getDc()+" "+
                mh.getName()+" "+ sl+" "+mh.getBan()*sl+" "+loinhuan();
    }
    
}
public class QuanLyBanHang2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        List<KH>a=new ArrayList<>();
        List<MH>b=new ArrayList<>();
        List<HoaDon>hd=new ArrayList<>();
        int n=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=n;i++)
            a.add(new KH(i, sc.nextLine(), sc.nextLine(), sc.nextLine()
                    , sc.nextLine()));
        
        n=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=n;i++)
            b.add(new MH(i, sc.nextLine(), sc.nextLine(),Long.parseLong(sc.nextLine()),
            Long.parseLong(sc.nextLine())));
        
        n=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=n;i++){
            String maKH=sc.next();
            String maMH=sc.next();
            long sl=Long.parseLong(sc.next());
            HoaDon tmp=new HoaDon(i, a.get(0), b.get(0), sl);
            for (KH s:a) {
                if(s.getMa().equals(maKH)){
                    tmp.setKh(s);
                    break;
                }
            }
            for(MH s1:b){
                if(s1.getMa().equals(maMH)){
                    tmp.setMh(s1);
                    break;
                }
            }
            hd.add(tmp);
        }
        
        Collections.sort(hd,new Comparator<HoaDon>(){
            @Override
            public int compare(HoaDon o1, HoaDon o2) {
                return (int)(o2.loinhuan()-o1.loinhuan());
            }
            
        });
        for (HoaDon hoaDon : hd) {
            System.out.println(hoaDon);
        }
    }
}
