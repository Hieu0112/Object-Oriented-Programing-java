package XauKyTu;
import java.util.*;

public class ChuanHoaCau {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        HashMap<Integer, Integer> m = new HashMap<>();
        while(sc.hasNext()){
            String s = sc.nextLine().trim().toLowerCase().replaceAll("\\s+", " ");
            int dem = 0;
            for(int i = 0; i < s.length(); i++)
                if(s.charAt(i) == '.' || s.charAt(i) == '?' || s.charAt(i) == '!')
                    dem++;
            if(s.charAt(s.length()-1) != '.' && s.charAt(s.length()-1) != '?' && s.charAt(s.length()-1) != '!') dem++;
            while(dem-->0){
                String x = "";
                int vt = 0;
                for(int i = 0; i < s.length(); i++){
                        x += s.charAt(i);
                    if(s.charAt(i) == '.' || s.charAt(i) == '?' || s.charAt(i) == '!'){
                        vt = i+1; break;
                    }    
                }
                x = x.trim();
                x = x.substring(0,1).toUpperCase() + x.substring(1);
                s = s.substring(vt);
                if(x.charAt(x.length()-1) != '.' && x.charAt(x.length()-1) != '?' && x.charAt(x.length()-1) != '!') x += '.';
                if(x.charAt(x.length()-2) == ' ') x = x.substring(0, x.length()-2) + x.substring(x.length()-1);
                System.out.println(x);
            }
        }
    }
}