
package KhaiBaoLopVaDoiTuong;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
class IntSet {
    private int[] arr;
    public IntSet(int[] arr) {
        this.arr=arr;
        }

    public int[] getArr() {
        return arr;
    }
    
    public IntSet union(IntSet a){
        Set<Integer>arrs=new TreeSet<>();
        for(int x:arr){
            arrs.add(x);
        }
        for(int x:a.getArr()){
            arrs.add(x);
        }
        int[] res=new int[arrs.size()];
        int i=0;
        for(int x:arrs){
            res[i++]=x;
        }
        return new IntSet(res);
    }

    @Override
    public String toString() {
        String s="";
        for(int x:arr)
            s+=String.valueOf(x)+" ";
        return s;
    }
    
    }
public class LopInset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}
