
package CodeJava1.LapTrinhJavaCoBan;
import java.util.Scanner;
public class ChiaTamGiac {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            int N=sc.nextInt();
            int H=sc.nextInt();
            for(int j=1;j<N;j++){
                double S=((double)j)*H*H;
                System.out.format("%.6f ",Math.sqrt(S/N));
            }
            System.out.println("");
        }
    }
}
