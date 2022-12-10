package MangDoiTuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


class ts{
     private String name,id;
    private double p1,p2,p3;
    public ts(String id, String name, double p1, double p2, double p3){
        this.name = name;
        this.id = id;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    public String getMa(){
        return id;
    }
    public double getKV(){
        if(id.substring(0,3).compareTo("KV1") == 0) 
            return 0.5;
        if(id.substring(0,3).compareTo("KV2") == 0) 
            return 1;
        return 2.5;
    }
    public double getSum(){
        return p1*2+p2+p3+getKV();
    }
    public String getTT(){
        if(getSum() >= 24) 
            return "TRUNG TUYEN";
        return "TRUOT";
    }
    private String ChuanSo(double so){
        int res=(int)so;
        if((double)res-so==0)
            return String.format("%.0f",so);
        else
            return String.format("%.1f",so);    
    }
    @Override
    public String toString(){
        return id+" "+name+ " "+ChuanSo(getKV())+" "+ChuanSo(getSum())+" "+getTT();
    }
}
public class SapXepKetQuaTuyenSinh {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<ts> ls = new ArrayList<>();
        while(t-->0){
            ls.add(new ts(sc.nextLine(),sc.nextLine(),
                    Double.parseDouble(sc.nextLine()),
                    Double.parseDouble(sc.nextLine()),
                    Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(ls,Comparator.comparingDouble(ts::getSum).reversed());
        for(ts x: ls) 
            System.out.println(x);
    }
}
