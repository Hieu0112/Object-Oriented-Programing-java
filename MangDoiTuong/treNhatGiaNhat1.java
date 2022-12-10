package CodeJava1.MangDoiTuong;

import java.util.*;
class ps{
    private String name,bir;
    public ps(String name,String bir){
        this.name= name;
        this.bir = bir;
    }
    public String getName(){
        return name;
    }
    public int getDay(){
    
        return Integer.parseInt(bir.substring(0,2));
    }
    public int getMonth(){
        return Integer.parseInt(bir.substring(3,5));
    }
    public int getYear(){

        return Integer.parseInt(bir.substring(6));
    }
}
public class treNhatGiaNhat1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<ps> ls = new ArrayList<>();
        while(t-- > 0){
            String s = sc.nextLine();
            String[] tokens = s.split(" ");
            ps a = new ps(tokens[0],tokens[1]);
            ls.add(a);
        }
        Collections.sort(ls,Comparator.comparingInt(ps::getYear).thenComparingInt(ps::getMonth).thenComparingInt(ps::getDay));
        System.out.println(ls.get(ls.size()-1).getName());
        System.out.println(ls.get(0).getName());
 
    }
    
}
