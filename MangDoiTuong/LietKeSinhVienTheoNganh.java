
package CodeJava1.MangDoiTuong;
import java.util.ArrayList;
import java.util.Scanner;
class SinhVienNganh{
    private String ma,ten,lop,mail;

    public SinhVienNganh(String ma, String ten, String lop, String mail) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.mail = mail;
    }

    public String getMa() {
        return ma;
    }

    public String getLop() {
        return lop;
    }
    
    public String toTring(){
        return ma + " " + ten + " " + lop+ " " + mail;
    }
    
}
public class LietKeSinhVienTheoNganh {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<SinhVienNganh>a=new ArrayList<>();
        for(int i=1;i<=n;i++){
            SinhVienNganh sv=new SinhVienNganh(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            a.add(sv);
        }
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s=sc.nextLine().toLowerCase();
            String res;
            if(s.equals("ke toan")) res="DCKT";
            else if(s.equals("cong nghe thong tin")) res="DCCN";
            else if(s.equals("an toan thong tin")) res="DCAT";
            else if(s.equals("vien thong")) res="DCVT";
            else res="DCDT";
            System.out.println("DANH SACH SINH VIEN NGANH "+ s.toUpperCase() +":");
            for(SinhVienNganh x:a){
                if(x.getMa().contains(res)){
                    if((res.equals("DCCN")||res.equals("DCAT"))){
                        if(x.getLop().charAt(0)!='E')
                            System.out.println(x.toTring());
                    }
                    else
                        System.out.println(x.toTring());
                }
            }
        }
    }
}
