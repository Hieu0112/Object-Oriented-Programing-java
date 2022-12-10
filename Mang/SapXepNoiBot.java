package CodeJava1.Mang;
import java.util.Scanner;
public class SapXepNoiBot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n+1];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int x=0;
	while(true){
            boolean check=true;
            for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1] ) {
                int tmp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=tmp;
            }
        }
            for(int i=0;i<n-1;i++) {
            if(arr[i]>arr[i+1]) check=false;
            }
            x++;
            System.out.print("Buoc "+ x + ": ");
            for(int h=0;h<n;h++){
            System.out.print(arr[h]+" ");
            }
            System.out.println("");
            if(check) break;
	}
    }
}