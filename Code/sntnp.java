import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.*;

public class sntnp{
    static int ktra(int n){
        if(n < 2) return 0;
        for(int i = 2; i <= Math.sqrt(n); i++)
            if(n % i == 0) return 0;
        return 1;
    }
    public static void main(String[] args) throws Exception{
        FileInputStream file = new FileInputStream("SONGUYEN.in");
        ObjectInputStream ois = new ObjectInputStream(file);
        ArrayList<Integer> a = (ArrayList<Integer>) ois.readObject();
        TreeMap<Integer, Integer> m = new TreeMap<>();
        for(Integer x : a){
            if(ktra(x) == 1){
                if(m.containsKey(x))
                m.put(x, m.get(x) + 1);
                else m.put(x, 1);
            }
        }
        for(Integer x : m.keySet())
            System.out.println(x + " " + m.get(x));
    }
}
