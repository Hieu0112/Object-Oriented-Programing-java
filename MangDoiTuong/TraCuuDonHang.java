package CodeJava1.MangDoiTuong;


import java.util.*;
class DH{
    private String ten,ma;
    private long gia,sl;
    public DH(String ten,String ma,long gia, long sl){
        this.ten = ten;
        this.ma = ma;
        this.gia = gia;
        this.sl = sl;
    } 
    public String getTT(){
        return  ma.substring(1,4);
    }
    public long getGG(){
        if(ma.charAt(4) == '2') return 30*gia*sl/100;
        return 50*gia*sl/100;
    }
    public long getSum(){
        return gia*sl-getGG();
    }
    @Override
    public String toString(){
        return ten+" "+ma+" "+ getTT()+" "+getGG()+" "+ getSum();
    }
}
public class TraCuuDonHang {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<DH> ls = new ArrayList<>();
        while(t-- > 0){
            String ten = sc.nextLine();
            String ma = sc.nextLine();
            long gia = Long.parseLong(sc.nextLine());
            long sl = Long.parseLong(sc.nextLine());
            ls.add(new DH(ten,ma,gia,sl));
        }
//        Collections.sort(ls,Comparator.comparing(DH::getTT));
        for(DH x: ls) System.out.println(x);
    }
}
