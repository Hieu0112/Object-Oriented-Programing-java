
package CodeJava1.MangDoiTuong;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class DXD{
    private String ma="";
    private Date begin;
    private String name;
    private String location;
    private Date time;
    SimpleDateFormat sdf=new SimpleDateFormat("h:mm");
    public DXD(String name,String location,String time) throws ParseException{
        this.begin=sdf.parse("6:00");
        this.name=name;
        this.location=location;
        this.time=sdf.parse(time);
    }

    public String getMa() {
        String[] a=name.split(" ");
        String[] b=location.split(" ");
        for(int i=0;i<b.length;i++)
            ma+=b[i].charAt(0);
        for (int i=0;i<a.length;i++)
            ma+=a[i].charAt(0);
        return ma;
    }
    public long getTimes(){
        return (time.getTime()- begin.getTime())/1000;
    }
    public long VanToc(){
        double v=3.6*120000/getTimes();
        return Math.round(v);
    }
    public double SoSanh(){
        return 3.6*120000/getTimes();
    }
    @Override
    public String toString() {
        return getMa() + " " +
                 name + " " +
                 location + " " + VanToc()+" "+"Km/h";
    }
}
public class DuaXeDap {
    public static void main(String[] args) throws ParseException{
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<DXD> list=new ArrayList<>();
        for (int i=1;i<=n;i++){
            DXD a=new DXD(sc.nextLine(), sc.nextLine(), sc.nextLine());
            list.add(a);
        }
        Collections.sort(list, Comparator.comparingDouble(DXD::SoSanh).reversed());
        for (DXD x:list)
            System.out.println(x.toString());
    }
}
