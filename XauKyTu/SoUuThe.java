
package CodeJava1.XauKyTu;
import java.util.Scanner;
public class SoUuThe {
    public static int Odd_even(String s){
        int cntEven = 0, cntOdd = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) > '9' || s.charAt(i) < '0') return 3;
            if(Integer.parseInt(String.valueOf(s.charAt(i))) % 2 == 0) cntEven++;
            else cntOdd++;
        }
        if(cntEven > cntOdd) return 0;
        return 1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            String s = sc.next();
            if(Odd_even(s)==3)  
                System.out.println("INVALID");
            else if((s.length() % 2 == 0 && Odd_even(s) == 0 )||( s.length() % 2 != 0 && Odd_even(s) == 1)){
                System.out.println("YES");
            }   
            else{
                System.out.println("NO");
            }
            
            t--;
        }
    }
}
