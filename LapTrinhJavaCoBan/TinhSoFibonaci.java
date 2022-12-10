
package CodeJava1.LapTrinhJavaCoBan;
import java.util.Scanner;
public class TinhSoFibonaci {
    public static void main(String[] args) {
        long[] res=new long[93];
        res[0]=0;
        res[1]=1;
        for(int i=2;i<93;i++){
        res[i]=res[i-1]+res[i-2];
        }
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int lap=0;lap<t;lap++){
            int n=sc.nextInt();
            System.out.println(res[n]);   
        }
    }
}
