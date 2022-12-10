
package CodeJava1.XauKyTu;
import java.util.Scanner;
public class DienThoaiCucGach {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int ij=0;ij<t;ij++){
            String s = sc.next();
            String res = "";
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == 'A' || s.charAt(i) == 'B' ||s.charAt(i) == 'C' ||s.charAt(i) == 'a' ||s.charAt(i) == 'b' ||s.charAt(i) == 'c' )
                    res += "2";
                else if(s.charAt(i) == 'd' || s.charAt(i) == 'e' ||s.charAt(i) == 'f' ||s.charAt(i) == 'D' ||s.charAt(i) == 'E' ||s.charAt(i) == 'F')
                    res += "3";
                else if(s.charAt(i) == 'w' || s.charAt(i) == 'x' ||s.charAt(i) == 'y' ||s.charAt(i) == 'z' ||s.charAt(i) == 'W' ||s.charAt(i) == 'X'||s.charAt(i) == 'Y'||s.charAt(i) == 'Z')
                    res += "9";
                else if(s.charAt(i) == 'g' || s.charAt(i) == 'h' ||s.charAt(i) == 'i' ||s.charAt(i) == 'G' ||s.charAt(i) == 'H' ||s.charAt(i) == 'I')
                    res += "4";
                else if(s.charAt(i) == 'j' || s.charAt(i) == 'k' ||s.charAt(i) == 'l' ||s.charAt(i) == 'J' ||s.charAt(i) == 'K' ||s.charAt(i) == 'L')
                    res += "5";
                else if(s.charAt(i) == 'm' || s.charAt(i) == 'n' ||s.charAt(i) == 'o' ||s.charAt(i) == 'M' ||s.charAt(i) == 'N' ||s.charAt(i) == 'O')
                    res += "6";
                else if(s.charAt(i) == 'p' || s.charAt(i) == 'q' ||s.charAt(i) == 'r' ||s.charAt(i) == 's' ||s.charAt(i) == 'P' ||s.charAt(i) == 'Q'||s.charAt(i) == 'R'||s.charAt(i) == 'S')
                    res += "7";
                else if(s.charAt(i) == 't' || s.charAt(i) == 'u' ||s.charAt(i) == 'v' ||s.charAt(i) == 'T' ||s.charAt(i) == 'U' ||s.charAt(i) == 'V')
                    res += "8";
            }
            int check = 1;
            for(int i = 0; i < res.length()/2 ; i++ ){
                if(res.charAt(i) != res.charAt(res.length()-i-1)){
                    check = 0;
                    break;
                }
            }
            if(check == 1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
