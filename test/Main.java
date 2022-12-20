
package test;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
public class Main {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("DATA.in"));
        List<Pair>p=(ArrayList<Pair>)ois.readObject();
        TreeMap<String,Integer>map=new TreeMap<>();
        List<Pair>res=new ArrayList<>();
        for (Pair pair : p) {
            int x=pair.getFirst();
            int y=pair.getSecond();
            String so=""+x+y;
            if(x<y&&!map.containsKey(so)){
                map.put(so, 1);
                res.add(pair);
            }
        }
        Collections.sort(res);
        for (Pair re : res) {
            System.out.println(re);
        }
   }
}
