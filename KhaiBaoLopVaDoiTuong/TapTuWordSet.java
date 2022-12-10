
package CodeJava1.KhaiBaoLopVaDoiTuong;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
class WordSet{
    private String[] arr;

    public WordSet(String arr) {
        this.arr = arr.toLowerCase().split(" ");
    }



    public String[] getArr() {
        return arr;
    }
    
    public WordSet union(WordSet tmp){
        Set<String>a=new TreeSet<>();
        for(String x: tmp.getArr()){
            a.add(x);
        }
        for(String x: arr){
            a.add(x);
        }
        String res = "";
        for(String x: a){
            res = res+" " + x;
        }
        return new WordSet(res);
    }
    
    public WordSet intersection(WordSet tmp){
        Set<String>a=new TreeSet<>();
        Set<String>b=new TreeSet<>();
        for(String x: tmp.getArr()){
            a.add(x);
        }
        for(String x: arr){
            if(a.contains(x))
                b.add(x);
        }
        String res = "";
        for(String x: b){
            res = res+" " + x;
        }
        return new WordSet(res);
    }
    @Override
    public String toString() {
        String res="";
        for(String x:arr)
            res+=x+" ";
        return res;
    }
}
public class TapTuWordSet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
