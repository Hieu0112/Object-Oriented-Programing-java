
package XauKyTu;

import java.util.Scanner;

public class TimSoDu {
    static int Sodu(String a){
        int du4=0;
        for(int i = 0; i < a.length(); i++){
            du4 = du4 * 10 + a.charAt(i) - '0';
            du4 %= 4;
        }
        if(du4 == 0) return 4;
        return 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            String a = sc.next();
            System.out.println(Sodu(a));
        }
    }
}
