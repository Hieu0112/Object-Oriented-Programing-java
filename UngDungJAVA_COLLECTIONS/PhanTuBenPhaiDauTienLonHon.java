package UngDungJAVA_COLLECTIONS;

import java.util.*;

public class PhanTuBenPhaiDauTienLonHon{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0; i < n; i++) 
                a[i] = sc.nextInt();
            for(int i = 0; i < n; i++){
                int ok = 0;
                for(int j = i+1; j < n; j++)
                    if(a[j] > a[i]){
                        ok = 1; 
                        System.out.print(a[j] + " ");
                        break;
                    }
                if(ok == 0) System.out.print(-1 + " ");
            }
            System.out.println();
        }
    }
}
