package VaoRaFile;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

class Time{
    private String name;
    private int phut;
    private Date start, end;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private int setphut(String a){
        return Integer.parseInt(a.substring(0,2)) * 60 + Integer.parseInt(a.substring(3, 5));
    }
    private int settime(){
        long diff = end.getTime() - start.getTime();
        return (int)TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }
    public Time(String name, String a, String b, String c, String d) throws Exception{
        this.name = name;
        this.start = sdf.parse(a);
        this.end = sdf.parse(c);
        this.phut = setphut(d) - setphut(b) + settime() * 24 * 60;
    }

    public int getphut(){
        return phut;
    }

    public String getname(){
        return name;
    }

    @Override
    public String toString(){
        return name + " " + phut;
    }
}
public class ThoiGianOnlineLienTuc{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("ONLINE.in"));
        ArrayList<Time> a = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String name=sc.nextLine();
            String[]x=sc.nextLine().split("\\s+");
            String[]y=sc.nextLine().split("\\s+");
            a.add(new Time(name,x[0] ,x[1], y[0], y[1]));
        }
        Collections.sort(a, (Time o1, Time o2) -> {
            if(o1.getphut() != o2.getphut()) return o2.getphut() - o1.getphut();
            return o1.getname().compareTo(o2.getname());
        });
        for(Time x : a)
            System.out.println(x);
    }
}