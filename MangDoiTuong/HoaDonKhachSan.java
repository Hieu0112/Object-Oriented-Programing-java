package CodeJava1.MangDoiTuong;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;
class KhachHang{
    private String ten,ma,phong;
    private Date nhan,tra;
    private long ps;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public KhachHang(int i,String ten, String phong, String nhan, String tra, long ps) throws ParseException {
        this.ten = ten.trim();
        this.ma = "KH"+String.format("%02d", i);
        this.phong = phong.trim();
        this.nhan = sdf.parse(nhan);
        this.tra = sdf.parse(tra);
        this.ps = ps;
    }

    public long getSoNgay() {
        long milliseconds=tra.getTime()-nhan.getTime();
        return TimeUnit.DAYS.convert(milliseconds, TimeUnit.MILLISECONDS)+1;
    }

    public long getTang(){
        if(phong.charAt(0) == '1') {
            return 25;
        }
        else if(phong.charAt(0) == '2'){
            return 34;
        }
        else if(phong.charAt(0) == '3'){
            return 50;
        }
        else return 80;  
    }
    public long getMoney(){
        return getSoNgay()*getTang()+ps;
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+phong+" "+getSoNgay()+" "+getMoney();
    }
}
public class HoaDonKhachSan {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> ls = new ArrayList<>();
        for(int i = 1; i <= t; i++){
            ls.add(new KhachHang(i,sc.nextLine(),sc.nextLine(),sc.nextLine().trim(),sc.nextLine().trim(),Long.parseLong(sc.nextLine())));
        }
        Collections.sort(ls,Comparator.comparingLong(KhachHang::getMoney).reversed());
        for(KhachHang x:ls) System.out.println(x);
    }
}
