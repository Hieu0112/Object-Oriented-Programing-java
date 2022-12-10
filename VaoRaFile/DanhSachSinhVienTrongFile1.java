/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VaoRaFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class SinhVienFile{
    private String ma,name,lop,mail;

    public SinhVienFile(String ma, String name, String lop, String mail) {
        this.ma = ma;
        this.name = name.trim();
        this.lop = lop;
        this.mail = mail;
    }
    private String ChuanHoa(){
        String s=name.toLowerCase().replaceAll("\\s+"," ");
        String[] tmp=s.split(" ");
        s="";
        for (String string : tmp) {
            String s1=String.valueOf(string.charAt(0)).toUpperCase();
            s=s+s1+string.substring(1)+" ";
        }
        return s.trim();
    }
    public String getMa() {
        return ma;
    }
    
    @Override
    public String toString() {
        return ma+" "+ChuanHoa()+" "+lop+" "+mail;
    }
    
}
public class DanhSachSinhVienTrongFile1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("SINHVIEN.in"));
        int n=Integer.parseInt(sc.nextLine());
        List<SinhVienFile>list=new ArrayList<>();
        while(n-->0){
            list.add(new SinhVienFile(sc.nextLine(), sc.nextLine(), 
                    sc.nextLine(), sc.nextLine()));
    }
        Collections.sort(list, (SinhVienFile a,SinhVienFile b)->{
            return a.getMa().compareToIgnoreCase(b.getMa());
        });
        for (SinhVienFile sinhVienFile : list) {
            System.out.println(sinhVienFile);
        }
    }
}