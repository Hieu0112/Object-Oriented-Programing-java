/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VaoRaFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author trinh
 */
class DS_SP{
    private String ma,name,han;
    private int gia;

    public DS_SP(String ma, String name, String gia, String han) {
        this.ma = ma;
        this.name = name;
        this.gia = Integer.parseInt(gia);
        this.han = han;
    }

    public int getGia() {
        return gia;
    }

    public String getMa() {
        return ma;
    }
    
    @Override
    public String toString() {
        return ma+" "+name+" "+gia+" "+han;
    }
    
}
public class DanhSachSanPham2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("SANPHAM.in"));
        List<DS_SP>l=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            l.add(new DS_SP(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(l, Comparator.comparing(DS_SP::getGia).reversed().thenComparing(DS_SP::getMa));
        for (DS_SP ds_sp : l) {
            System.out.println(ds_sp);
        }
    }
}
