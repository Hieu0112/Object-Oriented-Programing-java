package MangDoiTuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class hs{
    private String ten,ma;
    private double diem;
    private int xh;
    public hs(int i,String ten, double diem){
        this.ma = "HS"+String.format("%02d", i);
        this.ten = ten;
        this.diem = diem;
        this.xh=1;
    }
    public String getXL(){
        if(diem >= 9) 
            return "Gioi";
        else if(diem >= 7) 
            return "Kha";
        else if(diem >= 5) 
            return "Trung Binh";
        else 
            return "Yeu";
    }
    public String getMa(){
        return ma;
    }
    public void setXH(int i){
        this.xh = i;
    }
    public int getXH(){
        return xh;
    }
    public double getDiem(){
        return diem;
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+String.format("%.1f", diem)
                +" "+getXL()+" "+getXH();
    }
}
public class XepHangHocSinh {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<hs> ls = new ArrayList<>();
        for(int i = 1; i <= t; i++)
            ls.add(new hs(i,sc.nextLine(),
                    Double.parseDouble(sc.nextLine())));
        Collections.sort(ls,Comparator.comparingDouble(hs::getDiem).reversed());
        int cnt = 1, check = 0;
        for(int i = 1; i < ls.size(); i++){
            if(ls.get(i).getDiem() == ls.get(i-1).getDiem()) {
                ls.get(i).setXH(ls.get(i-1).getXH());
            }
            else{
                ls.get(i).setXH(i+1);
            }
        }
        Collections.sort(ls,Comparator.comparing(hs::getMa));
        for (hs l : ls) {
            System.out.println(l);
        }
    }
}
