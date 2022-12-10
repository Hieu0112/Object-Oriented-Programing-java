
package CodeJava1.LapTrinhJavaCoBan;
import java.util.Scanner;
public class KiemTraSoFibonaci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            long n=sc.nextLong();
            long a=0,b=1,c=0;
            boolean ok=false;
            while(c<=n){
                c=a+b;
                a=b;
                b=c;
                if(c==n||n==0) {
                ok=true;
                break;
                }
            }
        if(ok)
            System.out.println("YES");
        else 
            System.out.println("NO");
        }
    }
}
