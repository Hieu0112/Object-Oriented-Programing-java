
package CodeJava1.XauKyTu;

import java.util.*;
public class DayUuThe {
    static int check(int[] a, int n){
        int cntOdd = 0, cntEven = 0;
        for(int i = 0; i < n; i++){
            if(a[i] % 2 == 0) cntEven++;
            else cntOdd++;
        }
        if(cntEven > cntOdd) return 1;
        else return 0;
    }
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t --> 0){
            String s = sc.nextLine();
            String[] tokens = s.split(" ");
            int[] a = new int[tokens.length];
            for(int i = 0; i < tokens.length; i++){
                a[i] = Integer.parseInt(tokens[i]);
            }
            if(check(a,tokens.length) == 1 && tokens.length % 2 ==0 || check(a,tokens.length) == 0 && tokens.length % 2 ==1){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}

