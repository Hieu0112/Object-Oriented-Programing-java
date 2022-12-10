
package CodeJava1.XauKyTu;

import java.util.*;
public class XauDayDu {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int[] a = new int[27];
            int cnt = 0;
            String s = sc.next();
            int k = sc.nextInt();
            for(int i = 0; i < s.length(); i++){
                a[s.charAt(i) - 'a']++;
            }
            for(int i = 0; i < 26; i++) {
                if(a[i] == 0) cnt++;
            }
            if(cnt <= k) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}

