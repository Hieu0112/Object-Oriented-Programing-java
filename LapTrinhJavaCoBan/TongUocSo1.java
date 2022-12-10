
package CodeJava1.LapTrinhJavaCoBan;
import java.util.Scanner;
public class TongUocSo1 {
    public static long[] a=new long[2000001];
    public static void SoNT(){
        for(int i=2;i<2000001;i++){
            if(a[i]==0){
                for(int j=i;j<2000001;j+=i)
                    a[j]=i;
            }
        }
    }
    public static void main(String[] args) {
        SoNT();
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        long s=0;
        for(int ij=1;ij<=t;ij++){
            int n=sc.nextInt();
            while(n>1){
                s+=a[n];
                n/=a[n];
            }
        }
        System.out.println(s);
    }
}