
package CodeJava1.MangDoiTuong;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Time{
    private int gio,phut,giay;

    public Time(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }

    public int getGiay() {
        return giay;
    }

    public int getPhut() {
        return phut;
    }
    
    public int getGio() {
        return gio;
    }

    @Override
    public String toString() {
        return gio + " " + phut + " " +giay; 
    }
}

public class SapXepThoiGian {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Time> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new Time(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(list,Comparator.comparingInt(Time::getGio).thenComparing(Time::getPhut).thenComparing(Time::getGiay));
        for(Time x:list){
            System.out.println(x.toString());
        }
    }
}
