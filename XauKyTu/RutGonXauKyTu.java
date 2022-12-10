package CodeJava1.XauKyTu;
import java.util.Scanner;
public class RutGonXauKyTu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        boolean ok=true;
        while(s.length()>=2&&ok==true){
            ok=false;
            for(int i=0;i<s.length()-1;i++){
                if(s.charAt(i)==s.charAt(i+1)){
                    s=s.substring(0, i)+s.substring(i+2);
                    ok=true;
                }
            }
        }
        if(s.length()==0)
            System.out.println("Empty String");
        else
            System.out.println(s);
    }
}
