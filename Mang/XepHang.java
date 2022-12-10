
package CodeJava1.Mang;

import java.util.*;
class Hang{
    private int x,y;

    public Hang(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
}
public class XepHang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Hang>list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            list.add(new Hang(sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(list,Comparator.comparingInt(Hang::getX));
        int sumTime=list.get(0).getX()+list.get(0).getY();
        for(int i=1;i<n;i++){
            int so=list.get(i).getX();
            if(so>= sumTime) sumTime=so;
            sumTime +=list.get(i).getY();
        }
        System.out.println(sumTime); 
    }
}
