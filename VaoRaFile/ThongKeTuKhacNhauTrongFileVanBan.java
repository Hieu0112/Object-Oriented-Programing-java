package VaoRaFile;
import java.io.File;
import java.util.*;
public class ThongKeTuKhacNhauTrongFileVanBan{
    public static void main(String[] args) throws Exception{
        Scanner sc= new Scanner(new File("VANBAN.in"));
        int t = Integer.parseInt(sc.nextLine());
        Map<String, Integer> m = new TreeMap<>();
        ArrayList<String> a = new ArrayList<>();
        while(t-->0){
            String s = sc.nextLine().trim().replaceAll("\\s+", " ").toLowerCase();
            String tmp = "";
            for(int i = 0; i < s.length(); i++){
                if((s.charAt(i) < 'a' || s.charAt(i) > 'z') && 
                        (s.charAt(i) < '0' || s.charAt(i) > '9'))
                    tmp += ' ';
                else tmp += s.charAt(i);
            }
            tmp = tmp.trim().replaceAll("\\s+"," ");
            String b[] = tmp.split(" ");
            for(String x : b){
                if(m.containsKey(x))
                    m.put(x, m.get(x) + 1);
                else{
                    m.put(x, 1);
                    a.add(x);
                }
            }
        }
        Collections.sort(a, (String o1, String o2) -> {
            if(m.get(o1) != m.get(o2)) return m.get(o2) - m.get(o1);
            return o1.compareTo(o2);
        });
        for(String x : a)
            System.out.println(x + " " + m.get(x));
    }
}
