package VaoRaFile;

import java.io.IOException;
import java.util.*;
import java.io.File;

public class SapXepMaTran {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
            int a[][] = new int[n+1][m+1];
            ArrayList<Integer> b = new ArrayList<>(); 
            int x = 1;
            for(int i = 1; i <= n; i++)
                for(int j = 1; j <= m; j++){
                    a[i][j] = sc.nextInt();
                    if(j == k) b.add(a[i][j]);
                }
            Collections.sort(b);
            for(int i = 1; i <= n; i++)
                a[i][k] = b.get(i-1);
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= m; j++)
                    System.out.print(a[i][j] + " ");
                System.out.println();
            }
        }
    }
}