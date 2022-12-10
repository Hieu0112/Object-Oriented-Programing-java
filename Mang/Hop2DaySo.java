
package CodeJava1.Mang;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Set;

public class Hop2DaySo {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int n= sc.nextInt();
            int m=sc.nextInt();
            Set<Integer> A=new TreeSet<Integer>();
            for(int j=0;j<n;j++){
                A.add(sc.nextInt());
            }
            for(int i=0;i<m;i++){
                A.add(sc.nextInt());
            }
//            for(long x:B){
//            System.out.print(x+" ");

        Iterator<Integer>it=A.iterator();
            while(it.hasNext())
                System.out.print(it.next() + " ");
    }
}
