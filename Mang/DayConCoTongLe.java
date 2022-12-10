
package CodeJava1.Mang;
import java.util.*;
public class DayConCoTongLe {
    static void xuat(int[] a,int[] arr,int n){
	int dem=0;
	String s="";
	for(int i=0;i<n;i++){
            if(arr[i]==1){
		dem+=a[n-i-1];
		s+=String.valueOf(a[n-i-1])+" ";
            }
	}	
	if(dem%2!=0) System.out.println(s);
    }
    static void solve(int[] a,int[]arr,int i,int n){
	for(int j=0;j<=1;j++){
		arr[i]=j;
		if(i==n-1) xuat(a,arr,n);
		else solve(a,arr,i+1,n);
	}
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            solve(a,arr,0,n);
        }
    }
}
