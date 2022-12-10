
package CodeJava1.Mang;
import java.util.*;
public class QuayPhai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            Integer[] a = new Integer[n];
            
            for(int i = 0; i < n; i++) a[i] = sc.nextInt();
            int min = (int)Collections.min(Arrays.asList(a));
            int index1 = 0;
            for(int i = 0; i < n; i++){
                if(a[i] == min) {
                    index1 = i; 
                    break;
                }
            }
            System.out.println(index1);
        }
    }
}
