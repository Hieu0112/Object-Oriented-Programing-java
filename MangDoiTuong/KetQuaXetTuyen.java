package MangDoiTuong;


import java.util.*;
class ts{
    private String ma,ten,ns;
    private double lt,th;
    public ts(int i,String ten,String ns,double lt,double th){
        this.ma = "PH"+String.format("%02d", i);
        this.ten = ten;
        this.ns = ns;
        this.lt = lt;
        this.th = th;
    }
    public String getMa(){
        return ma;
    }
    public int getTuoi(){
        return 2021-Integer.parseInt(ns.substring(6));
    }
    public int getDiem(){
        if(lt >= 8 && th >= 8){
            double diem = Math.round((lt+th)/2+1);
            if(diem >= 10 ) return 10;
            else 
                return (int)(diem);
        }
        else if(lt >= 7.5 && th >= 7.5){
            return 
                    (int)(Math.round((lt+th)/2)+0.5);
        }
        return 
                (int)Math.round((lt+th)/2);
    }
    public String getXL(){
        if(getDiem() >= 9) 
            return "Xuat sac";
        if(getDiem() >= 8) 
            return "Gioi";
        if(getDiem() >= 7) 
            return "Kha";
        if(getDiem() >= 5) 
            return "Trung binh";
        return "Truot";
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+getTuoi()+" "+getDiem()+" "+getXL();
    }
}
public class KetQuaXetTuyen {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<ts> ls = new ArrayList<>();
        for(int i = 1; i <= t; i++){
            ls.add(new ts(i,sc.nextLine(),sc.nextLine(),
                    Double.parseDouble(sc.nextLine()),
                    Double.parseDouble(sc.nextLine())));
        }
        for(ts x:ls) 
            System.out.println(x);
    }
}
