//package VaoRaFile;
//
//import java.io.File;
//import java.util.*;
//
//
//class SV{
//    private String ma, ten,lop, ns;
//    private float gpa;
//    public SV(int i,String ten, String lop, String ns, float gpa){
//        this.ma = "B20DCCN" + String.format("%03d",i);
//        this.ten = ten;
//        this.lop = lop;
//        this.ns = ns;
//        this.gpa = gpa;
//    }
//    public String ChuanHoa(String s){
//        s = s.trim().replaceAll("\\s+", " ");
//        String a[] = s.split(" ");
//        String tmp = "";
//        for(String w : a){
//            tmp = tmp + w.substring(0, 1).toUpperCase() + w.substring(1, w.length()).toLowerCase();
//            tmp +=" ";
//        }
//        return tmp;
//    }
//
//    public void out(){
//        ten = ChuanHoa(ten);
//        System.out.print(ma + " " + ten  + lop + " ");
//        if(ns.charAt(2) != '/') ns = '0' + ns;
//        for(int i = 0; i < ns.length(); i++){
//            if(ns.charAt(5) != '/' && i == 3)
//                System.out.print(0);
//            System.out.print(ns.charAt(i));
//        }
//        System.out.printf(" %.2f\n", gpa);
//    }
//}
//public class ChuanHoaDanhSachSinhVien {
//    public static void main(String[] args) {
//        try{
//            Scanner sc = new Scanner(new File("SINHVIEN.in"));
//            int t = Integer.parseInt(sc.nextLine());
//            ArrayList<SV> a = new ArrayList<>();
//            for(int i = 1; i <= t; i++)
//                a.add(new SV(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine())));
//            for(SV x : a)
//                x.out();;
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
//    }
//}
