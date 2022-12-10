/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VaoRaFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author trinh
 */
public class LoaiPhong implements Comparable<LoaiPhong>{
    private String kyhieu,name,gia,phi;

    public LoaiPhong(String s) {
        String tmp[]=s.split("\\s+");
        this.kyhieu = tmp[0];
        this.name = tmp[1];
        this.gia = tmp[2];
        this.phi = tmp[3];
    }

    @Override
    public int compareTo(LoaiPhong o) {
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return kyhieu+" "+name+" "+gia+" "+phi;
    }
    
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}
