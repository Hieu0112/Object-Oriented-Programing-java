package VaoRaFile;

import java.io.File;
import java.util.*;

class SP{
    public String ma, ten;
    public long loai1, loai2;
    public SP(String ma, String ten, long a, long b){
        this.ma = ma;
        this.ten = ten;
        this.loai1 = a;
        this.loai2 = b;
    }
}
class HD{
    private String ma, ten;
    private long reduce, pay;
    public HD(int i, String ma, String ten, long a, long c){
        this.ma = ma + '-' + String.format("%03d", i);
        this.ten = ten;
        if(c >= 150) this.reduce = a * 50 / 100;
        else if(c >= 100) this.reduce = a * 30 / 100;
        else if(c >= 50) this.reduce = a * 15 / 100;
        this.pay = a - reduce;
    }
    @Override
    public String toString(){
        return ma + " " + ten + " " + reduce + " " + pay;
    }
}
public class HoaDon1{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("DATA1.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SP> a = new ArrayList<>();
        ArrayList<HD> b = new ArrayList<>();
        while(n-- > 0)
            a.add(new SP(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine())));
        sc = new Scanner(new File("DATA2.in"));
        n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            String s = sc.next();
            String s1 = s.substring(0,2);
            long c = sc.nextInt(), x = Long.parseLong(s.substring(2));
            for(int j = 0; j < a.size(); j++)
                if(a.get(j).ma.equals(s1)){
                    if(x == 1) b.add(new HD(i, s, a.get(j).ten, c * a.get(j).loai1, c));
                    else b.add(new HD(i, s, a.get(j).ten, c * a.get(j).loai2, c));
                    break;
                }
        }
        for(HD x : b)
            System.out.println(x);
    }
}
