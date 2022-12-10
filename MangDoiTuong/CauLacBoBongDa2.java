package CodeJava1.MangDoiTuong;
import java.util.*;
class TranDau{
    private CauLacBo caulacbo;
    private String matrandau;
    private long cdv;
    public TranDau(CauLacBo caulacbo, String matrandau,long cdv){
        this.caulacbo=caulacbo;
        this.matrandau=matrandau;
        this.cdv=cdv;
    }
    
    public CauLacBo getCaulacbo() {
        return caulacbo;
    }

    public String getNameCaulacbo() {
        return caulacbo.getNameCLB();
    }
    
    public String getMatrandau() {
        return matrandau;
    }
    public long getDoanhThu(){
        return cdv*caulacbo.getGia();
    }
    @Override
    public String toString() {
        return matrandau + " " + caulacbo.getNameCLB() + " " + getDoanhThu();
    }
}
class CauLacBo{
    private String maCLB;
    private String nameCLB;
    private long gia;
    public CauLacBo(String maCLB,String nameCLB,long gia){
        this.maCLB=maCLB;
        this.nameCLB=nameCLB;
        this.gia=gia;
    }

    public String getNameCLB() {
        return nameCLB;
    }
    
    public String getMaCLB() {
        return maCLB;
    }

    public long getGia() {
        return gia;
    }
    
}
public class CauLacBoBongDa2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<CauLacBo>list=new ArrayList<>();
        int n=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=n;i++){
            CauLacBo lis=new CauLacBo(sc.nextLine(),sc.nextLine(),Long.parseLong(sc.nextLine()));
            list.add(lis);
        }
        
        int m=Integer.parseInt(sc.nextLine());
        String ma;
        long Audience;
        ArrayList<TranDau>Ds=new ArrayList<>();
        for (int i=1;i<=m;i++){
            String str=sc.nextLine();
            String[] strs=str.split(" ");
            ma=strs[0];
            Audience=Long.parseLong(strs[1]);
            for(int j=0;j< list.size();j++){
                if(ma.contains(list.get(j).getMaCLB())){
                    TranDau tmp=new TranDau(list.get(j),ma,Audience);
                    Ds.add(tmp);
                    break;
                }
            }
        }
        Collections.sort(Ds,Comparator.comparingLong(TranDau::getDoanhThu).reversed().thenComparing(TranDau::getNameCaulacbo));
//        Collections.sort(Ds,Comparator.comparing(a -> ((TranDau)a).getDoanhThu()).reversed().thenComparing(a -> ((TranDau)a).getCaulacbo().getNameCLB()));
            for(TranDau x:Ds)
            {
                System.out.println(x.toString());
            }
    }
}
