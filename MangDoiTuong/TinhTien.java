
package CodeJava1.MangDoiTuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class Money{
    private String ma;
    public String name;
    public int sl;
    public long gia,ck;
    public Money(String a,String b,int c,long d,long e){
        this.ma=a;
        this.name=b;
        this.sl=c;
        this.gia=d;
        this.ck=e;
    }
    public long Giatien(){
        return gia*sl-ck;
    }
    @Override
    public String toString(){
        return ma+" "+name+" "+sl+" "+gia+" "+ck+" "+Giatien();
    }
    public int CompareTo(Money t){
        if(Giatien()-t.Giatien()<0) return 1;
        return -1;
    }
}
public class TinhTien {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<Money> list=new ArrayList<>();
        for (int i=1;i<=n;i++){
            Money a=new Money(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),Long.parseLong(sc.nextLine()),Long.parseLong(sc.nextLine()));
            list.add(a);
        }
        Collections.sort(list,Money::CompareTo);
        for (Money x:list)
            System.out.println(x);
    }
}