package CodeJava1.MangDoiTuong;

import java.util.*;
class GiangVienSX{
    private String ma;
    private String name;
    private String subject;
    public GiangVienSX(int ma,String name,String subject){
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

    public String getName() {
        String[] lengthT=name.split(" ");
        return lengthT[lengthT.length-1];
    }

    public String getMa() {
        return ma;
    }
    
    @Override
    public String toString() {
        return ma+" "+name+" "+getSubject();
    }
}
public class SapXepDanhSachGiangVien {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<GiangVienSX>list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            GiangVienSX lis=new GiangVienSX(i, sc.nextLine(), sc.nextLine());
            list.add(lis);
        }
        Collections.sort(list, Comparator.comparing(GiangVienSX::getName).thenComparing(GiangVienSX::getMa));
        for(GiangVienSX x:list)
            System.out.println(x);
    }
}
