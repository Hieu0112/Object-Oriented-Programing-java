package CodeJava1.MangDoiTuong;
import java.util.*;
class dn{
    private String ma,ten,lop,email,tendn;
    private int tt;
    public dn(int i,String ma,String ten,String lop,String email,String tendn){
        this.ma = ma;
        this.ten = ten;
        this.tt = i;
        this.lop = lop;
        this.email= email;
        this.tendn = tendn;
    }
    public String getMa(){
        return ma;
    }
    public String getTendn(){
        return tendn;
    }
    public String getTen(){
        return ten;
    }
    @Override
    public String toString(){
        return tt+" "+ma+" "+ten+" "+lop+" "+email+" "+tendn;
               
    }
}
public class DanhSachThucTap1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<dn> ls = new ArrayList<>();
        
        for(int i = 1; i <= n; i++){
            ls.add(new dn(i, sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(ls,Comparator.comparing(dn::getTen));
        
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String q = sc.nextLine();
            for(dn x:ls) 
                if(x.getTendn().equals(q))
                    System.out.println(x);
        }
    }
}
