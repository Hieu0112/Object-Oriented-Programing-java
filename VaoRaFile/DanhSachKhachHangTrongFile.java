package VaoRaFile;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


class KH{
    private String ma, ten, gt, dc;
    private Date ngay;
    private SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
    public KH(int i,String ten, String gt, String ns, String dc) throws ParseException{
        if(i < 10) this.ma = "KH00" + (char)(i + '0');
        else this.ma = "KH0" + Integer.toString(i);
        this.ten = ChuanHoa(ten);
        this.gt = gt;
        this.ngay=sdf.parse(ns);
        this.dc = dc;
    }

    public Date getNgay() {
        return ngay;
    }
    
    public String ChuanHoa(String s){
        s = s.trim().replaceAll("\\s+", " ");
        String a[] = s.split(" ");
        String tmp = "";
        for(String w : a){
            tmp = tmp + w.substring(0, 1).toUpperCase() + w.substring(1, w.length()).toLowerCase();
            tmp = tmp + " ";
        }
        return tmp;
    }

    @Override
    public String toString() {
        return ma + " " + ten + gt + " " + dc + " " + sdf.format(ngay);
    }
}
public class DanhSachKhachHangTrongFile {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new File("KHACHHANG.in"));
            int t = Integer.parseInt(sc.nextLine());
            ArrayList<KH> a = new ArrayList<>();
            for(int i = 1; i <= t; i++)
                a.add(new KH(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
            Collections.sort(a, new Comparator<KH>() {
                @Override
                public int compare(KH a, KH b){
                    return a.getNgay().after(b.getNgay())?1:-1;
                }
            });
            for(KH x : a){
                System.out.println(x);
            }
                
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
