
package CodeJava1.Mang;
import java.util.Scanner;
public class SapXepDoiChoTrucTiep {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n+1];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        for(int i=0;i<n-1;i++){
	for(int j=i+1;j<n;j++){
	if(arr[i]>arr[j]){
            int tmp=arr[i];
            arr[i]=arr[j];
            arr[j]=tmp;
        }
    }
	System.out.print("Buoc "+ (i+1) + ": ");
	for(int h=0;h<n;h++){
            System.out.print(arr[h]+" ");
        }
            System.out.println("");
    }
    }
}
