package Code;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import java.util.TreeMap;

class FileRead{
    public static <T>List<T> read(String fname)throws Exception,ClassNotFoundException{
        List<T> list=new ArrayList<>();
        ObjectInputStream o=new ObjectInputStream(new FileInputStream(fname));
        list=(List<T>) o.readObject();
        return list;
    }
}
public class lkttxh {
    static int ktra(int n){
        if(n < 2) return 0;
        for(int i = 2; i <= Math.sqrt(n); i++)
            if(n % i == 0) return 0;
        return 1;
    }
    public static void main(String[] args) throws Exception {
        List<String>list1=new ArrayList<>();
        List<String>list2=new ArrayList<>();
        list1=FileRead.read("NHIPHAN.in");
        Scanner sc= new Scanner(new File("VANBAN.in"));
        Map<String, Integer> m1 = new TreeMap<>();
        Map<String, Integer> m2 = new TreeMap<>();
        for(String s : list1){
            s = s.toLowerCase().trim().toLowerCase();
            String str[] = s.split(" ");
            for(String c : str)
               m1.put(c, 1);
        }
        while(sc.hasNextLine()){
            String s = sc.nextLine().trim().toLowerCase();
            String c[] = s.split(" ");
            for(String x : c){
                if(!m2.containsKey(x)){
                    list2.add(x); m2.put(x, 1);
                } 
            }
        }
        for(String s : list2)
            if(m1.containsKey(s) && m2.containsKey(s))
                System.out.println(s);
    }
}
