package MangDoiTuong;


import java.util.*;
class gv{
    private String id,name;
    private int bSal;
    
    public gv(String id,String name,int bSal){
        this.id = id;
        this.name = name;
        this.bSal = bSal;
    }
    public int getBac(){
        return Integer.parseInt(id.substring(2));
    }
    public int getBonus(){
        if(id.contains("HT")) 
            return 2000000;
        if(id.contains("HP")) 
            return 900000;
        return 500000;
    }
    public int getSal(){
        return getBac()*bSal+getBonus();
    }
    @Override
    public String toString(){
        return id+" "+name+" "+getBac()+" "+getBonus()+" "+getSal();
    }
}
public class BangThuNhapGiaoVien {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<gv> ls = new ArrayList<>();
        int cntHT = 0, cntHP = 0;
        while(t-- > 0){
            String id = sc.nextLine();
            String name = sc.nextLine();
            int sal = Integer.parseInt(sc.nextLine());
            if(id.substring(0,2).compareTo("HT")==0) cntHT++;
            if(id.substring(0,2).compareTo("HP")==0) cntHP++;
            if(cntHT > 1 && id.contains("HT") || cntHP > 2 
                    && id.contains("HP")) continue;
            ls.add(new gv(id,name,sal));
        }
        for(gv x:ls) 
            System.out.println(x);
    }
}
