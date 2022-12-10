package CodeJava1.MangDoiTuong;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
class TranDau{
    private String matrandau;
    private long cdv;
    public TranDau(String matrandau,long cdv){
        this.matrandau=matrandau;
        this.cdv=cdv;
    }

    public long getCdv() {
        return cdv;
    }

    public String getMatrandau() {
        return matrandau;
    }
}
class CauLacBo{
    private TranDau[] tranDau;
    private String maCLB;
    private String nameCLB;
    private long gia;
    public CauLacBo(TranDau[] tranDau,String maCLB,String nameCLB,long gia){
        this.tranDau=tranDau;
        this.maCLB=maCLB;
        this.nameCLB=nameCLB;
        this.gia=gia;
    }

    public String getMaCLB() {
        return maCLB;
    }

    public void setTranDau(TranDau[] tranDau) {
        this.tranDau = tranDau;
    }

    public TranDau[] getTranDau() {
        return tranDau;
    }

    public void getDoanhThu() {
        for (int i=0;i<tranDau.length;i++)
            System.out.println(tranDau[i].getMatrandau()+" "+nameCLB+" "+(tranDau[i].getCdv()*gia));
    }
}
public class CauLacBoBongDas {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<CauLacBo>list=new ArrayList<>();
        int n=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=n;i++){
            CauLacBo lis=new CauLacBo(new TranDau[0],sc.nextLine(),sc.nextLine(),Long.parseLong(sc.nextLine()));
            list.add(lis);
        }
        int m=Integer.parseInt(sc.nextLine());
        String ma;
        long AmountOfPeople;
        for (int i=1;i<=m;i++){
            String str=sc.nextLine();
            String[] strs=str.split(" ");
            ma=strs[0];
            AmountOfPeople=Long.parseLong(strs[1]);
            TranDau td=new TranDau(ma,AmountOfPeople);
            for(int j=0;j< list.size();j++){
                if(ma.contains(list.get(j).getMaCLB())){
                    TranDau[] tmp= Arrays.copyOf(list.get(j).getTranDau(),list.get(j).getTranDau().length+1);
                    tmp[list.get(j).getTranDau().length]=td;
                    list.get(j).setTranDau(tmp);
                    break;
                }
            }
        }
        for(CauLacBo x:list)
            x.getDoanhThu();
    }
}

