
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class songuyenthuy {
    public static boolean check(String s){
        if(s.length()%2==0){
            for(int i=0;i<s.length()/2;i++){
                if(s.charAt(i)!=s.charAt(s.length()-1-i))
                    return false;
            }
            return true;
        }
        return false;    
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
        int n=sc.nextInt();
        Queue<String>q=new LinkedList<>();
        q.add("4");
        q.add("5");
        int dem=0;
        while(true){
            String s=q.poll();
            q.add(s+"4");
            q.add(s+"5");
            if(check(s)){
                dem++;
                System.out.print(s+" ");
            }
            if(dem==n) break;
            }
            System.out.println("");
        }
    }
}
