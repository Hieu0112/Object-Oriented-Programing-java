
package VaoRaFile;

import java.io.File;
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
    private MonHoc mh;
    private String diem;

    public BangDiem() {
    }

    public BangDiem(SinhVien sv, MonHoc mh, String diem) {
        this.sv = sv;
        this.mh = mh;
        this.diem = diem;
    }
    
    public SinhVien getSv() {
        return sv;
    }

    public void setSv(SinhVien sv) {
        this.sv = sv;
    }

    public String getDiem() {
        return diem;
    }

    public void setDiem(String diem) {
        this.diem = diem;
    }

    public MonHoc getMh() {
        return mh;
    }

    public void setMh(MonHoc mh) {
        this.mh = mh;
    }


    @Override
    public String toString() {
        return sv.getMa()+" "+sv.getName()+" "+
                mh.getMa()+" "+mh.getName()+" "+diem;
    }
    
    
}
class MonHoc{
    private String ma,name;
    private int tc;

    public MonHoc() {
        this.ma="";
        this.name="";
        this.tc=0;
    }

    
    public MonHoc(String ma, String name, int tc) {
        this.ma = ma;
        this.name = name;
        this.tc = tc;
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

    @Override
    public String toString() {
        return ma+" "+name+" "+tc;
    }
    
}
public class BangDiemTheoLop {
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
        sc=new Scanner(new File("MONHOC.in"));
        n=Integer.parseInt(sc.nextLine());
        while(n-->0){
            String ma=sc.nextLine();
            String name=sc.nextLine();
            int tin=Integer.parseInt(sc.nextLine());
            mh.add(new MonHoc(ma, name, tin));
        }
        
        sc=new Scanner(new File("BANGDIEM.in"));
        n=sc.nextInt();
        while(n-->0){
            String msv=sc.next();
            String mm=sc.next();
            String gpa=sc.next();
            BangDiem tma=new BangDiem(new SinhVien(),new MonHoc(), gpa);
            for (SinhVien svx: sv) {
                if(svx.getMa().equalsIgnoreCase(msv)){
                    tma.setSv(svx);
                    break;
                }
            }
            System.out.println(mm);
            for(MonHoc xmh:mh){
                if(xmh.getMa().equalsIgnoreCase(mm)){
                    tma.setMh(xmh);
                    break;
                }
            }
            bd.add(tma);
        }
        n=sc.nextInt();
        List<String>list_in=new ArrayList<>();
        while(n-->0){
            list_in.add(sc.next());
        }
        Collections.sort(bd, new Comparator<BangDiem>(){
            @Override
            public int compare(BangDiem o1, BangDiem o2) {
                if(o1.getMh().getMa().equalsIgnoreCase(o2.getMh().getMa()))
                    return o1.getSv().getMa().compareTo(o2.getSv().getMa());
                return o1.getMh().getMa().compareTo(o2.getMh().getMa());
            }
            
        });
        for (String string : list_in) {
            System.out.println("BANG DIEM lop "+string+":");
            for (BangDiem bds:bd) {
                if(bds.getSv().getLop().equalsIgnoreCase(string)){
                    System.out.println(bds);
                }
            }
        }
    }
}
