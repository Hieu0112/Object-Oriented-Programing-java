
package UngDungJAVA_COLLECTIONS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoBanPhimViTri {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        List<Character>list=new ArrayList<>();
        int contro=0;
        for (int i = 0; i < s.length(); i++) {
            char x= s.charAt(i);
            if(x=='>'){
                contro++;
                if(contro>=list.size())
                    contro=list.size();
            }
            
            else if(x=='<'){
                contro--;
                if(contro<0)
                    contro=0;
            }
            
            else if(x=='-'){
                int vtxoa=contro;
                if(vtxoa>=list.size()-1)
                    vtxoa=list.size()-1;
                list.remove(vtxoa);
                contro--;
                if(contro<0)
                    contro=0;
            }
            else{
                list.add(contro, x);
                contro++;
            }
        }
        for (Character character : list) {
            System.out.print(character);
        }
    }
}
