
package CodeJava1.LapTrinhJavaCoBan;
import java.util.Scanner;
import java.lang.Math;
public class SoLienKe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.next());
        for(int i=1;i<=t;i++){
            boolean ok=true;
            String str=sc.next();
            for(int j=0;j<str.length()-1;j++){
                if(Math.abs(str.charAt(j)-str.charAt(j+1))!=1){
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
