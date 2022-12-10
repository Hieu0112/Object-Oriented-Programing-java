package VaoRaFile;

import java.io.File;
import java.io.IOException;
import java.util.*;

class WordSet{
    private TreeSet<String> s1 = new TreeSet<>();
    public WordSet(String s){
        try{
            Scanner sc = new Scanner(new File(s));
            while(sc.hasNext())
                s1.add(sc.next().toLowerCase());
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public TreeSet<String> getS1() {
        return s1;
    }
    
    public String difference(WordSet s2){
        TreeSet<String> s = new TreeSet<>();
        s.addAll(s1);
        String x = "";
        s.removeAll(s2.getS1());
        for(String a : s)
            x = x + a + ' ';
        return x;
    }
}
public class Hieu2TapTu {
    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.difference(s2));
        System.out.println(s2.difference(s1));
    }
}
