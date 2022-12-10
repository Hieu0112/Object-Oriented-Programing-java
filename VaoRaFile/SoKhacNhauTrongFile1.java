package VaoRaFile;




import java.io.*;
import java.util.*;
class So{
    private int a;
    private int dem;
    public So(int a, int dem) {
        this.a = a;
        this.dem = dem;
    }
    public void setDem(int dem){
        this.dem = dem;
    }
    public int getDem() {
        return dem;
    }
    public int getA() {
        return a;
    }
}
public class SoKhacNhauTrongFile1 {
    public static void main(String[] args) {
        try {
            File file=new File("DATA.in");
            Scanner sc=new Scanner(file);
            ArrayList<So> list=new ArrayList<So>();
            while(sc.hasNext()){
                String x=sc.next();
                int so=Integer.parseInt(x);
                boolean ok=true;
                for(So x1:list){
                if(so==x1.getA()){
                    ok=false;
                    x1.setDem(x1.getDem()+1);
                    break;
                    }
                }
                if(ok){
                    So res=new So(so,1);
                    list.add(res);
                }
            }
            Collections.sort(list,Comparator.comparingInt(So::getA));
            for(So res:list){
                System.out.println(res.getA()+" "+res.getDem());
            }
            sc.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}

