
package MangDoiTuong;
import java.util.*;
class HocPhan{
    private String ma,nameMh;
    private int nhom;
    private String nameGv;

    public HocPhan(String ma, String nameMh, int nhom, String nameGv) {
        this.ma = ma;
        this.nameMh = nameMh;
        this.nhom = nhom;
        this.nameGv = nameGv;
    }

    public String getMa() {
        return ma;
    }

    public String getNameMh() {
        return nameMh;
    }

    public int getNhom() {
        return nhom;
    }

    public String getNameGv() {
        return nameGv;
    }
    
   @Override
    public String toString() {
        return ma+" "+nameMh+" "+String.format("%02d",nhom) + " ";
    }
    
}
public class LopHocPhan2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<HocPhan>list=new ArrayList<>();
        int n=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=n;i++){
            list.add(new HocPhan(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine()));
        }
        Collections.sort(list, Comparator.comparing(HocPhan::getMa).thenComparingInt(HocPhan::getNhom));
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String tmp=sc.nextLine();
            System.out.println("Danh sach cho giang vien "+tmp+": ");
            for(HocPhan x:list){
                if(tmp.equals(x.getNameGv())){
                    System.out.println(x);
                }
            }
        }
    }
}
