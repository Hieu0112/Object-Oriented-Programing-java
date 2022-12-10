
package CodeJava1.MangDoiTuong;

import java.util.*;

class NhapKho{
    private String name,ma;
    private long sl,gia;

    public NhapKho(int i,String name, long sl, long gia) {
        this.name = name;
        this.sl = sl;
        this.gia = gia;
        String[] tmp=name.toUpperCase().split(" ");
        this.ma=String.valueOf(tmp[0].charAt(0))+String.valueOf(tmp[1].charAt(0))+String.format("%02d", i);
    }

    public String getMa() {
        return ma;
    }
    
    public long getTien() {
        return gia*sl;
    }

    public long ChietKhau() {
        if(sl>10)   return getTien()*5/100;
        else if(sl>=8)  return getTien()*2/100;
        else if(sl>=5)  return getTien()/100;
        else return 0;
    }

    public long ThanhTien() {
        return getTien()-ChietKhau();
    }

    @Override
    public String toString() {
        return ma+" "+name+" "+ChietKhau()+" "+ThanhTien();
    }
    
    
}
public class BangNhapKhoSapXepTheoChietKhau {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<NhapKho>list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            String maa=sc.nextLine();
            String[] mA=maa.toUpperCase().split(" ");
            String tmp=String.valueOf(mA[0].charAt(0))+String.valueOf(mA[1].charAt(0));
            int dem=1;
            for(NhapKho x:list){
                if(x.getMa().contains(tmp)){
                dem++;
                }
            }
            NhapKho a=new NhapKho(dem,maa, Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()));
            list.add(a);
            
        }
        Collections.sort(list, Comparator.comparingLong(NhapKho::ChietKhau).reversed());
        for(NhapKho x:list){
            System.out.println(x);
        }
    }
}
