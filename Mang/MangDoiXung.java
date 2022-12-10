
package CodeJava1.Mang;
import java.util.Scanner;
public class MangDoiXung {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int lap=1;lap<=t;lap++){
            int n=sc.nextInt();
            int[] arr=new int[n+1];
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
            boolean ok=true;
            for(int i=0;i<n/2;i++){
                if(arr[i]!=arr[n-1-i]){
                    ok=false;
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
