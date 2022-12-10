package CodeJava1.MangDoiTuong;

import java.util.*;
class mh{
    private String ten,dv,tt;
    private double gnhap,sl;
    public mh(int i,String ten, String dv, double gnhap, double sl) {
        this.tt = "MH"+String.format("%02d", i);
        this.ten = ten;
        this.dv = dv;
        this.gnhap = gnhap;
        this.sl = sl;
    }
    public double getPhivc(){
        return gnhap*sl*5.0/100;
    }
    public double getTT(){
        return gnhap*sl+getPhivc();
    }
    public double getGban(){
        return getTT()+getTT()*2.0/100;
    }
    @Override
    public String toString(){
        return tt+" "+ten+" "+dv+" "+ String.format("%d", Math.round(getPhivc()))+" "+String.format("%d", Math.round(getTT()))+" "+String.format("%d", Math.round(getGban()));
    }
}
public class TinhGiaBan1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<mh> ls = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            ls.add(new mh(i,sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine())));
        }
        for(mh x: ls ) System.out.println(x);
    }
}
