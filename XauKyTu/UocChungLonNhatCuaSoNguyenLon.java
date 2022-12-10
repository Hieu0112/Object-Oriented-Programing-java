
package CodeJava1.XauKyTu;
import java.util.Scanner;
public class UocChungLonNhatCuaSoNguyenLon {
    static long GCD(long a,long b){
        while(a*b!=0){
            if(a>b) a%=b;
            else b%=a;
        }
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        for(int ij=1;ij<=t;ij++){
            long a=Long.parseLong(sc.nextLine());
            String b=sc.nextLine();
            long res=0;
            for(int i=0;i<b.length();i++){
                res=(10*res+(b.charAt(i)-'0'))%a;
            }
            System.out.println(GCD(res,a));
        }
    }
}
