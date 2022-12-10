package MangDoiTuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class DH{
    private String ten,ma;
    private long gia,sl;
    public DH(String ten,String ma,long gia, long sl){
        this.ten = ten;
        this.ma = ma;
        this.gia = gia;
        this.sl = sl;
    } 
    public String getTT(){
        return  ma.substring(1,4);
    }
    public long getGG(){
        if(ma.charAt(4) == '2') 
            return 30*gia*sl/100;
        else
            return 50*gia*sl/100;
    }
    public long getSum(){
        return gia*sl-getGG();
    }
    @Override
    public String toString(){
        return ten+" "+ma+" "+ getTT()+" "+getGG()+" "+ getSum();
    }
}
public class SapXepDonHang {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<DH> ls = new ArrayList<>();
        while(t-->0){
            String ten = sc.nextLine();
            String ma = sc.nextLine();
            long gia = Long.parseLong(sc.nextLine());
            long sl = Long.parseLong(sc.nextLine());
            ls.add(new DH(ten,ma,gia,sl));
        }
        Collections.sort(ls,new Comparator<DH>(){
            @Override
            public int compare(DH o1, DH o2) {
                return o1.getTT().compareTo(o2.getTT());
            }
            
        });
        for (DH l : ls) {
            System.out.println(l);
        }
    }
}
