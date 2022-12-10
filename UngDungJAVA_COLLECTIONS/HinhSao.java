
package UngDungJAVA_COLLECTIONS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
    
public class HinhSao {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x,y;
        List<List<Integer>>list=new ArrayList<>();
        for(int i=0;i<=n;i++) list.add(new ArrayList<>());
        for(int i=0;i<n-1;i++){
            x=sc.nextInt();
            y=sc.nextInt();
            list.get(x).add(y);
            list.get(y).add(x);
        }
        boolean ok=true;
        for(int i=1;i<=n;i++){
            if(list.get(i).size()==n-1){
                ok=false;
                break;
            }
        }
        if(ok)
            System.out.println("No");
        else 
            System.out.println("Yes");
    }
}
