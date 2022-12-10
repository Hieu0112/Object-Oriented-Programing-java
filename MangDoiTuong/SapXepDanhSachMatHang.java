
package CodeJava1.MangDoiTuong;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class InfoHang{
    private int code;
    private String name;
    private String kind;
    private double buy;
    private double sell;
    public InfoHang(int code,String name,String kind,double buy,double sell){
        this.code=code;
        this.name=name;
        this.kind=kind;
        this.buy=buy;
        this.sell=sell;
    }
    public Double getInterest() {
        return sell-buy;
    }
    public String toString(){
        return code+" "+name+" "+kind+" "+String.format("%.2f",sell-buy);
    }
}
public class SapXepDanhSachMatHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<InfoHang> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            InfoHang a = new InfoHang(i, sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            arr.add(a);
        }
        Collections.sort(arr, Comparator.comparingDouble(InfoHang::getInterest).reversed());
        for(InfoHang x:arr) {
            System.out.println(x.toString());
        }
    }
}

