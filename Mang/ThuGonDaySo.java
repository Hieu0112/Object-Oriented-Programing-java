
package CodeJava1.Mang;
import java.util.Scanner;
import java.util.ArrayList;
public class ThuGonDaySo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        boolean ok=true;
        while(ok){
            ok=false;
            int x=0;
            for(int i=0;i<list.size()-1;i++){
                if(i+1<=list.size()-1-x){
                    if((list.get(i)+list.get(i+1))%2==0){
                    ok=true;
                    x+=2;
                    list.remove(i);
                    list.remove(i);
                    }
                }
            }
            if(ok==false)   break;
        }
        System.out.println(list.size());
    }
}