
package VaoRaFile;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import java.util.TreeMap;

class FileRead{
    public static <T>List<T> read(String fname)throws Exception,ClassNotFoundException{
        List<T> list=new ArrayList<>();
        ObjectInputStream o=new ObjectInputStream(new FileInputStream(fname));
        list=(List<T>) o.readObject();
        return list;
    }
}
public class CapSNTTrongFile1 {
    static int ktra(int n){
        if(n < 2) return 0;
        for(int i = 2; i <= Math.sqrt(n); i++)
            if(n % i == 0) return 0;
        return 1;
    }
    public static void main(String[] args) throws Exception {
        List<Integer>list1=new ArrayList<>();
        List<Integer>list2=new ArrayList<>();
        list1=FileRead.read("DATA1.in");
        list2=FileRead.read("DATA2.in");
        list1.sort((Integer a,Integer b)->a.compareTo(b));
        TreeMap<Integer, Integer> m = new TreeMap<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(Integer x : list1)
            if(ktra(x) == 1) m.put(x, 1);
        for(Integer x : list2)
            if(ktra(x) == 1) map.put(x, 1);
        for(Integer x : m.keySet()){
            int k = 1000000 - x;
            if(x > k) break;
            if(map.containsKey(k))
                System.out.println(x + " " + k);
        }
    }
}
