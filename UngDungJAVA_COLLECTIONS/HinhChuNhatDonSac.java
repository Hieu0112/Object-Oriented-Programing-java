
package UngDungJAVA_COLLECTIONS;

import java.util.Scanner;
import java.util.Stack;
public class HinhChuNhatDonSac {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int m=sc.nextInt();
            int n=sc.nextInt();
            int a[]=new int[n];
            int arr[]=new int[n];
            int left[]=new int[n];
            int right[]=new int[n];
            int l[]=new int[n];
            int r[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                arr[i]=m-a[i];
            }
            Stack<Integer>st1=new Stack<>();
            Stack<Integer>st2=new Stack<>();
            Stack<Integer>st3=new Stack<>();
            Stack<Integer>st4=new Stack<>();
		for(int i=0;i<n;i++){
                    while(!st1.isEmpty()&&a[st1.peek()]>=a[i]) st1.pop();
                    if(st1.empty())	left[i]=i+1;
                    else left[i]=i-st1.peek();
                    st1.push(i);
                    
                    while(!st3.isEmpty()&&arr[st3.peek()]>=arr[i]) st3.pop();
                    if(st3.empty())	l[i]=i+1;
                    else l[i]=i-st3.peek();
                    st3.push(i);
		}
		for(int i=n-1;i>=0;i--){
                    while(!st2.isEmpty()&&a[st2.peek()]>=a[i]) st2.pop();
                    if(st2.empty())	right[i]=n-i;
                    else right[i]=st2.peek()-i;
                    st2.push(i);
                    
                    while(!st4.isEmpty()&&arr[st4.peek()]>=arr[i]) st4.pop();
                    if(st4.empty())	r[i]=n-i;
                    else r[i]=st4.peek()-i;
                    st4.push(i);
		}
                
		long maxs=0;
		for(int i=0;i<n;i++) {
                    maxs=Math.max(maxs,((long)((long)left[i]+(long)right[i])-1)*(long)a[i]);
                    maxs=Math.max(maxs,((long)((long)l[i]+(long)r[i])-1)*(long)arr[i]);
                }
		System.out.println(maxs);
    }
}
