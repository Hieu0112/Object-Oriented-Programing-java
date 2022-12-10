
package CodeJava1.Mang;
import java.util.Scanner;
public class SapXepChen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n+1];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[i]<arr[j]) {
                    int x=arr[i];
                    int y=arr[j];
                    for(int m=j+1;m<=i;m++){
                        int k=arr[m];
                        arr[m]=y;
                        y=k;
                    }
                    arr[j]=x;
                }
            }
	System.out.print("Buoc "+ (i) + ": ");
	for(int h=0;h<=i;h++){
            System.out.print(arr[h]+" ");
        }
            System.out.println("");
        }
    }
}
