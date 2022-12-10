
package CodeJava1.XauKyTu;
import java.util.Scanner;
public class XauKhacNhauDaiNhat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int ij=1;ij<=t;ij++){
            String A=sc.next();
            String B=sc.next();
            if(A.equals(B))
                System.out.println("-1");
            else
                System.out.println(Math.max(A.length(),B.length()));
        }
    }
}
