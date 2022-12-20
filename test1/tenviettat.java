package test1;

import java.io.File;
import java.util.*;

public class tenviettat {
    static boolean ktra(String a, String b){
        for(int i = 0; i < a.length(); i++)
            if(a.charAt(i) != '*'){
                if(a.charAt(i) != b.charAt(i)) return false;
            }
        return true;
    }
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<String> a = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0)
            a.add(sc.nextLine());
        Collections.sort(a, new Comparator<String>() {
            @Override
            public int compare(String a, String b){
                String s1[] = a.split(" ");
                String s2[] = b.split(" ");
                if(!s1[s1.length-1].equals(s2[s2.length-1])) 
                    return s1[s1.length-1].compareTo(s2[s2.length-1]);
                else
                    return a.compareTo(b);
            }
        });
        int q = sc.nextInt();
        while(q--> 0){
            String s = sc.next();
            int vt = 0;
            for(int i = 0; i < s.length(); i++) 
                if(s.charAt(i) == '*'){
                    vt = i; break;
                }
            for(int i = 0; i < a.size(); i++){
                String tmp = "";
                String b[] = a.get(i).split(" ");
                for(int j = 0; j < b.length; j++){
                    tmp += b[j].charAt(0);
                    if(j != b.length-1) tmp += '.';
                }
                if(tmp.length() == s.length())
                    if(ktra(s, tmp)) System.out.println(a.get(i));
            }
        }
    }
}