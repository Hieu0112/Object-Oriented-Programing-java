package CodeJava1.XauKyTu;
import java.util.Scanner;
public class DiaChiEmail {
    static String ChuanHoa(String a,String[] str){
        String[] res=a.split(" ");
        a="";
        a+=res[res.length-1];
        for(int i=0;i<res.length-1;i++){
            a+=res[i].charAt(0);
        }
        int dem=1;
        for(int i=0;i<str.length;i++){
            if(str[i].contains(a)){
                dem++;
            }
        }
        if(dem==1)
            return a + "@ptit.edu.vn";
        else 
            return a + String.valueOf(dem) + "@ptit.edu.vn";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        String[] s=new String[n];
        for(int ij=0;ij<n;ij++){
            String x=sc.nextLine().trim().toLowerCase();
            x=x.replaceAll("\\s+"," ");
            s[ij]=x;
        }
        for(int i=0;i<n;i++){
            s[i]=ChuanHoa(s[i],s);
        }
        for(String res:s){
            System.out.println(res);
        }
    }
}
