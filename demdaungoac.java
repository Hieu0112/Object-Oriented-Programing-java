
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


public class demdaungoac {
    public static void main(String[] args) {
        List<Integer>st=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s=sc.nextLine();
            st.clear();
            int dem=1;
            int ngoai=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='('){
                    System.out.print(dem+" ");
                    st.add(dem++);
                }
                else if(s.charAt(i)==')'){
                    ngoai=st.get(st.size()-1);
                    System.out.print(ngoai+" ");
                    st.remove(st.size()-1);
                }
        }
            System.out.println("");
     }
    }
}
