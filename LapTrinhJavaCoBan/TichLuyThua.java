
package CodeJava1.LapTrinhJavaCoBan;
import java.util.Scanner;
public class TichLuyThua {
    public static long mod=1000000007;
    public static long MOD(long a,long b){
        if(b==0)    return 1;
        else {
            long so=b/2;
            long x=MOD(a,so)%mod;
            if(b%2==0)  return (x*x)%mod;
            else return (a*((x*x)%mod))%mod;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long a,b;
        while(true){
            a=sc.nextLong();
            b=sc.nextLong();
            if(a==0&&b==0)  break;
            System.out.println(MOD(a,b));
        }
    }
}
