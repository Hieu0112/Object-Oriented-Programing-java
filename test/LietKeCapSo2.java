package test;

import java.util.*;
import java.io.*;

public class LietKeCapSo2 {
    static int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a%b);
    }
    public static void main(String[] args) throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Pair> a = (ArrayList<Pair>) ois.readObject();
        ArrayList<Pair> b = new ArrayList<>();
        Map<String, Integer> m = new TreeMap<>();
        for(Pair x : a){
            String tmp = "", tam = "";
            tmp = tmp + String.valueOf(x.getFirst()) + String.valueOf(x.getSecond());
            tam = tam + String.valueOf(x.getSecond()) + String.valueOf(x.getFirst());
            if(!m.containsKey(tmp) && !m.containsKey(tam)){
                if(x.getFirst() < x.getSecond() && gcd(x.getFirst(), x.getSecond()) == 1)
                    b.add(x);
                m.put(tmp, 1);
                m.put(tam, 1);
            }
        }
        Collections.sort(b);
        for(Pair x : b)
            System.out.println(x);
    }
}

