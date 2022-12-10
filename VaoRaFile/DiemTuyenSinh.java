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

class InfoTS{
    private String ma,name,dt,kv;
    private double diem;

    public InfoTS(int ma,String name, String diem,String dt, String kv) {
        this.ma="TS"+String.format("%02d", ma);
        this.name = name.trim().toLowerCase();
        this.diem=Double.parseDouble(diem);
        this.dt = dt;
        this.kv = kv;
    }
    private double Uutien(){
        double uutien =0;
        if(dt.equalsIgnoreCase("kinh"))
            uutien+=0;
        else
            uutien+=1.5;
        if(kv.equals("1"))
                uutien+=1.5;
        else if(kv.equals("2"))
                uutien+=1;
        return uutien;
    }
    private String ChuanHoa(){
        String s=name.replaceAll("\\s+"," ");
        String[] tmp=s.split(" ");
        s="";
        for (String string : tmp) {
            String s1=String.valueOf(string.charAt(0)).toUpperCase();
            s=s+s1+string.substring(1)+" ";
        }
        return s.trim();
    }
    public double sum(){
        return Uutien()+diem;
    }
    private String xet(){
        //dk?giatri true:false
        return sum()>=20.5?"Do":"Truot";
    }

    @Override
    public String toString() {
        return ma+" "+ChuanHoa()+" "+sum()+" "+xet();
    }
   
}
public class DiemTuyenSinh {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("THISINH.in"));
        List<InfoTS>list=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t;i++){
            list.add(new InfoTS(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(list, Comparator.comparingDouble(InfoTS::sum).reversed());
        for (InfoTS infoTS : list) {
            System.out.println(infoTS);
        }
    }
}
