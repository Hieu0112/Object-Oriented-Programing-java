package test1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Pair>list=new ArrayList<>();
        List<Pair>res=new ArrayList<>();
        list=FILE.read("DATA.in");
        Map<String, Integer> m = new TreeMap<>();
        for(Pair x : list){
            String soxuoi = "", songuoc = "";
            soxuoi = soxuoi + String.valueOf(x.getFirst()) + String.valueOf(x.getSecond());
            songuoc = songuoc + String.valueOf(x.getSecond()) + String.valueOf(x.getFirst());
            if(!m.containsKey(songuoc) && !m.containsKey(soxuoi)){
                if(x.getFirst() < x.getSecond())
                    res.add(x);
                m.put(soxuoi, 1);
                m.put(songuoc, 1);
            }
        }
        Collections.sort(res);
        for (Pair pair : res) {
            System.out.println(pair);
        }
    }
}
