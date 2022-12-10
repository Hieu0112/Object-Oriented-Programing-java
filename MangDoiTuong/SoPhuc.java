package CodeJava1.MangDoiTuong;
import java.util.Scanner;
class So{
    private int thuc;
    private  int ao;
    public So(int thuc,int ao){
        this.thuc=thuc;
        this.ao=ao;
    }
    public int getThuc() {
        return thuc;
    }
    public int getAo() {
        return ao;
    }
}
class Tinh{
    private So a;
    private So b;
    public Tinh(){

    }
    public Tinh(So a,So b){
        this.a=a;
        this.b=b;
    }
    public So Tich(){
        int x=a.getThuc()+b.getThuc();
        int y=a.getAo()+b.getAo();
        int thuc=a.getThuc()*x-a.getAo()*y;
        int ao =a.getAo()*x+a.getThuc()*y;
        So result1=new So(thuc,ao);
        return result1;
    }
    public So BPtong(){
        int x=a.getThuc()+b.getThuc();
        int y=a.getAo()+b.getAo();
        int thuc=x*x-y*y;
        int ao =2*x*y;
        So result2=new So(thuc,ao);
        return result2;
    }
}
public class SoPhuc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            t--;
        int a1=sc.nextInt();
        int b1=sc.nextInt();
        int a2=sc.nextInt();
        int b2=sc.nextInt();
        So a=new So(a1,b1);
        So b=new So(a2,b2);
        Tinh result=new Tinh(a,b);
        So res1=result.Tich();
        So res2=result.BPtong();
        char x='+';
        int s1=res1.getAo();
        if(s1<0) { 
            x='-';
            s1=-s1;
        }
        System.out.print(res1.getThuc()+" "+x+" "+s1+"i");
        System.out.print(", ");
        int s2=res2.getAo();
        char xs='+';
        if(s2<0) { 
            xs='-';
            s2=-s2;
        }
        System.out.print(res2.getThuc()+" "+xs+" "+s2+"i\n");
        } 
    }
}
