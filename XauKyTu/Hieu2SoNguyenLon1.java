package CodeJava1.XauKyTu;
import java.util.Scanner;
public class Hieu2SoNguyenLon1 {
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
        return res;    
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int ij=0;ij<t;ij++){
            String a=sc.next();
            String b=sc.next();
            String big= a,small= b;
            if(a.length()<b.length()||((a.length()==b.length())&&a.charAt(0)<b.charAt(0))){
                big=b;
                small=a;
            }
            System.out.println(Hieu(big,small));
        }
    }
}
