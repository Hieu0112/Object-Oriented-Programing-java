
package CodeJava1.LapTrinhJavaCoBan;
import java.util.Scanner;
public class ChuSo4VaChuSo7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int dem=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='4'||str.charAt(i)=='7')
                dem++;
        }
        if(dem==4||dem==7)
            System.out.println("YES");
        else 
            System.out.println("NO");
    }
}
