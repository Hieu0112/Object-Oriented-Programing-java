
package CodeJava1.LapTrinhJavaCoBan;
import java.util.Scanner;
public class SoKhongLienKe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.next());
        for(int i=1;i<=t;i++){
            boolean ok=true;
            int sum=0;
            String str=sc.next();
            for(int j=0;j<str.length()-1;j++){
                sum+=str.charAt(j)-'0';
                if(Math.abs(str.charAt(j)-str.charAt(j+1))!=2){
                    ok=false;
                    break;
                }
            }
            sum+=str.charAt(str.length()-1)-'0';
            if(ok&&sum%10==0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
