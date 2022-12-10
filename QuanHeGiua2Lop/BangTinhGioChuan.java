package QuanHeGiua2Lop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class MonHoc{
    private String ma,name;

    public MonHoc(String ma, String name) {
        this.ma = ma;
        this.name = name;
    }
    public MonHoc() {
        this.ma = "";
        this.name = "";
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
    
}
class GiangVien{
    private String maGv,nameGV;

    public GiangVien(String maGv,String nameGV) {
        this.maGv=maGv;
        this.nameGV = nameGV;
    }
    public GiangVien() {
        this.maGv = "";
        this.nameGV = "";
    }
    public String getMaGv() {
        return maGv;
    }

    public String getNameGV() {
        return nameGV;
    }

    public void setNameGV(String nameGV) {
        this.nameGV = nameGV;
    }
}
class QuanLy{
    private String magv,mamon;
    private double so;

    public QuanLy(String magv, String mamon, double so) {
        this.magv = magv;
        this.mamon = mamon;
        this.so = so;
    }

    public String getMagv() {
        return magv;
    }

    public String getMamon() {
        return mamon;
    }

    public double getSo() {
        return so;
    }
    
}   
public class BangTinhGioChuan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<MonHoc>a=new ArrayList<>();
        List<GiangVien>b=new ArrayList<>();
        List<QuanLy>res=new ArrayList<>();
        int n=Integer.parseInt(sc.nextLine());
        while(n-->0){
            String line=sc.nextLine();
            int stt=line.indexOf(" "); 
            a.add(new MonHoc(line.substring(0,stt),line.substring(stt+1)));
        }
        n=Integer.parseInt(sc.nextLine());
        while(n-->0){
            String line=sc.nextLine();
            int stt=line.indexOf(" "); 
            b.add(new GiangVien(line.substring(0,stt),line.substring(stt+1)));
        }
        n=Integer.parseInt(sc.nextLine());
        while(n-->0){
            String maGV=sc.next();
            String mamon=sc.next();
            double time=sc.nextDouble();
            res.add(new QuanLy(maGV, mamon, time));
        }
        for (GiangVien gv:b) {
            double sum=0;
            for (QuanLy re : res) {
                if(gv.getMaGv().equals(re.getMagv())){
                    sum+=re.getSo();
                }
            }
            System.out.println(gv.getNameGV()+" "+String.format("%.2f", sum));
        }       
    }
}
