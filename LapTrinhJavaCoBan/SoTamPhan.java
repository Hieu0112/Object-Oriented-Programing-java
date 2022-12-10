
package CodeJava1.LapTrinhJavaCoBan;
import java.util.Scanner;
public class SoTamPhan {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        for(int lap=1;lap<=t;lap++){
            String s=sc.next();
            boolean ok=true;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)>='3'){
                ok=false;
                break;
            }
        }
            if(ok)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
