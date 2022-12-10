package MangDoiTuong;

import java.util.*;
class PhongBan1{
    private String ma,ten;
    public PhongBan1(String ma,String ten){
        this.ma = ma;
        this.ten = ten;
    }
    public String getMa(){
        return ma;
    }
    public String getTen(){
        return ten;
    }
}
class NhanVien1{
    private String ma,ten,tenphong;
    private long luong,nc;
    private PhongBan1 pb;
    public NhanVien1(String ma,String ten,long luong,long nc ){
        this.ma = ma;
        this.ten = ten;
        this.luong = luong;
        this.nc = nc;
    }
    public String getMa(){
        return ma;
    }
    public void setPB(String ten){
        this.tenphong = ten;
    }
    
    public long getLuong(){
        long namct = Integer.parseInt(ma.substring(1,3));
        char nhom = ma.charAt(0);
        long hso ;
        if(nhom == 'A'){
            if(namct >=1 && namct <= 3) hso = 10;
            else if(namct >= 4 && namct <= 8) hso = 12;
            else if(namct >= 9 && namct <= 15) hso =14;
            else hso = 20;
        }
        else if(nhom == 'B'){
            if(namct >=1 && namct <= 3) hso = 10;
            else if(namct >= 4 && namct <= 8) hso = 11;
            else if(namct >= 9 && namct <= 15) hso =13;
            else hso = 16;
        }
        else if(nhom == 'C'){
            if(namct >=1 && namct <= 3) hso = 9;
            else if(namct >= 4 && namct <= 8) hso = 10;
            else if(namct >= 9 && namct <= 15) hso =12;
            else hso = 14;
        }
        else{
            if(namct >=1 && namct <= 3) hso = 8;
            else if(namct >= 4 && namct <= 8) hso = 9;
            else if(namct >= 9 && namct <= 15) hso =11;
            else hso = 13;
        }
        return hso*luong*nc*1000;
    }
    @Override
    public String toString(){
        return ma+" "+ ten+" "+tenphong+" "+getLuong();
    }
}
public class TinhLuong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<PhongBan1> ls1 = new ArrayList<>();
        while(t-->0){
            String s = sc.nextLine();
            ls1.add(new PhongBan1(s.substring(0,2),s.substring(3)));
        }
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien1> ls2 = new ArrayList<>();
        while(n-->0){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            long luong = Long.parseLong(sc.nextLine());
            long nc = Long.parseLong(sc.nextLine());
            NhanVien1 a = new NhanVien1(ma,ten,luong,nc);
            ls2.add(a);
            for(PhongBan1 x: ls1){
                if(ma.substring(3).equals(x.getMa())){
                    a.setPB(x.getTen());
                }
            }
        }
        for(NhanVien1 x:ls2) 
            System.out.println(x);
    }
}
