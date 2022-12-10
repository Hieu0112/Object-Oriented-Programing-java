
package MangDoiTuong;
import java.util.*;
class HBSV{
    private String name;
    private double TBC,RL;
    private String Loai;
    public HBSV(String name,double TBC, double RL) {
        this.name=name;
        this.TBC = TBC;
        this.RL = RL;
        if(TBC>=3.6&&RL>=90)
            this.Loai="XUATSAC";
         else if(TBC>=3.2&&RL>=80)
            this.Loai="GIOI";
        else if(TBC>=2.5&&RL>=70)
            this.Loai="KHA";
        else
            this.Loai="KHONG";
    }

    public String getLoai() {
        return Loai;
    }
    
    public double getTBC() {
        return TBC;
    }
    
    public void setLoai() {
            this.Loai="KHONG";
    }

    @Override
    public String toString() {
        return name + ": " + Loai;
    }
}
public class HocBongSinhVien {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] t=sc.nextLine().split("\\s+");
        int n=Integer.parseInt(t[0]);
        int m=Integer.parseInt(t[1]);
        ArrayList<HBSV>list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            String name=sc.nextLine();
            String[] tmp=sc.nextLine().split("\\s+");
            HBSV x=new HBSV(name, Double.parseDouble(tmp[0]), Double.parseDouble(tmp[1]));
            list.add(x);
        }
        ArrayList<HBSV>tmps=(ArrayList<HBSV>) list.clone();
        Collections.sort(tmps, Comparator.comparingDouble(HBSV::getTBC).reversed());
        double TB=0;
        int stt=0;
        for(HBSV xs:tmps){
            if(stt==m) break;
            if(xs.getLoai().equals("KHONG")==false){
                stt++;
                TB=xs.getTBC();
            }
        }
        for(HBSV xs:list){
            if(xs.getTBC()<TB)
                xs.setLoai();
            System.out.println(xs);
        }
    }
}
