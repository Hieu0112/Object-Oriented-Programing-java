
package MangDoiTuong;
import java.util.*;
import java.io.*;
class SinhVien_in{
    private String ma,ten,lop,mail,diadiem;
    private String ChuanHoa(String name){
        String s=name.toLowerCase().replaceAll("\\s+"," ");
        String[] tmp=s.split(" ");
        s="";
        for (String string : tmp) {
            String s1=String.valueOf(string.charAt(0)).toUpperCase();
            s=s+s1+string.substring(1)+" ";
        }
        return s.trim();
    }
    public SinhVien_in(String ma, String ten, String lop, String mail) {
        this.ma = ma;
        this.ten = ChuanHoa(ten.trim());
        this.lop = lop;
        this.mail = mail;
        this.diadiem="";
    }
    public void setDiadiem(String diadiem) {
        this.diadiem = diadiem;
    }
    
    public String getMa() {
        return ma;
    }

    public String getDiadiem() {
        return diadiem;
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+lop;
    }
    
}
class DoanhNgiep_in{
    private String ma,name;
    private long sl;

    public DoanhNgiep_in(String ma, String name, String sl) {
        this.ma = ma;
        this.name = name;
        this.sl = Long.parseLong(sl);
    }

    public String getName() {
        return name;
    }

    public String getMa() {
        return ma;
    }

    public long getSl() {
        return sl;
    }
    
}
public class DanhSachThucTap3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1=new Scanner(new File("SINHVIEN.in"));
        long n1=Long.parseLong(sc1.nextLine());
        ArrayList<SinhVien_in>list1=new ArrayList<>();
        for(long i=1;i<=n1;i++){
            list1.add(new SinhVien_in(sc1.nextLine(),sc1.nextLine(),sc1.nextLine(),sc1.nextLine()));
        }
        Collections.sort(list1, Comparator.comparing(SinhVien_in::getMa));
        sc1.close();
        
        Scanner sc2=new Scanner(new File("DN.in"));
        long n2=Long.parseLong(sc2.nextLine());
        ArrayList<DoanhNgiep_in>list2=new ArrayList<>();
        for(long i=1;i<=n2;i++){
            list2.add(new DoanhNgiep_in(sc2.nextLine(),sc2.nextLine(),sc2.nextLine()));
        }
        sc2.close();
        
        Scanner sc3=new Scanner(new File("THUCTAP.in"));
        long n3=Long.parseLong(sc3.nextLine());
        for(long i=1;i<=n3;i++){
            String tmp[]=sc3.nextLine().split("\\s+");
            for(SinhVien_in x:list1){
                if(x.getMa().equals(tmp[0])){
                    x.setDiadiem(tmp[1]);
                    break;
                }
            }
        }
        
        long t=Long.parseLong(sc3.nextLine());
        for(long i=1;i<=t;i++){
            String idND=sc3.nextLine();
            String nameND="";
            long slND=0;
            for(DoanhNgiep_in x:list2){
                if(idND.equals(x.getMa())){
                    nameND=x.getName();
                    slND=x.getSl();
                    break;
                }
            }
            System.out.println("DANH SACH THUC TAP TAI " + nameND + ":");
            for(SinhVien_in y:list1){
                if(y.getDiadiem().equals(idND)){
                    if(slND==0){
                        break;
                    }
                    System.out.println(y);
                    slND--;
                }
            }
        }
    }
}
