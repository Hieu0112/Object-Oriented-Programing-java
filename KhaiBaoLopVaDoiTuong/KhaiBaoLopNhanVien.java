
package CodeJava1.KhaiBaoLopVaDoiTuong;
import java.util.Scanner;
class InfoNV{
    private String MaNV="00001";
    private String name;
    private String gt;
    private String day1;
    private String address;
    private String mst;
    private String day2;
    public InfoNV(String name,String gt,String day1,String address,String mst,String day2){
        this.name=name;
        this.gt=gt;
        this.day1=day1;
        this.address=address;
        this.mst=mst;
        this.day2=day2;
    }

    @Override
    public String toString() {
        return "00001"+" "+name+" "+gt+" "+day1+" "+address+" "+mst+" "+day2;
    }
}
public class KhaiBaoLopNhanVien {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        InfoNV nv=new InfoNV(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
        System.out.println(nv.toString());
    }
}

