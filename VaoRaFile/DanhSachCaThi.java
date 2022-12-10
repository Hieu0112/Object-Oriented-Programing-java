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

class CaThi{
    private String ma,so;
    private Date ngay,gio;
    private SimpleDateFormat sdf1=new SimpleDateFormat("dd/MM/yyyy");
    private SimpleDateFormat sdf2=new SimpleDateFormat("HH:mm");
    public CaThi(int ma,String ngay, String gio,String so) throws ParseException {
        this.ma="C"+String.format("%03d", ma);
        this.ngay = sdf1.parse(ngay);
        this.gio = sdf2.parse(gio);
        this.so=so;
    }

    public Date getNgay() {
        return ngay;
    }

    public Date getGio() {
        return gio;
    }
    
    @Override
    public String toString() {
        return ma+" "+sdf1.format(ngay)+" "+sdf2.format(gio)+" "+so;
    }

    
}
public class DanhSachCaThi {
    public static void main(String[] args) throws FileNotFoundException ,ParseException{
        Scanner sc=new Scanner(new File("CATHI.in"));
        List<CaThi>list=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t;i++){
            list.add(new CaThi(i, sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(list, new Comparator<CaThi>(){
            @Override
            public int compare(CaThi o1, CaThi o2) {
                if(o1.getNgay().equals(o2.getNgay()))
                    return o1.getGio().after(o2.getGio())? 1:-1;
                else 
                    return o1.getNgay().after(o2.getNgay())? 1:-1;
            }
        });
        for (CaThi caThi : list) {
            System.out.println(caThi);
        }
    }
}
