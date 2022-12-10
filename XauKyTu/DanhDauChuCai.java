
package CodeJava1.XauKyTu;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class DanhDauChuCai {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Set<Character>setA=new HashSet<>();
        String s=sc.next();
        for(int i=0;i<s.length();i++){
            setA.add(s.charAt(i));
        }
        System.out.println(setA.size());
    }
}
