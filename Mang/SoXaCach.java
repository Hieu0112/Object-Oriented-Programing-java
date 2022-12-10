
package CodeJava1.Mang;
import java.util.Scanner;
public class SoXaCach {
    static int[] a=new int[20];
    static int[] ok=new int[20];
    static int n=0;
    static Scanner sc=new Scanner(System.in);
    static void nhap(){
        n=sc.nextInt();
        for(int i=0;i<20;i++){
            ok[i]=0;
        }
    }
    static void xuat(){
        boolean check=true;
        String res="";
        for(int i=1;i<n;i++){
            res+=String.valueOf(a[i]);
            if(Math.abs(a[i]-a[i+1])==1) {
                check =false;
                break;
            }
        }
        res+=String.valueOf(a[n]);
        if(check)
            System.out.println(res);
    }
    static void solve(int i){
        for(int j=1;j<=n;j++){
            if(ok[j]==0){
                ok[j]=1;
                a[i]=j;
                if(i==n)    xuat();
                else solve(i+1);
                ok[j]=0;
            }
        }
    }
    public static void main(String[] args) {
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            nhap();
            solve(1);
        }
    }
}

