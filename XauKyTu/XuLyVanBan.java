package XauKyTu;
import java.util.*;

public class XuLyVanBan{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String s = sc.nextLine().trim().toLowerCase().replaceAll("\\s+ ", " ");
            int dem = 0;
            for(int i = 0; i < s.length(); i++)
                if(s.charAt(i) == '.' || s.charAt(i) == '?' || s.charAt(i) == '!')
                    dem++;
            while(dem-->0){
                String x = "";
                int vt = 0;
                for(int i = 0; i < s.length(); i++){
                    if(s.charAt(i) != '.' && s.charAt(i) != '?' && s.charAt(i) != '!') 
                        x += s.charAt(i);
                    else{
                        vt = i+1; 
                        break;
                    }
                }
                x = x.trim();
                x = x.substring(0,1).toUpperCase() + x.substring(1);
                s = s.substring(vt);
                System.out.println(x);
            }
        }
    }
}