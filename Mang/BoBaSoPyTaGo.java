
package CodeJava1.Mang;
import java.util.Scanner;
public class BoBaSoPyTaGo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            long[] a = new long[n];
            for(int i = 0; i < n; i++){
                long so=sc.nextLong();
                a[i]=so*so;
            }
            int x =0,y=n-2,z=n-1;
            boolean check=true;
            while(z >= 2){
                if(a[x]+a[y]>a[z]) y--;
                else if(a[x]+a[y]<a[z]) x++;
                else{
                    check=false;
                    break;
                }
                if(x==y){
                    x=0;
                    z--;
                    y=z-1;
                }
            }
            if(!check) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}

