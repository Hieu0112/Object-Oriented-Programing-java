//
//package CodeJava1.KhaiBaoLopVaDoiTuong;
//import java.util.Scanner;
//class Thu_Gon{
//    private long tu;
//    private long mau;
//    public Thu_Gon(long tu,long mau){
//        this.tu=tu;
//        this.mau=mau;
//    }
//    public long Gcd(){
//        while(tu*mau!=0){
//            if(tu>mau) tu%=mau;
//            else mau%=tu;
//        }
//        return tu+mau;
//    }
//
//    @Override
//    public String toString() {
//        long a=tu,b=mau;
//        return (a/Gcd())+"/"+(b/Gcd());
//    }
//}
//public class PhanSo {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        long tu=sc.nextLong();
//        long mau=sc.nextLong();
//        Thu_Gon PS=new Thu_Gon(tu,mau);
//        System.out.println(PS.toString());
//    }
//}
