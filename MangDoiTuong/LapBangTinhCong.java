
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
    public String getMa(){
        return ma;
    }
    public String getName(){
        return name;
    }
    public int getbSal(){
        return bSal;
    }
    public int getnCong(){
        return nCong;
    }
    public String getPos(){
        return pos;
    }
    public int getmonthSal(){
        return bSal*nCong;
    }
    public int getBonus(){
        if(nCong >= 25) return 20*getmonthSal()/100;
        else if(nCong >= 22) return 10*getmonthSal()/100;
        return 0;
    }
    public int getAllowence(String pos){
        if(pos.compareTo("GD") == 0) return 250000;
        if(pos.compareTo("PGD") == 0) return 200000;
        if(pos.compareTo("TP") == 0) return 180000;
        return 150000;
    }
    public void setSum(int x){
        this.sum = x;
    }
    public int getSum(){
        return sum;
    }
 

}
public class LapBangTinhCong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<nv> ls = new ArrayList<>();
        for(int i = 1; i <= t; i++){
            String name = sc.nextLine();
            int bSal = Integer.parseInt(sc.nextLine());
            int nCong = Integer.parseInt(sc.nextLine());
            String pos = sc.nextLine();
            ls.add(new nv(i,name,bSal,nCong,pos));
        }
        for(nv x: ls) {
            x.setSum(x.getmonthSal()+x.getBonus()+x.getAllowence(x.getPos()));
        }
//        Collections.sort(ls,Comparator.comparingInt(nv::getSum).reversed());
        for(nv x: ls) {
            
            System.out.println(x.getMa()+" "+x.getName()+" "+x.getmonthSal()+" "+x.getBonus()+" "+x.getAllowence(x.getPos())+" "+x.getSum());
        }
    }
}
