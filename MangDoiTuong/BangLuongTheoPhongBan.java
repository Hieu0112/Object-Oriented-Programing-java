package MangDoiTuong;


import java.util.*;
class PhongBan{
    private String ma,ten;
    public PhongBan(String ma,String ten){
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
class NhanVien{
    private String ma,ten,tenphong;
    private long luong,nc;
    private PhongBan pb;
    public NhanVien(String ma,String ten,long luong,long nc ){
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
        return ma+" "+ten+" "+getLuong();
    }
}
public class BangLuongTheoPhongBan {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<PhongBan> ls1 = new ArrayList<>();
        while(t-- > 0){
            String s = sc.nextLine();
            ls1.add(new PhongBan(s.substring(0,2),s.substring(3)));
        }
        
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> ls2 = new ArrayList<>();
        while(n-- > 0){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            long luong = Long.parseLong(sc.nextLine());
            long nc = Long.parseLong(sc.nextLine());
            NhanVien a = new NhanVien(ma,ten,luong,nc);
            ls2.add(a);
            for(PhongBan x: ls1){
                if(ma.substring(3).equals(x.getMa())){
                    a.setPB(x.getTen());
                }
            }
        }
        String pb = sc.nextLine();
        System.out.print("Bang luong phong ");
        for(PhongBan x:ls1) {
            if(x.getMa().equals(pb)){
                System.out.println(x.getTen()+":");
                break;
            }
        }
        for(NhanVien x:ls2) {
            if(x.getMa().substring(3).equals(pb)){
                System.out.println(x);
            }
        }
    }
}
