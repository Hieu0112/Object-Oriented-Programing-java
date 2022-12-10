
package CodeJava1.LapTrinhJavaCoBan;
import java.util.Scanner;
public class SoChinhPhuong {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        for(int lap=1;lap<=t;lap++){
            int n=sc.nextInt();
            double a=Math.sqrt((double)n);
            if((int)a*(int)a==n)
                System.out.println("YES");
            else 
                System.out.println("NO");
        }
    }
}
