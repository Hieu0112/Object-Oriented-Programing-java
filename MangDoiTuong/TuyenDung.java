//package CodeJava1.MangDoiTuong;
//
//
//import java.util.*;
//class NhanVien{
//    private String ma,ten;
//    private double th,lt;
//    public NhanVien(int i,String ten,double th,double lt){
//        this.ma ="TS"+String.format("%02d", i);
//        this.ten = ten;
//        if(th > 10) this.th = th/10;
//        else this.th = th;
//        if(lt > 10) this.lt = lt/10;
//        else this.lt = lt;
//    }
//    public double getDiemTB(){
//        return (lt+th)/2.0;
//    }
//    public String getTrangThai(){
//        if(getDiemTB() > 9.5)  {
//            return "XUAT SAC";
//        }
//        else if(getDiemTB() >= 8) {
//            return "DAT";
//        }
//        else if(getDiemTB() >= 5 ) {
//            return "CAN NHAC";
//        }
//        else {
//            return "TRUOT";
//        }
//    }
//    @Override
//    public String toString(){
//        return ma+" "+ten+" "+String.format("%.2f", getDiemTB())+" "+getTrangThai();
//    }
//}
//public class TuyenDung {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int t = Integer.parseInt(sc.nextLine());
//        ArrayList<NhanVien> ls = new ArrayList<>();
//        for(int i = 1; i <= t; i++){
//            ls.add(new NhanVien(i,sc.nextLine(),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine())));
//        }
//        Collections.sort(ls,Comparator.comparingDouble(NhanVien::getDiemTB).reversed());
//        for(NhanVien x: ls) System.out.println(x);
//    }
//}
