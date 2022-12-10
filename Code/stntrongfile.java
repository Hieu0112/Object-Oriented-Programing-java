package Code;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import java.util.TreeMap;

class FileRead{
    public static <T>List<T> read(String fname)throws Exception,ClassNotFoundException{
        List<T> list=new ArrayList<>();
        ObjectInputStream o=new ObjectInputStream(new FileInputStream(fname));
        list=(List<T>) o.readObject();
        return list;
    }
}
public class stntrongfile {
    static int ktra(int n){
        int m = n, sum = 0, dem = 0;
        while(n > 0){
            int a = n % 10;
            if(a % 2 == 0) return 0;
            dem++;
            sum = sum * 10 + a;
            n /= 10;
        }
        if(dem < 3 || sum != m || dem % 2 == 0) return 0;
        return 1;
    }
    public static void main(String[] args) throws Exception {
        List<Integer>list1=new ArrayList<>();
        List<Integer>list2=new ArrayList<>();
        list1=FileRead.read("DATA1.in");
        list2=FileRead.read("DATA2.in");
        ArrayList<Integer> c = new ArrayList<>();
        TreeMap<Integer, Integer> m = new TreeMap<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(Integer x : list1){
            if(ktra(x) == 1){
                if(m.containsKey(x))
                    m.put(x, m.get(x) + 1);
                else m.put(x, 1);
            }
        }
        for(Integer x : list2){
                if(m.containsKey(x)){
                    m.put(x, m.get(x) + 1);
                    map.put(x, m.get(x));
                }
        }
        int dem = 0;
        for(Integer x : map.keySet()){
            if(dem == 10) break;
            System.out.println(x + " " + map.get(x));
            dem++;
        }
    }
}
