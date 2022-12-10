package MangDoiTuong;

import java.util.*;
class NhanVien{
    private String chuc,name;
    private long hsl,shnv;

    public NhanVien(String chuc, long hsl, long shnv,String name) {
        this.chuc = chuc;
        this.hsl = hsl;
        this.shnv = shnv;
        this.name = name;
    }

    public String getChuc() {
        return chuc;
    }
    
    public long getHsl() {
        return hsl;
    }

    public long getShnv() {
        return shnv;
    }
    
    @Override
    public String toString(){
        return name+" "+chuc+" "+String.format("%03d", shnv)+" "+String.format("%02d", hsl);
    }
}
public class LietKeNhanVienTheoNhom {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<NhanVien> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        int cntGD = 0,cntTP = 0,cntPP = 0;
        while(t-->0){
            String[] s=sc.nextLine().split("\\s+",2);
            String chuc=s[0].substring(0,2);
            if(chuc.equals("GD"))
                cntGD++;
            else if(chuc.equals("TP"))
                cntTP++;
            else if(chuc.equals("PP"))
                cntPP++;
            if(cntGD>=2||cntTP>=4||cntPP>=4)
                chuc="NV";
            long hsl=Long.parseLong(s[0].substring(2,4));
            long hieuNV=Long.parseLong(s[0].substring(4));
            list.add(new NhanVien(chuc, hsl, hieuNV, s[1]));
        }
        Collections.sort(list,Comparator.comparing(NhanVien::getHsl).reversed().thenComparing(NhanVien::getShnv));
        int n = Integer.parseInt(sc.nextLine());
        while(n-->0){
            String s = sc.nextLine();
            for(NhanVien x:list){
                if(x.getChuc().equals(s)) 
                    System.out.println(x);
            }
            System.out.println();
        }
    }
}
