
package CodeJava1.XauKyTu;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class TapTuRiengCua2Xau {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        for(int ij=0;ij<t;ij++){
            Set<String>a=new TreeSet<>();
            String[] s1=sc.nextLine().split(" ");
            String[] s2=sc.nextLine().split(" ");
            for(String x:s1){
                a.add(x);
            }
            for(String x:s2){
                if(a.contains(x)==true)
                    a.remove(x);
            }
            for(String r:a){
                System.out.print(r+" ");
            }
            System.out.println("");
        }
    }
}
