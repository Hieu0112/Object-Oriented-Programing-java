package CodeJava1.LapTrinhJavaCoBan;
import java.util.Scanner;
public class SoNguyenTo {
    public static boolean check(int n){
        if(n<2) return false;
        else {
            for(int i=2;i<Math.sqrt(n);i++)
                if(n%i==0)
                    return false;
        return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int so=sc.nextInt();
            if(check(so))   System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
