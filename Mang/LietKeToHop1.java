
package CodeJava1.Mang;
import java.util.Scanner;
public class LietKeToHop1 {
    static int[] a=new int[20];
    static int n=0,k=0,dem=0;
    static Scanner sc=new Scanner(System.in);
    static void nhap(){
        n=sc.nextInt();
        k=sc.nextInt();
        a[0]=0;
    }
    static void xuat(){
        dem++;
        for(int i=1;i<=k;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    static void solve(int i){
        for(int j=a[i-1]+1;j<=n-k+i;j++){
            a[i]=j;
            if(i==k)    xuat();
            else solve(i+1);
        }
    }
    public static void main(String[] args) {
        nhap();
        solve(1);
        System.out.println("Tong cong co "+dem+" to hop");
    }
}
