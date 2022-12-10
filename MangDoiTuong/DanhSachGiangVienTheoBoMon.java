package CodeJava1.MangDoiTuong;

import java.util.ArrayList;
import java.util.Scanner;

class GiangVienbm{
    private String ma;
    private String name;
    private String subject;
    public GiangVienbm(int ma,String name,String subject){
        this.ma="GV"+String.format("%02d",ma);
        this.name=name;
        this.subject=subject;
    }
    
    public String getSubject() {
        String s=subject.toUpperCase();
        String[] arr=s.split(" ");
        s="";
        for(String x:arr)
            s=s+x.charAt(0);
        return s;
    }

    @Override
    public String toString() {
        return ma+" "+name+" "+getSubject();
    }
}
public class DanhSachGiangVienTheoBoMon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<GiangVienbm>list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            GiangVienbm lis=new GiangVienbm(i, sc.nextLine(), sc.nextLine());
            list.add(lis);
        }
        int t=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t;i++){
            String key= sc.nextLine().toUpperCase();
            String[] arr=key.split(" ");
            key="";
            for(String x:arr)
                key+=x.charAt(0);
            System.out.println("DANH SACH GIANG VIEN BO MON " + key + ":");
            for (GiangVienbm x:list)
                if(x.getSubject().contains(key))
                    System.out.println(x);
        }
    }
}
