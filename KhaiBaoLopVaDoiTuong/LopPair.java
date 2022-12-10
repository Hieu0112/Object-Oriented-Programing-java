
package CodeJava1.KhaiBaoLopVaDoiTuong;

import java.util.Scanner;
class Pair<T,U> {
    private T x;
    private U y;

    public Pair(T x,U y) {
         this.x=x;
         this.y=y;
        }
    boolean check(int so){
        if(so<2) return false;
        else {
            for(int i=2;i<=Math.sqrt(so);i++){
                if(so%i==0)
                    return false;
            }
            return true;
        }
    }
    public boolean isPrime(){
        return (check((Integer) x) &&check((Integer) y));
    }

    @Override
    public String toString() {
        return String.valueOf((Integer)x)+" "+String.valueOf((Integer)y);
    }
    
    }
public class LopPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
