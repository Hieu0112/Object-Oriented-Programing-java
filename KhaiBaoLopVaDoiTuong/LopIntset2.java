/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodeJava1.KhaiBaoLopVaDoiTuong;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
class IntSet{
    private int[] arr;
    public IntSet(int[] arr){
        this.arr = arr;
    }
    public int[] getArr(){
        return arr;
    }
    public IntSet intersection(IntSet tmp){
        Set<Integer>a=new TreeSet<>();
        Set<Integer>b=new TreeSet<>();
        for(int x: tmp.getArr()){
            a.add(x);
        }
        for(int x: arr){
            if(a.contains(x))
                b.add(x);
        }
        int[] res =new int[b.size()];
        int i=0;
        for(int x: b){
            res[i++]=x;
        }
        return new IntSet(res);
    }
    @Override
    public String toString(){
        String s="";
        for(int x:arr)
            s+=String.valueOf(x)+" ";
        return s;
    }
}
public class LopIntset2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.intersection(s2);
        System.out.println(s3);
    }
}
