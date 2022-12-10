
package CodeJava1.Mang;
import java.util.Scanner;
public class DiemCanBang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int ij=1;ij<=t;ij++){
            int n=sc.nextInt();
            int x=-2;
            long[] arr=new long[n+1];
            long s1=0,s2=0; 
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                s1+=arr[i];
            }
            for(int i=0;i<n;i++){
		s2+=arr[i];
		if(s1-s2+arr[i]==s2){
                    x=i;
                    break;
                }
            }
            System.out.println(x+1);
        }
    }
}
