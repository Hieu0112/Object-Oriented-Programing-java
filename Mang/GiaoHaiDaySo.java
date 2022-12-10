
package CodeJava1.Mang;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Set;
public class GiaoHaiDaySo {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int n= sc.nextInt();
            int m=sc.nextInt();
            Set<Integer> A=new TreeSet<Integer>();
            Set<Integer> B=new TreeSet<Integer>();
            for(int j=0;j<n;j++){
                A.add(sc.nextInt());
            }
            for(int i=0;i<m;i++){
                int x= sc.nextInt();
                if(A.contains(x))
                    B.add(x);
            }
//            for(long x:B){
//            System.out.print(x+" ");

        Iterator<Integer>it=B.iterator();
            while(it.hasNext())
                System.out.print(it.next() + " ");
    }
}
