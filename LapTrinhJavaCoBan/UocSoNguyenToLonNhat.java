
package CodeJava1.LapTrinhJavaCoBan;
import java.util.Scanner;
public class UocSoNguyenToLonNhat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
           long n=sc.nextLong();
           long res=n;
           while(n%2==0){
               n/=2;
               res=2;
           }
           for(int j=3;j<=Math.sqrt(n);j+=2){
               while(n%j==0){
                   n/=j;
                   res=j;
               }
           }
           if(n!=1) res=n;
           System.out.println(res);
        }
    } 
}
