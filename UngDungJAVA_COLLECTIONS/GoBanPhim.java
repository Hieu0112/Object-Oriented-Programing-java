package UngDungJAVA_COLLECTIONS;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class GoBanPhim {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        List<Character> a = new ArrayList<>();
        List<Character> b = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            char x=s.charAt(i);
            if(s.charAt(i) == '<'){
                if(a.size() > 0){
                    b.add(a.get(a.size()-1));
                    a.remove(a.size()-1);
                }
            }
            else if(s.charAt(i) == '>'){
                if(b.size() > 0){
                    a.add(b.get(b.size()-1));
                    b.remove(b.size()-1);
                }          
            }
            else if(s.charAt(i) == '-'){
                if(a.size() > 0)
                    a.remove(a.size()-1);
            }
            else 
                a.add(s.charAt(i));
        }
        while(a.size() > 0){
            b.add(a.get(a.size()-1));
            a.remove(a.size()-1);
        }
        while(b.size() > 0){
            System.out.print(b.get(b.size()-1));
            b.remove(b.size()-1);
        }
    }
}
