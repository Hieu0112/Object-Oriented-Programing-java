
package CodeJava1.Mang;
import java.util.*;
public class DanhSachKe {
    static ArrayList<ArrayList<Integer>> RES(int[][] a,int n){
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(); 
        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<Integer>());
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(a[i][j] == 1) adj.get(i).add(j+1);
            }
        }
        return adj;
    }
    static void xuat(ArrayList<ArrayList<Integer>> adj){
        for(int v = 0; v < adj.size(); v++){
            System.out.print("List(" + (v+1) + ") = ");
            for(Integer u : adj.get(v)){
                System.out.print(u+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();  
            }
        ArrayList<ArrayList<Integer>> adj = RES(a,n);
        xuat(adj);
    }
}
