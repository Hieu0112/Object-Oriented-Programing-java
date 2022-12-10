/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VaoRaFile;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 *
 * @author trinh
 */
public class SoKhacNhauTrongFile3 {
    public static void main(String[] args) throws Exception{
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("DATA.in"));
        List<Integer>list=(ArrayList<Integer>)ois.readObject();
        TreeMap<Integer,Integer> m=new TreeMap<>();
        for (Integer integer : list) {
            if(m.containsKey(integer)){
                m.put(integer, m.get(integer)+1);
            }
            else
                m.put(integer, 1);
        }
        for (Integer x:m.keySet()) {
            System.out.println(x+" "+m.get(x));
        }
        
    }
}
