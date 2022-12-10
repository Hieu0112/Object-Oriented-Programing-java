package CodeJava1.LapTrinhJavaCoBan;
import java.util.Scanner;
public class BoiSoChung_UocSoChung {
    public static long USC(long a,long b){
        while(a*b!=0){
            if(a>b) a%=b;
            else b%=a;
        }
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            long a=sc.nextLong();
            long b=sc.nextLong();
            long res=USC(a, b);
            System.out.println(a*b/res+" "+res);
        }
    }
}
