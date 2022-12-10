
package VaoRaFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class MonHoc{
    private String ma,name;

    public MonHoc() {
        this.ma="";
        this.name="";
    }

    public MonHoc(String a) {
        String[]tmp=a.trim().split("\\s+");
        String namea="";
        for(int i=1;i<tmp.length;i++)
            namea+=tmp[i]+" ";
        this.ma = tmp[0];
        this.name = namea.trim();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getMa() {
        return ma;
    }

    public String getName() {
        return name;
    }
}
class GiangVien{
    private String ma,name;

    public GiangVien() {
        this.ma="";
        this.name="";
    }
    
    public GiangVien(String a) {
        String[]tmp=a.trim().split("\\s+");
        String namea="";
        for(int i=1;i<tmp.length;i++)
            namea+=tmp[i]+" ";
        this.ma = tmp[0];
        this.name = namea.trim();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getMa() {
        return ma;
    }

    public String getName() {
        return name;
    }
}
class GioChuan{
    private List<MonHoc> mh;
    private GiangVien gv;
    private List<Double> giochuan;

    public GioChuan(GiangVien gv) {
        this.mh = new ArrayList<>();
        this.gv = gv;
        this.giochuan = new ArrayList<>();
    }

    
    public GioChuan(List<MonHoc> mh, GiangVien gv, List<Double> giochuan) {
        this.mh = mh;
        this.gv = gv;
        this.giochuan = giochuan;
    }

    public void setMh(MonHoc mh) {
        this.mh.add(mh);
    }

    public void setGiochuan(double giochuan) {
        this.giochuan.add(giochuan);
    }

    public GiangVien getGv() {
        return gv;
    }
    public double tonggio() {
        double stime=0;
        for (double x:giochuan) {
            stime+=x;
        }
        return stime;
    }

    @Override
    public String toString() {
        return gv.getName()+" "+String.format("%.2f",tonggio());
    }
    
}
public class TinhGioChuan {
    public static void main(String[] args) throws FileNotFoundException {
        List<MonHoc> lmh=new ArrayList();
        List<GiangVien> lgv=new ArrayList();
        List<GioChuan> lgc=new ArrayList();
        Scanner sc=new Scanner(new File("MONHOC.in"));
        int n=Integer.parseInt(sc.nextLine());
        while(n-->0){
            lmh.add(new MonHoc(sc.nextLine()));
        }
        
        sc=new Scanner(new File("GIANGVIEN.in"));
        n=Integer.parseInt(sc.nextLine());
        while(n-->0){
            lgv.add(new GiangVien(sc.nextLine()));
        }
        
        sc=new Scanner(new File("GIOCHUAN.in"));
        n=Integer.parseInt(sc.nextLine());
        while(n-->0){
            String[]tmp=sc.nextLine().split("\\s+");
            MonHoc x=new MonHoc();
            GiangVien y=new GiangVien();
            boolean ok=true;
            for(GiangVien x1:lgv){
                if(x1.getMa().equalsIgnoreCase(tmp[0])){
                    y.setMa(x1.getMa());
                    y.setName(x1.getName());
                    break;
                }
            }
            
            for(MonHoc x1: lmh){
                if(x1.getMa().equalsIgnoreCase(tmp[1])){
                    x.setMa(x1.getMa());
                    x.setName(x1.getName());
                    break;
                }
            }
            
            double so=Double.parseDouble(tmp[2]);
            for (GioChuan gc:lgc) {
                if(gc.getGv().getMa().equals(y.getMa())){
                    gc.setMh(x);
                    gc.setGiochuan(so);
                    ok=false;
                    break;
                }
            }
            if(ok){
                GioChuan gcs=new GioChuan(y);
                gcs.setGiochuan(so);
                gcs.setMh(x);
                lgc.add(gcs);
            }
        }
        for (GioChuan gioChuan : lgc) {
            System.out.println(gioChuan);
        }  
    }
}
