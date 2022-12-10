
package Mang;
import java.util.Scanner;
import java.util.Arrays;
public class DayConCoTongNguyenTo {
   static int n;
   static int[] a = new int[100];
   static int[] vt = new int[100];
    static boolean nt(int n){
	if(n<2) return false;
	else for(int i=2;i<=(int)Math.sqrt(n);i++)
	if(n%i==0) return false;
	return true;
}
   static void xuat(){
       int dem=0;
	String s="";
	for(int i=0;i<n;i++){
            if(vt[i]==1){
		dem+=a[i];
		s+=(a[i])+" ";
            }
	}
	if(nt(dem)) 
            System.out.println(s);
   }
   static void Try(int i){
       for(int j=0;j<=1;j++){
		vt[i]=j;
		if(i==n-1) xuat();
		else Try(i+1);
	}
   }
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       while(t --> 0){
           n = sc.nextInt();
           int arr[]=new int[n];
           for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
           Arrays.sort(arr);
           for(int i = 0; i < n; i++) a[i] = arr[n-i-1];
           Try(0);
       }
   }
}

