
package CodeJava1.XauKyTu;
import java.util.*;
public class DaoTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int ij = 1; ij <= t; ij++) {
            String s= sc.nextLine();
            String[] ss= s.split(" ");
            String res="";
            for(String x:ss){
                String ss1="";
                for(int i=0;i<x.length();i++){
                    ss1= x.charAt(i)+ss1;
                }
                res+=ss1+" ";
            }

            System.out.println(res);
        }
    }
}