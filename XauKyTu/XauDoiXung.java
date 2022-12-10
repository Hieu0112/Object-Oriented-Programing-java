
package CodeJava1.XauKyTu;
import java.util.Scanner;
public class XauDoiXung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int ij=1;ij<=t;ij++){
            String s= sc.next();
            char[] a=s.toCharArray();
            long Sum=0;
            for(int i=0;i<a.length/2;i++){
                if(a[i]!=a[a.length-1-i])   Sum++;
            }
            if(Sum==1||(a.length%2!=0&&Sum==0)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}