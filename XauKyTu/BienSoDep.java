package CodeJava1.XauKyTu;
import java.util.Scanner;
public class BienSoDep {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 0 ; i < t; i++){
            String s = sc.nextLine();
            
            if(s.charAt(5) < s.charAt(6) && s.charAt(6) < s.charAt(7) && s.charAt(7) < s.charAt(9) && s.charAt(9) < s.charAt(10)){
                System.out.println("YES");
                continue;
            }
            else if(s.charAt(5) == s.charAt(6) && s.charAt(6) == s.charAt(7) && s.charAt(7) == s.charAt(9) && s.charAt(9) == s.charAt(10)){
                System.out.println("YES");
                continue;
            }
            else if(s.charAt(5) == s.charAt(6) && s.charAt(6) == s.charAt(7)  && s.charAt(9) == s.charAt(10)){
                System.out.println("YES");
                continue;
            }
            else if((s.charAt(5) == '6' || s.charAt(5) == '8') && (s.charAt(6) == '6' || s.charAt(6) == '8') && (s.charAt(7) == '6' || s.charAt(7) == '8') && (s.charAt(9) == '6' || s.charAt(9) == '8') && (s.charAt(10) == '6' || s.charAt(10) == '8')){
                System.out.println("YES");
                continue;
            }
            else System.out.println("NO");    
        }
        
    }
}
