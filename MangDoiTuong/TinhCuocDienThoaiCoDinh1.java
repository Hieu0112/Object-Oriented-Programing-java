package CodeJava1.MangDoiTuong;

import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;

class DienThoai {

    private String vung, ten;
    private long Cuoc;

    public DienThoai(String vung, String ten, long Cuoc) {
        this.vung = vung;
        this.ten = ten;
        this.Cuoc = Cuoc;
    }

    public long getCuoc() {
        return Cuoc;
    }

    public String getTen() {
        return ten;
    }

    public String getVung() {
        return vung;
    }

}

class CuocGoi {

    private DienThoai dt;
    private String so;
    private String begin, end;

    public CuocGoi(DienThoai dt, String so, String begin, String end){
        this.dt = dt;
        this.so = so;
        this.begin = begin;
        this.end =  end;
    }

    public CuocGoi(String so, String begin, String end){
        this.so = so;
        this.begin = begin;
        this.end = end;
    }

    public String Vung() {
        if (so.charAt(0) != '0') {
            return "Noi mang";
        } 
        else {
            return dt.getTen();
        }
    }

    public long Phut() {
        String[] s1=begin.split(":");
        String[] s2=end.split(":");
        long phut = (Long.parseLong(s2[0])-Long.parseLong(s1[0]))*60+(Long.parseLong(s2[1])-Long.parseLong(s1[1]));
        if (Vung().equals("Noi mang")) {
            double DPhut=(double)phut/3.0;
            return (long)Math.ceil(DPhut);
        } 
        else {
            return phut;
        }
    }

    public long Gia() {
        if (Vung().equals("Noi mang")) {
            return 800;
        } 
        else {
            return dt.getCuoc();
        }
    }

    public long Tien() {
        return Phut() * Gia();
    }

    @Override
    public String toString() {
        return so + " " + Vung() + " " + Phut() + " " + Tien();
    }

}

public class TinhCuocDienThoaiCoDinh1 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<DienThoai> list1 = new ArrayList<>();
        int n1 = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n1; i++) {
            list1.add(new DienThoai(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine())));
        }
        int n2 = Integer.parseInt(sc.nextLine());
        ArrayList<CuocGoi> list2 = new ArrayList<>();
        for (int i = 1; i <= n2; i++) {
            String[] s = sc.nextLine().split("\\s+");
            if (s[0].charAt(0) != '0') {
                list2.add(new CuocGoi(s[0], s[1], s[2]));
            } 
            else {
                String so = s[0].substring(1, 3);
                for (DienThoai x : list1) {
                    if (x.getVung().equals(so)) {
                        list2.add(new CuocGoi(x, s[0], s[1], s[2]));
                        break;
                    }
                }
            }
        }
        Collections.sort(list2, Comparator.comparingLong(CuocGoi::Tien).reversed());
        for (CuocGoi x : list2) {
            System.out.println(x);
        }
    }
}
