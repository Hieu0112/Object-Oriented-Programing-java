package CodeJava1.Mang;
import java.util.Scanner;
public class BoiSoNhoNhatCuaNSoNguyenDuongDauTien {
    public static long BSC(long a,long b){
        long res=a*b;
        while(a*b!=0){
            if(a>b) a%=b;
            else b%=a;
        }
        return res/(a+b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            long BSNN =1;
            long n=sc.nextLong();
            for(long j=1;j<=n;j++)
            BSNN=BSC(BSNN,j);
            System.out.println(BSNN);
        }
    }
}