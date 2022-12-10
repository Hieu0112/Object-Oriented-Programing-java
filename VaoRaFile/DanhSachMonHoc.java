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
class MonHoc{
    private String ma,ten,tin;

    public MonHoc(String ma, String ten, String tin) {
        this.ma = ma;
        this.ten = ten;
        this.tin = tin;
    }

    public String getTen() {
        return ten;
    }
    
    @Override
    public String toString() {
        return ma+" "+ten+" "+tin;
    }
}
public class DanhSachMonHoc {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc=new Scanner(new File("MONHOC.in"));
        int t=Integer.parseInt(sc.nextLine());
        List<MonHoc>list=new ArrayList<>();
        while(t-->0){
            list.add(new MonHoc(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(list, new Comparator<MonHoc>(){
            @Override
            public int compare(MonHoc o1, MonHoc o2) {
                return o1.getTen().compareTo(o2.getTen());
            }
            
        });
        for (MonHoc monHoc : list) {
            System.out.println(monHoc);
        }
    }
}
