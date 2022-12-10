package VaoRaFile;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

class MONTHI{
    private String ma, ten, hinhthuc;

    public MONTHI(String ma, String ten, String hinhthuc) {
        this.ma = ma;
        this.ten = ten;
        this.hinhthuc = hinhthuc;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getHinhthuc() {
        return hinhthuc;
    }
    
}
class CATHI{
    private String ma, phong, time;
    private LocalDate localDate;
    public CATHI(int i, String date, String time, String phong){
        this.ma = "C" + String.format("%03d", i);
        this.phong = phong;
        this.time = time;
        this.localDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public String getMa() {
        return ma;
    }

    public String getPhong() {
        return phong;
    }

    public String getTime() {
        return time;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }
    
}
class LICHTHI{
    private LocalDate localDate;
    private String maCT, maMon, maNhom, time, ID, tenMon;
    private int soSV;

    public LICHTHI(String maCT, String maMon, String maNhom, int soSV){
        this.maCT = maCT;
        this.maMon = maMon;
        this.maNhom = maNhom;
        this.soSV = soSV;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public String getMaCT() {
        return maCT;
    }

    public void setMaCT(String maCT) {
        this.maCT = maCT;
    }

    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public String getMaNhom() {
        return maNhom;
    }

    public void setMaNhom(String maNhom) {
        this.maNhom = maNhom;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public int getSoSV() {
        return soSV;
    }

    public void setSoSV(int soSV) {
        this.soSV = soSV;
    }
    public int getyear(){
        return localDate.getYear();
    }
    public int getmonth(){
        return localDate.getMonthValue();
    }
    public int getdays(){
        return localDate.getDayOfMonth();
    }
    
    public int getgio(){
        return Integer.parseInt(time.substring(0,2));
    }
    public int getphut(){
        return Integer.parseInt(time.substring(3));
    }
    
    @Override
    public String toString(){
        return String.format("%02d/%02d/%d", localDate.getDayOfMonth(),localDate.getMonthValue(), localDate.getYear()) 
                + " " + time + " " + ID + " " + tenMon + " " + maNhom + " " + soSV;
    }
}
public class SapXepLichThiLocal {

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("MONTHI.in"));
        ArrayList<MONTHI> a = new ArrayList<>();
        ArrayList<CATHI> b = new ArrayList<>();
        ArrayList<LICHTHI> c = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0)
            a.add(new MONTHI(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        
        sc = new Scanner(new File("CATHI.in"));
        n = sc.nextInt();
        for(int i = 1; i <= n; i++)
            b.add(new CATHI(i, sc.next(), sc.next(), sc.next()));
        
        sc = new Scanner(new File("LICHTHI.in"));
        n = sc.nextInt();
        while(n-->0)
            c.add(new LICHTHI(sc.next(), sc.next(), sc.next(), sc.nextInt()));
        
        for(MONTHI x : a)
            for(LICHTHI y : c)
                if(x.getMa().equals(y.getMaMon()))
                    y.setTenMon(x.getTen());
        for(CATHI x : b)
            for(LICHTHI y : c)
                if(x.getMa().equals(y.getMaCT())){
                    y.setLocalDate(x.getLocalDate());
                    y.setTime(x.getTime());
                    y.setID(x.getPhong());
                }
        Collections.sort(c, new Comparator<LICHTHI>(){
            @Override
            public int compare(LICHTHI o1, LICHTHI o2) {
                if(o1.getLocalDate().equals(o2.getLocalDate())){
                    if(o1.getgio()==o2.getgio())
                        return o1.getphut()-o2.getphut();
                    else
                        return o1.getgio()-o2.getgio();
                }
                return o1.getLocalDate().compareTo(o2.getLocalDate());
            }
            
        });
        for(LICHTHI x : c)
                System.out.println(x);
    }
}