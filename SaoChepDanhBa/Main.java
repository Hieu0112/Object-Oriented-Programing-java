/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SaoChepDanhBa;

import java.io.*;
import java.util.*;
/**
 *
 * @author trinh
 */
class DienThoai {
    private String name,std,day;
    private String ho,tendem,ten;
    public DienThoai(String name, String std, String day) {
        this.name = name;
        this.std = std;
        this.day = day;
        String s = name.trim().toLowerCase();
                String[] token =s.split("\\s+");
                String res="";
                for(String x:token){
                    res = res+ x.substring(0,1).toUpperCase()+x.substring(1)+" ";
                }
                res = res.trim();
                String[] tokens = res.split(" ");
                this.ten = tokens[tokens.length-1];
                this.ho  = tokens[0];
                String td="";
                for(int i = 1; i < tokens.length-1; i++){
                    td = td + tokens[i]+" ";
                }
                this.tendem=td;
    }

    @Override
    public String toString() {
        return name+": "+std+" "+day+"\n";
    }
    public String getTen(){
        return ten;
    }
    public String getHo(){
        return ho;
    }
    public String getTenDem(){
        return tendem;
    }
}
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(new File("SOTAY.txt"));
        String ngay="",name="",sdt="";
        List<DienThoai>l=new ArrayList<>();
        while(sc.hasNextLine()){
            name=sc.nextLine();
            if(name.contains("Ngay ")){
                ngay=name;
                continue;
            }
            sdt=sc.nextLine();
            l.add(new DienThoai(name, sdt,ngay));
        }
        sc.close();
        Collections.sort(l,Comparator.comparing(DienThoai::getTen).thenComparing(DienThoai::getHo).thenComparing(DienThoai::getTenDem));
        FileWriter viet=new FileWriter("DIENTHOAI.txt");
        for (DienThoai dienThoai : l) {
            viet.write(dienThoai.toString());
        }
        viet.close();
    }
}
