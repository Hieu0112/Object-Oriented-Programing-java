/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UngDungJAVA_COLLECTIONS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author trinh
 */
public class testHashmap {
    public static void main(String[] args) {
//        ArrayList<Integer> a = new ArrayList<>();
        HashMap<Integer, Integer> m = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
            for(int i = 0; i < n; i++){
                int x = sc.nextInt();
                if(m.containsKey(x)) 
                    m.put(x, m.get(x)+1);
                else{
                    m.put(x, 1);
//                    a.add(x);
                }
            }
            for(int x: m.keySet()){
                System.out.println(x+": "+m.get(x));  
        }
    }
}
