package VaoRaFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class MH{
    private String ma, ten, so, LT, TH;
    public MH(String ma, String ten, String so, String LT, String TH){
        this.ma = ma;
        this.ten = ten;
        this.so = so;
        this.LT = LT;
        this.TH = TH;
    }
    public String getma(){
        return ma;
    }
    public String toString(){
        return ma + " " + ten + " " + so + " " + LT + " " + TH;
    }
    public String getTH(){
        return TH;
    }
}
public class DangKyHinhThucGiangDay {
    public static void main(String[] args) throws FileNotFoundException {
            Scanner sc = new Scanner(new File("MONHOC.in"));
            int t = Integer.parseInt(sc.nextLine());
            ArrayList<MH> a = new ArrayList<>();
            for(int i = 1; i <= t; i++)
                a.add(new MH(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
            Collections.sort(a, Comparator.comparing(MH::getma));
            for(MH x : a)
                if(x.getTH().equals("Truc tuyen") || x.getTH().contains(".ptit.edu.vn"))
                    System.out.println(x);
    }
}
