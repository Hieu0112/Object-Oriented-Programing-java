
package VaoRaFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class TienDien{
    private String ma,name;
    private long sodau,socuoi,dinhmuc;

    public TienDien(int ma, String name,String loai, long sodau, long socuoi) {
        this.ma = "KH"+String.format("%02d",ma);
        this.name = name.toLowerCase().trim();
        this.sodau = sodau;
        this.socuoi = socuoi;
        if(loai.equals("A"))
            this.dinhmuc=100;
        else if(loai.equals("B"))
            this.dinhmuc=500;
        else 
            this.dinhmuc=200;
    }
    private String ChuanHoa(){
        String s=name.replaceAll("\\s+"," ");
        String[] tmp=s.split(" ");
        s="";
        for (String string : tmp) {
            String s1=String.valueOf(string.charAt(0)).toUpperCase();
            s=s+s1+string.substring(1)+" ";
        }
        return s.trim();
    }
    private long trongdinhmuc(){
        long sodinhmuc=Math.min(socuoi-sodau, dinhmuc);
        return sodinhmuc*450;
    }
    private long vuotdinhmuc(){
        long vuotdinhmuc=Math.max(0,socuoi-sodau-dinhmuc);
        return vuotdinhmuc*1000;
    }
    private long thueVAT(){
        return vuotdinhmuc()*5/100;
    }
    public long Tong(){
        return trongdinhmuc()+vuotdinhmuc()+thueVAT();
    }
    @Override
    public String toString() {
        return ma+" "+ChuanHoa()+" "+trongdinhmuc()+" "+
                vuotdinhmuc()+" "+thueVAT()+" "+Tong();
    }  
}
public class TinhTienDien {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("KHACHHANG.in"));
        int t=Integer.parseInt(sc.nextLine());
        List<TienDien>list=new ArrayList<>();
        for(int i=1;i<=t;i++){
            String x=sc.nextLine();
            String[]y=sc.nextLine().split("\\s+");
            list.add(new TienDien(i, x, y[0], Long.parseLong(y[1]), Long.parseLong(y[2])));
        }
        list.sort((TienDien o1, TienDien o2) -> {
            return (int)(o2.Tong()-o1.Tong());
        });
        for (TienDien tienDien : list) {
            System.out.println(tienDien);
        }
    }
}
