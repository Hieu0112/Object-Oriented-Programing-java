package UngDungJAVA_COLLECTIONS;
import java.util.*;


class Pair<K,V> {
    Integer k,v;
    public Pair(int k, int v){
        this.k = k;
        this.v = v;
    }
}
public class BienDoiS_T{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            int s = sc.nextInt();
            int t = sc.nextInt();
            if(s>=t) 
                System.out.println(s-t);
            else{
                Deque<Pair<Integer, Integer>> a = new ArrayDeque<>();
                Map<Integer, Integer> m = new TreeMap<>();
                a.add(new Pair(s,0));
                m.put(s, 1);
                while(!a.isEmpty()){
                    Pair x = a.getFirst();
                    a.removeFirst();
                    if(x.k - 1 == t || x.k * 2 == t){
                        System.out.println(x.v + 1);
                        break;
                    }
                    if(!m.containsKey(x.k - 1) && x.k - 1 > 0){
                        m.put(x.k - 1, 1);
                        a.add(new Pair(x.k - 1, x.v + 1));
                    }
                    if(!m.containsKey(x.k * 2) && x.k < t){
                        m.put(x.k * 2, 1);
                        a.add(new Pair(x.k * 2, x.v + 1));
                    }
                }
            }
        }
    }
}