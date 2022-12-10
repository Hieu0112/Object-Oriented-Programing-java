package CodeJava1.MangDoiTuong;


import java.util.*;
class nv{
    private String name,ma;
    private int bSal;
    private int nCong,sum;
    private String pos;

    public nv(int i,String name,int bSal,int nCong,String pos){
        this.name = name;
        this.bSal = bSal;
        this.nCong = nCong;
        this.pos = pos;
        this.ma = "NV"+String.format("%02d", i);
    }
    public int getmonthSal(){
        return bSal*nCong;
    }
    public int getBonus(){
        if(nCong >= 25) return 20*getmonthSal()/100;
        else if(nCong >= 22) return 10*getmonthSal()/100;
        return 0;
    }
    public int getAllowence(){
        if(pos.equals("GD")) return 250000;
        else if(pos.equals("PGD")) return 200000;
        if(pos.equals("TP")) return 180000;
        return 150000;
    }

    public int Luong() {
        return getmonthSal()+getBonus()+getAllowence();
    }

    @Override
    public String toString() {
        return ma+" "+name+" "+getmonthSal()+" "+getBonus()+" "+getAllowence()+" "+Luong();
    }
    

}
public class SapXepBangTinhCong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<nv> ls = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            ls.add(new nv(i,sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()),sc.nextLine()));
        }
        Collections.sort(ls, Comparator.comparingInt(nv::Luong).reversed());
        for(nv x:ls){
            System.out.println(x);
        }
    }
}
