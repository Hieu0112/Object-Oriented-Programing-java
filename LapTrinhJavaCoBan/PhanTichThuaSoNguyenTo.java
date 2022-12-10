
package CodeJava1.LapTrinhJavaCoBan;
import java.util.Scanner;


public class PhanTichThuaSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
           int n=sc.nextInt();
           int dem=0;
           while(n%2==0){
               n/=2;
               dem++;
           }
            System.out.print("Test "+i+": ");
           if(dem!=0) 
                System.out.print(2+"("+dem+") ");
           for(int j=3;j<=Math.sqrt(n);j+=2){
               dem=0;
               while(n%j==0){
                   n/=j;
                   dem++;
               }
               if(dem!=0) 
                System.out.print(j+"("+dem+") ");
           }
           if(n!=1) System.out.print(n+"(1)");
           System.out.println();
        }
    }  
}
