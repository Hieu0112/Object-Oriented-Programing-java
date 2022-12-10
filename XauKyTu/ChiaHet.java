
package CodeJava1.XauKyTu;
import java.util.Scanner;
import java.math.BigInteger;
public class ChiaHet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            BigInteger a=sc.nextBigInteger();
            BigInteger b=sc.nextBigInteger();
            BigInteger S0 =new BigInteger("0");
            if((a.mod(b)).equals(S0)||(b.mod(a)).equals(S0)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
