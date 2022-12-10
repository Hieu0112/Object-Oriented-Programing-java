
package MangDoiTuong;
import java.util.*;
class SinhVienDiemDanh{
    private String ma,ten,lop;
    private int ChuyenCan;
    public SinhVienDiemDanh(String ma, String ten, String lop) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.ChuyenCan=10;
    }

    public String getMa() {
        return ma;
    }
    
    public int getChuyenCan() {
        return ChuyenCan;
    }

    public void setChuyenCan(int ChuyenCan) {
        this.ChuyenCan = ChuyenCan;
    }

    public String GhiChu() {
        if(ChuyenCan==0)    
            return "KDDK";
        else 
            return "";
    }
    
    @Override
    public String toString() {
        return ma+" "+ten+" "+lop+" "+ChuyenCan+" "+GhiChu();
    }
    
}
public class DiemDanh1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<SinhVienDiemDanh>list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            list.add(new SinhVienDiemDanh(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        for(int i=1;i<=n;i++){
            String[] diemdanh=sc.nextLine().split("\\s+");
            for(SinhVienDiemDanh x:list){
                if(x.getMa().equals(diemdanh[0])){
                    int chuyencan=x.getChuyenCan();
                    for(int j=0;j<diemdanh[1].length();j++){
                        if(diemdanh[1].charAt(j)=='v') chuyencan-=2;
                        else if(diemdanh[1].charAt(j)=='m') chuyencan-=1;
                    }
                    if(chuyencan<0) chuyencan=0;
                    x.setChuyenCan(chuyencan);
                    break;
                }
            }
        }
        for(SinhVienDiemDanh x:list){
            System.out.println(x);
        }
    }
}
