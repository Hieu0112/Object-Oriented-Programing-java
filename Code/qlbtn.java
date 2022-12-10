
package Code;
import java.io.*;
import java.util.*;
class SINHVIEN{
    private String ma,ten,sdt;
    private int nhom;
    public SINHVIEN(String ma, String ten, String sdt) {
        this.ma = ma;
        this.ten = ten;
        this.sdt = sdt;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getNhom() {
        return nhom;
    }

    public void setNhom(int nhom) {
        this.nhom = nhom;
    }

    @Override
    public String toString() {
        return ma +" "+ten+" "+sdt+" "+nhom+" "; 
    }
 
}
public class qlbtn {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        Scanner sc1 = new Scanner(new File("BAITAP.in"));
        Scanner sc2 = new Scanner(new File("NHOM.in"));
        ArrayList<SINHVIEN> a = new ArrayList<>();
        ArrayList<String> b = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++)
            a.add(new SINHVIEN(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        Collections.sort(a, (SINHVIEN o1,SINHVIEN o2)-> o1.getMa().compareTo(o2.getMa()));
        int n1 = Integer.parseInt(sc1.nextLine());
        while(n1-- > 0)
            b.add(sc1.nextLine());
       for(int i=0;i<n;i++){
            String s = sc2.next();
            int c = sc2.nextInt();
            for(SINHVIEN x : a)
                if(x.getMa().equals(s)){
                    x.setNhom(c);
                    break;
                }
        }
       for(SINHVIEN x : a)
            System.out.println(x + b.get(x.getNhom() - 1));
    }
}
