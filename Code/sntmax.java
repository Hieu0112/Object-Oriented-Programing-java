package Code;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.*;

public class sntmax{
    static int ktra(int n){
        if(n < 2) return 0;
        for(int i = 2; i <= Math.sqrt(n); i++)
            if(n % i == 0) return 0;
        return 1;
    }
    public static void main(String[] args) throws Exception{
        FileInputStream file = new FileInputStream("DATA.in");
        ObjectInputStream ois = new ObjectInputStream(file);
        ArrayList<Integer> a = (ArrayList<Integer>) ois.readObject();
        ArrayList<Integer> b = new ArrayList<>();
        TreeMap<Integer, Integer> m = new TreeMap<>();
        for(Integer x : a){
            if(ktra(x) == 1){
                if(m.containsKey(x))
                m.put(x, m.get(x) + 1);
                else{
                    m.put(x, 1);
                    b.add(x);
                } 
            }
        }
        Collections.sort(b, (Integer o1, Integer o2) -> o2 - o1);
        for(int i = 0; i < 10; i++)
            System.out.println(b.get(i) + " " + m.get(b.get(i)));
    }
}