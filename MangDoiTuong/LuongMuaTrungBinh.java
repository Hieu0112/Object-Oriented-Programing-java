
package CodeJava1.MangDoiTuong;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import java.util.Date;
import java.util.Scanner;

class TramDo{
    private Date time1;
    private Date time2;
    private double rain;
    private SimpleDateFormat sdf=new SimpleDateFormat("hh:mm");
    public TramDo(String a,String b,String c)throws ParseException{
        this.time1=sdf.parse(a);
        this.time2=sdf.parse(b);
        this.rain=Double.parseDouble(c);
    }
    public long getTimes(){
        return (time2.getTime()-time1.getTime())/1000;
    }

    public double getRain() {
        return rain;
    }
}
class InfoMua{
    private String ma;
    private String name;
    private TramDo[] tramdo;
    public InfoMua(String a,String b,TramDo[] tramdo){
        this.ma=a;
        this.name=b;
        this.tramdo=tramdo;
    }
    public void setTramdo(TramDo[] tramdo) {
        this.tramdo = tramdo;
    }

    public TramDo[] getTramdo() {
        return tramdo;
    }
    public String getName() {
        return name;
    }
    public double TB(){
        double mua=0;
        long sumTime=0;
        for(int i=0;i< tramdo.length;i++){
            sumTime+= tramdo[i].getTimes();
            mua+=tramdo[i].getRain();
        }
        return (3600*mua/((double)sumTime));
    }
    @Override
    public String toString() {
        return  ma + " " +
                " " + name + " " +
                " "+ String.format("%.2f",TB());
    }
}
public class LuongMuaTrungBinh {
    public static void main(String[] args) throws ParseException{
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        int tt=0;
        ArrayList<InfoMua> list=new ArrayList<>();
        String a ,b ,c , d;
        String res;
        for(int i=1;i<=n;i++){
            a= sc.nextLine();
            b= sc.nextLine();
            c= sc.nextLine();
            d= sc.nextLine();
            boolean ok=true;
            for(int j=0;j<list.size();j++){
                if((list.get(j).getName()).equals(a)==true){
                    TramDo[] tmp=new TramDo[list.get(j).getTramdo().length+1];
                    for(int k=0;k<list.get(j).getTramdo().length;k++)
                        tmp[k]=list.get(j).getTramdo()[k];
                    tmp[list.get(j).getTramdo().length]=new TramDo(b,c,d);
                    list.get(j).setTramdo(tmp);
                    ok=false;
                    break;
                }
            }
            if(ok){
                tt++;
                res="T"+String.format("%02d",tt);
                TramDo[] kq=new TramDo[1];
                kq[0]=new TramDo(b,c,d);
                InfoMua tmps=new InfoMua(res,a,kq);
                list.add(tmps);
            }
        }
        for (InfoMua x:list)
            System.out.println(x.toString());
    }
}

