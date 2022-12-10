
package CodeJava1.XauKyTu;
import java.util.Scanner;
public class ChiaHetCho11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.next();
            int sum = 0;
            for(int i = 0; i < s.length(); i++){
                if(i % 2 == 0) sum += s.charAt(i)-'0';
                else sum -= s.charAt(i)-'0';
            }
            if(sum % 11 == 0) System.out.println(1);
            else System.out.println(0);
        }
    }
}
