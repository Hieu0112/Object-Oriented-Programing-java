
package CodeJava1.LapTrinhJavaCoBan;
import java.util.Scanner;
public class XauNhiPhan {
    public static long[] lth=new long[94];
    static void INIT(){
        lth[1]=1;
        lth[2]=1;
        for(int i=3;i<=92;i++)
            lth[i]=lth[i-2]+lth[i-1];
    }
    public static long XauNhiPhans(int n,long k){
        if(n<=2)    return n-1;
        else if(k <= lth[n-2])    
            return XauNhiPhans(n-2,k);
        else 
            return XauNhiPhans(n-1, k-lth[n-2]);
    }
    public static void main(String[] args) {
        INIT();
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            int N=sc.nextInt();
            long K=sc.nextLong();
            System.out.println(XauNhiPhans(N,K));
        }
    }
}
