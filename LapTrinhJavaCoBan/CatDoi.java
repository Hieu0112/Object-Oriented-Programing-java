package CodeJava1.LapTrinhJavaCoBan;
import java.util.Scanner;
public class CatDoi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t;i++){
            String str=sc.nextLine();
            str= str.replace('8','0');
            str= str.replace('9','0');
            boolean ok=true;
            for(int j=0;j<str.length();j++){
                char c=str.charAt(j);
                if(c!='0'&&c!='1'){
                    ok=false;
                    break;
                }
            }
            if(ok&&Long.parseLong(str)!=0)
                System.out.println(Long.parseLong(str));
            else 
                System.out.println("INVALID");
        }
    }
}
