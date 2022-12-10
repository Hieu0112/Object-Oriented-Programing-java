
package CodeJava1.Mang;
import java.util.Scanner;
import java.util.Arrays;
public class DayConCoKPhanTuTangDan {
   static int n,k;
   static int[] a = new int[100];
   static int[] c = new int[100];
   
   static void Solve(){
           for(int i = 1; i <= k; i++) 
               System.out.print(a[c[i]] + " ");
       System.out.println();
   }
   static void Try(int i){
       for(int j = c[i-1]+1; j <= n-k+i; j++){
           c[i] = j;
           if(i == k) Solve();
           else Try(i+1);
       }
   }
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       while(t --> 0){
           n = sc.nextInt();
           k = sc.nextInt();
           for(int i = 1; i <= n; i++) a[i] = sc.nextInt();
           Arrays.sort(a,1,n+1);
           Try(1);
       }
   }
}

