
package VaoRaFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class SinhVien{
    private String ma,name,lop,mail;

    public SinhVien(String ma, String name, String lop, String mail) {
        this.ma = ma;
        this.name = name.trim();
        this.lop = lop;
        this.mail = mail;
    }

    public SinhVien() {
        this.ma = "";
        this.name = "";
        this.lop = "";
        this.mail = "";
    }
    
    private String ChuanHoa(){
        String s=name.toLowerCase().replaceAll("\\s+"," ");
        String[] tmp=s.split(" ");
        s="";
        for (String string : tmp) {
            String s1=String.valueOf(string.charAt(0)).toUpperCase();
            s=s+s1+string.substring(1)+" ";
        }
        return s.trim();
    }
    public String getMa() {
        return ma;
    }

    public String getName() {
        return ChuanHoa();
    }

    public String getLop() {
        return lop;
    }
    
}
class BangDiem{
    private SinhVien sv;
    private String ma,diem;

    public BangDiem(SinhVien sv, String ma, String diem) {
        this.sv = sv;
        this.ma = ma;
        this.diem = diem;
    }

    public SinhVien getSv() {
        return sv;
    }

    public void setSv(SinhVien sv) {
        this.sv = sv;
    }

    public String getMa() {
        return ma;
    }

    public String getDiem() {
        return diem;
    }

    @Override
    public String toString() {
        return sv.getMa()+" "+sv.getName()+" "+sv.getLop()+" "+diem;
    }
    
}
class MonHoc{
    private String ma,name;
    private int tc;
    private List<BangDiem>bd;

    public MonHoc(String ma, String name, int tc) {
        this.ma = ma;
        this.name = name;
        this.tc = tc;
        this.bd=new ArrayList<>();
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

    public List<BangDiem> getBd() {
        return bd;
    }

    public void setBd(BangDiem bd) {
        this.bd.add(bd);
    }
    
}
public class BangDiemTheoMonHoc {
    public static void main(String[] args) throws Exception {
        List<SinhVien>sv=new ArrayList<>();
        List<BangDiem>bd=new ArrayList<>();
        List<MonHoc>mh=new ArrayList<>();
        Scanner sc=new Scanner(new File("SINHVIEN.in"));
        int n=Integer.parseInt(sc.nextLine());
        while(n-->0){
            sv.add(new SinhVien(sc.nextLine(), sc.nextLine()
                    , sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(sv, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getMa().compareTo(o2.getMa());
            }
            
        });
        sc=new Scanner(new File("BANGDIEM.in"));
        n=sc.nextInt();
        while(n-->0){
            String msv=sc.next();
            String mm=sc.next();
            String gpa=sc.next();
            
            for (SinhVien svx: sv) {
                if(svx.getMa().equalsIgnoreCase(msv)){
                    bd.add(new BangDiem(svx, mm, gpa));
                    break;
                }
            }
        }
        Collections.sort(bd, new Comparator<BangDiem>(){
            @Override
            public int compare(BangDiem o1, BangDiem o2) {
                return Double.compare(Double.parseDouble(o2.getDiem()), Double.parseDouble(o1.getDiem()));
            }
            
        });
        n=sc.nextInt();
        List<String>list_in=new ArrayList<>();
        while(n-->0){
            list_in.add(sc.next());
        }
        sc=new Scanner(new File("MONHOC.in"));
        n=Integer.parseInt(sc.nextLine());
        while(n-->0){
            String ma=sc.nextLine();
            String name=sc.nextLine();
            int tin=Integer.parseInt(sc.nextLine());
            MonHoc a=new MonHoc(ma, name, tin);
            for(BangDiem bdx:bd){
                if(bdx.getMa().equalsIgnoreCase(ma)){
                    a.setBd(bdx);
                }
            }
            mh.add(a);
        }
        for (String string : list_in) {
            for(MonHoc xs:mh){
                if(xs.getMa().equalsIgnoreCase(string)){
                    System.out.println("BANG DIEM MON "+xs.getName()+":");
                    List<BangDiem> bdtmp=xs.getBd();
                    for (BangDiem bangDiem : bdtmp) {
                        System.out.println(bangDiem);
                    }
                }
            }
        }
    }
 
}
