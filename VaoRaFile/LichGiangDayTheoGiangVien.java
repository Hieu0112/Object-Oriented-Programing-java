package VaoRaFile;

import java.io.File;
import java.util.*;

class MH{
    public String ma, ten, tin;
    public MH(String ma, String ten, String tin){
        this.ma = ma;
        this.ten = ten;
        this.tin = tin;
    }
}
class GD{
    private String maNhom, maMon, GV, phong, tenMon;
    private int thu, kip;
    public GD(int i, String ma, int thu, int kip, String ten, String phong){
        this.maNhom = "HP" + String.format("%03d", i);
        this.maMon = ma;
        this.thu = thu;
        this.kip = kip;
        this.GV = ten;
        this.phong = phong;
        this.tenMon = "";
    }
    public void set(String a){
        this.tenMon = a;
    }
    public int getthu(){
        return thu;
    }
    public String getname(){
        return GV;
    }
    public String getma(){
        return maMon;
    }
    public int getkip(){
        return kip;
    }
    @Override
    public String toString(){
        return maNhom + " " + tenMon + " " + thu + " " + kip + " " + phong;
    }
}
public class LichGiangDayTheoGiangVien{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MH> a = new ArrayList<>();
        ArrayList<GD> b = new ArrayList<>();
        while(n-- > 0)
            a.add(new MH(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        sc = new Scanner(new File("LICHGD.in"));
        int m = Integer.parseInt(sc.nextLine());    
        for(int i = 1; i <= m; i++)
            b.add(new GD(i, sc.nextLine(), Integer.parseInt(sc.nextLine())
                    , Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine()));
        Collections.sort(b, Comparator.comparingInt(GD::getthu).thenComparing(GD::getkip).thenComparing(GD::getname));
        for(int i = 0; i < a.size(); i++)
            for(int j = 0; j < b.size(); j++)
                if(a.get(i).ma.equals(b.get(j).getma()))
                    b.get(j).set(a.get(i).ten);
        String s = sc.nextLine();            
        System.out.println("LICH GIANG DAY GIANG VIEN " + s + ":");
        for(GD x : b)
            if(x.getname().equals(s))
                System.out.println(x);
    }
}
