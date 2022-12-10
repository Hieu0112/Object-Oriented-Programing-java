package CodeJava1.XauKyTu;
import java.util.Scanner;
public class Hieu2SoNguyenLon2 {
    static String Hieu(String a,String b){
            int n=a.length();
            int m=b.length();
            String res="";
            int vay=0;
            int so=0;
            for(int i=0;i<n-m;i++) b="0" + b;
            for(int i=n-1;i>=0;i--){
                so=a.charAt(i)-b.charAt(i)-vay;
                vay=0;
                if(so<0){
                    so+=10;
                    vay=1;
                }
                res=String.valueOf(so)+res;
            }
            while(res.charAt(0)=='0'&&res.length()>1)
                res=res.substring(1);
        return res;    
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            String a=sc.next();
            while(a.charAt(0)=='0'&&a.length()>1)
                a=a.substring(1);
            String b=sc.next();
            while(b.charAt(0)=='0'&&b.length()>1)
                b=b.substring(1);
            String big= a,small= b;
            boolean ok=true;
            if(a.length()<b.length()||((a.length()==b.length())&&a.charAt(0)<b.charAt(0))){
                big=b;
                small=a;
                ok=false;
            }
            if(ok==false) System.out.print("-");
            System.out.println(Hieu(big,small));
    }
}
