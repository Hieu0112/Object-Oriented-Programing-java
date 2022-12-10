/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UngDungJAVA_COLLECTIONS;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author trinh
 */
class Pair<K,V>{
    private String k;
    private Integer v;

    public Pair(String k, Integer v) {
        this.k = k;
        this.v = v;
    }

    public String getK() {
        return k;
    }

    public Integer getV() {
        return v;
    }
    
}
public class QuayHinhVuong {
    //Chon 1 hinh vuong de quay cac o
    static String QuayPhai(String s){
        return ""+s.charAt(0)+s.charAt(4)+s.charAt(1)+s.charAt(3)+
                s.charAt(5)+s.charAt(2);
    }
    static String QuayTrai(String s){
        return ""+s.charAt(3)+s.charAt(0)+s.charAt(2)+s.charAt(4)+
                s.charAt(1)+s.charAt(5);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String a = "";
            String b = "";
            for(int i = 0; i < 6; i++){
                int x = sc.nextInt();
                a += String.valueOf(x);
            }
            for(int i = 0; i < 6; i++){
                int x = sc.nextInt();
                b += String.valueOf(x);
            }
            Map<String, Integer> m = new TreeMap<>();
            Deque<Pair<String, Integer>> ls = new ArrayDeque<>();
            ls.add(new Pair(a, 0));
            while(!ls.isEmpty()){
                Pair s = ls.getFirst();
                ls.removeFirst();
                if(QuayPhai(s.getK()).equals(b) || QuayTrai(s.getK()).equals(b)){
                    System.out.println(s.getV()+1);
                    break;
                }
                String s1 = QuayPhai(s.getK());
                String s2 = QuayTrai(s.getK());
                if(!m.containsKey(s1)){
                    m.put(s1, 1);
                    ls.add(new Pair(s1, s.getV() + 1));
                }
                if(!m.containsKey(s2)){
                    m.put(s2, 1);
                    ls.add(new Pair(s2, s.getV() + 1));
                }
            }
        }
    }
}
