package UngDungJAVA_COLLECTIONS;
import java.util.*;

public class CapSoCoTongBangK {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long res = 0;
            int so;
            int n = sc.nextInt();
            int k = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            HashMap<Integer, Integer> m = new HashMap<>();
            for(int i=0;i<n;i++){
                so=sc.nextInt();
                if(!m.containsKey(so)){
                    m.put(so, 1);
                    a.add(so);
                }
                else{
                    m.put(so, m.get(so)+1);
                }
            }
            for(int i=0;i<a.size();i++){
                int x=a.get(i);
                int y=k-x;
                if(x==y){
                    for(int j = 1; j < m.get(x); j++) 
                        res += j;
                    m.put(x, 0);
                }
                else if(m.containsKey(y)){
                    res+=m.get(x)*m.get(y);
                    m.put(x, 0);
                    m.put(y, 0);
                }
            }
            System.out.println(res);
        }
    }
}