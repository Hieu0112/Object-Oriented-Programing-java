package UngDungJAVA_COLLECTIONS;

import java.util.ArrayDeque;
import java.util.Scanner;
public class DayNgoacDungDaiNhat{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int maxs = 0;
            String s = sc.next();
            ArrayDeque<Integer> a = new ArrayDeque<>();
            a.push(-1);
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '(') a.push(i);
                else{
                    a.pop();
                    if(!a.isEmpty())
                        maxs = Math.max(maxs, i-a.peek());
                    else a.push(i);
                }
            }
            System.out.println(maxs);
        }
    }
}