package UngDungJAVA_COLLECTIONS;

import java.util.Scanner;
import java.util.Stack;

class KH{
    
}
public class KiemTraDayNgoacDung{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            Stack<Character>st=new Stack<>();
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
                    st.push(s.charAt(i));
                else{
                    if(!st.empty()){
                    if(st.peek()=='('&&s.charAt(i)==')')
                        st.pop();
                    else if(st.peek()=='['&&s.charAt(i)==']')
                        st.pop();
                    else if(st.peek()=='{'&&s.charAt(i)=='}')
                        st.pop();
                    }
                    else st.push(s.charAt(i));
                }
            }
            if(st.empty()) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}