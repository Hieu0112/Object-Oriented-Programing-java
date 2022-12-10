package UngDungJAVA_COLLECTIONS;
import java.util.*;

public class So0VaSo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int x = 0, y = 0;
            long res[] = new long[10001];
            res[0] = 9;
            while(x >= y){
                long s = res[y++];
                if(s % n == 0){
                   System.out.println(s);
                   break;
                }
                res[++x] = s * 10;
                res[++x] = s * 10 + 9;          
            }
        }
    }
}