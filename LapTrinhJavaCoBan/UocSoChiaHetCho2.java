
package CodeJava1.LapTrinhJavaCoBan;
import java.util.Scanner;
public class UocSoChiaHetCho2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int lap=1;lap<=t;lap++){
            int n=sc.nextInt();
            int dem=0;
            for(int i=1;i<=(int)Math.sqrt((double)n);i++){
                if(n%i==0){
                    int j=n/i;
                    if(i%2==0&&j%2==0&&i!=j)    dem+=2;
                    else if(i%2==0&&j%2==0&&i==j)    dem+=1;
                    else if(i%2==0&&j%2!=0) dem+=1;
                    else if(i%2!=0&&j%2==0) dem+=1;
                }
            }
            System.out.println(dem);
        }
    }
    
}
