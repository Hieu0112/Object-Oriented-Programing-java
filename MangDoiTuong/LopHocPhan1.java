
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
    
   @Override
    public String toString() {
        return String.format("%02d",nhom) + " " + nameGv;
    }
    
}
public class LopHocPhan1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<HocPhan>list=new ArrayList<>();
        int n=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=n;i++){
            list.add(new HocPhan(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine()));
        }
        Collections.sort(list, Comparator.comparingInt(HocPhan::getNhom));
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String tmp=sc.nextLine();
            int stt=0;
            for(HocPhan x:list){
                if(tmp.equals(x.getMa())){
                    stt++;
                    if(stt==1)
                        System.out.println("Danh sach nhom lop mon "+x.getNameMh()+": ");
                    System.out.println(x);
                }
            }
        }
    }
}
