
package CodeJava1.Mang;
import java.util.Scanner;
public class MaTranNhiPhan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] a=new int[n][3];
        int dem=0;
        for(int i=0;i<n;i++){
            int s0=0;
            for(int j=0;j<3;j++){
                a[i][j]=sc.nextInt();
                if(a[i][j]==0) s0++;
            }
            if(3-s0>s0) dem++;
        }
        System.out.println(dem);
    }
}
