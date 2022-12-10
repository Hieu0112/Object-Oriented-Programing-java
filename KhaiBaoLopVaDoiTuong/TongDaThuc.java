
package CodeJava1.KhaiBaoLopVaDoiTuong;

import java.util.Scanner;
class PhanTu{
    private int coSo,mu;

    public PhanTu(String pt) {
        int so=0,smu=0;
        int i=0,iij=pt.length()-1;
        while(pt.charAt(i)>='0'&&pt.charAt(i)<='9'){
            so=so*10+(pt.charAt(i)-'0');
            i++;
        }
        while(pt.charAt(iij)>='0'&&pt.charAt(iij)<='9'&&iij>0){
            iij--;
        }
        i=iij+1;
        pt=pt+'a';
        while(pt.charAt(i)>='0'&&pt.charAt(i)<='9'&&i<=pt.length()-1){
            smu=smu*10+(pt.charAt(i)-'0');
            i++;
        }
        this.coSo = so;
        this.mu = smu;
    }

    public PhanTu(int coSo, int mu) {
        this.coSo = coSo;
        this.mu = mu;
    }
    
    public int getCoSo() {
        return coSo;
    }

    public int getMu() {
        return mu;
    }
 
   @Override
    public String toString() {
        return coSo+"*x^"+mu;
    }
    
}
class DaThuc{
    private String[] dathuc;
    private PhanTu[] dangthuc;
    public DaThuc(String dathuc) {
        String[] dtmp=dathuc.replace(" ", "").split("\\+");
        this.dathuc = dtmp;
        PhanTu[] dt= new PhanTu[dtmp.length];
        for(int i=0;i<dtmp.length;i++){
            dt[i]=new PhanTu(dtmp[i]);
        }
        this.dangthuc=dt;
    }

    public DaThuc(PhanTu[] dangthuc) {
        this.dangthuc = dangthuc;
    }
    
    public PhanTu[] getDangthuc() {
        return dangthuc;
    }
    
    public DaThuc cong(DaThuc p){
        PhanTu[] p_tmp=p.getDangthuc();
        int n =Math.max(p_tmp[0].getMu(),dangthuc[0].getMu());
        PhanTu[] res=new PhanTu[n+1];
        int j=0;
        for(int i=n;i>=0;i--){
            int cs=0,mu=0;
            
            for(int j1=p_tmp.length-1;j1>=0;j1--){
                if(p_tmp[j1].getMu()==i){
                    cs+=p_tmp[j1].getCoSo();
                    mu+=p_tmp[j1].getMu();
                    break;
                }
                if(p_tmp[j1].getMu()>i) break;
            }
            
            for(int j2=dangthuc.length-1;j2>=0;j2--){
                if(dangthuc[j2].getMu()==i){
                    cs+=dangthuc[j2].getCoSo();
                    if(mu==0)
                        mu+=dangthuc[j2].getMu();
                    break;
                }
                if(dangthuc[j2].getMu()>i) break;
            }
            if(cs!=0){
                res[j++]=new PhanTu(cs,mu);
            }
        }
            PhanTu[] ress=new PhanTu[j];
            for(int ij=0;ij<j;ij++){
                ress[ij]=res[ij];
            }
        return new DaThuc(ress);
    }

    @Override
    public String toString() {
        String res="";
        for(int i=0;i<dangthuc.length;i++){
                res+=dangthuc[i].toString();
                if(i!=dangthuc.length-1) res+=" + ";
        }
        return res;
    }
}
public class TongDaThuc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            DaThuc p = new DaThuc(sc.nextLine());
            DaThuc q = new DaThuc(sc.nextLine());
            DaThuc r = p.cong(q);
            System.out.println(r);
        }
    }
}
