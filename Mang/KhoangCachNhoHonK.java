package Mang;

import java.util.*;

public class KhoangCachNhoHonK{
    public static int Binary_search(int []a, int l, int r, int x){
        int ans = r + 1;
        while(l <= r){
            int m = (l + r) / 2;
            if(a[m] >= x){
                r = m - 1; 
                ans = m;
            }
            else l = m + 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt(), k = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            Arrays.sort(a);
            long res = 0;
            for (int i = 0; i < n-1; i++)
		res += Binary_search(a, i+1, n-1, a[i] + k) - i - 1;
            System.out.println(res);
        }
    }
}