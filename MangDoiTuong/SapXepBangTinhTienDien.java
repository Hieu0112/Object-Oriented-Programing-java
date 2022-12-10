
package CodeJava1.MangDoiTuong;
import java.util.*;
class TienDien{
    private String loai;
    private long cu,moi,heso;
    private String ma;
    public TienDien(String loai, long cu, long moi,int i) {
        this.loai = loai;
        this.cu = cu;
        this.moi = moi;
        this.ma="KH"+String.format("%02d",i);
        if(loai.equals("KD"))
            this.heso=3;
        else if(loai.equals("NN"))
            this.heso=5;
        else if(loai.equals("TT"))
            this.heso=4;
        else
            this.heso=2;
    }

    public long Tien() {
        return heso*(moi-cu)*550;
    }
    public long phuTroi() {
        if(moi-cu<50)   return 0;
        else if(moi-cu<=100)
            return Math.round((double)Tien()*35/100);
        else return Tien();
    }

    public long FULL() {
        return Tien()+phuTroi();
    }

    @Override
    public String toString() {
        return ma+" "+heso+" "+Tien()+" "+phuTroi()+" "+FULL();
    }
    
}
public class SapXepBangTinhTienDien {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<TienDien>list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            list.add(new TienDien(sc.nextLine(),Long.parseLong(sc.nextLine()),Long.parseLong(sc.nextLine()),i));
        }
        Collections.sort(list, Comparator.comparingLong(TienDien::FULL).reversed());
        for(TienDien x:list){
            System.out.println(x);
        }
    }
}
