
package CodeJava1.Mang;
import java.util.Scanner;
public class BoSungDaySo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n+1];
        int maxs=0;
        a[0]=0;
        for(int i=1;i<=n;i++){
            a[i]=sc.nextInt();
            maxs=Math.max(maxs,a[i]);
        }
        boolean ok=true;
        for(int i=0;i<n;i++){
            int k=1;
            while(a[i]+k!=a[i+1]){
                ok=false;
                System.out.println(a[i]+k);
                k++;
            }
        }
        if(ok) System.out.println("Excellent!");
    }
}
