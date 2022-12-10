package VaoRaFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
class DachSach{
    private String ma,name,loai;
    private Date den,di;
    SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");

    public DachSach(int ma, String name, String loai, String den, String di) throws ParseException {
        this.ma = "KH"+String.format("%02d", ma);
        this.name = name;
        this.loai = loai;
        this.den = sdf.parse(den);
        this.di = sdf.parse(di);
    }

    public long Ngay() {
        long ngay1=di.getTime()-den.getTime();
        long ngay=TimeUnit.DAYS.convert(ngay1, TimeUnit.MILLISECONDS);
        return ngay;
    }

    @Override
    public String toString() {
        return ma+" "+name+" "+loai+" "+Ngay();
    }
    
}
public class DanhSachLuuTru {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc=new Scanner(new File("KHACH.in"));
        int t=Integer.parseInt(sc.nextLine());
        List<DachSach> list=new ArrayList<>();
        for(int i=1;i<=t;i++){
            list.add(new DachSach(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(list, Comparator.comparing(DachSach::Ngay).reversed());
        for (DachSach dachSach : list) {
            System.out.println(dachSach);
        }
    }
}
