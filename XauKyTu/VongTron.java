/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XauKyTu;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author trinh
 */
public class VongTron {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int dem = 0;
        Map<String, Integer> m1 = new TreeMap<>();
        Map<Character, Integer> m2 = new TreeMap<>();
        Map<Character, Integer> m3 = new TreeMap<>();
        String s = sc.next();
        for(int i = 0; i < s.length(); i++)
            if(!m2.containsKey(s.charAt(i))) m2.put(s.charAt(i), i);
        for(int i = 0; i < s.length(); i++)
            m3.put(s.charAt(i), i);
        for(int i = 0; i < s.length(); i++)
            for(int j = 'A'; j <= 'Z'; j++)
                if(s.charAt(i) != j){
                    String tmp = "", tam = "";
                    tmp = tmp + s.charAt(i) + (char) j;
                    tam = tam + (char) j + s.charAt(i);
                    char c = (char) j;
                    if(!m1.containsKey(tmp) && !m1.containsKey(tam)){
                        if(m2.get(s.charAt(i)) < m2.get(c) && m2.get(c) < m3.get(s.charAt(i)) && m3.get(s.charAt(i)) < m3.get(c)){
                            dem++;
                            m1.put(tmp, 1);
                            m1.put(tam, 1);
                        }     
                    }
                }
        System.out.println(dem);
    }
}
