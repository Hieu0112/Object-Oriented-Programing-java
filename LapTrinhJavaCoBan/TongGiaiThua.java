
package CodeJava1.LapTrinhJavaCoBan;

import java.util.Scanner;
public class TongGiaiThua {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        long res=0,s=1;
        for(int i=1;i<=n;i++){
            s*=i;
            res+=s;
        }
        System.out.println(res);
    }
}
