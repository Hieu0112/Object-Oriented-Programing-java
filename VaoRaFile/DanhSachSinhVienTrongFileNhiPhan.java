
package VaoRaFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

class SinhVien{
    private String ma,name,lop,date;
    private double gpa;

    public SinhVien(int ma, String name, String lop, String date, double gpa) {
        this.ma = "B20DCCN"+String.format("%03d", ma);
        this.name = name;
        this.lop = lop;
        this.date = date;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return ma+" "+name+" "+lop+" "+
                date+" "+String.format("%02f", gpa);
    }
    
    
}
public class DanhSachSinhVienTrongFileNhiPhan {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("SV.in"));
        List<SinhVien>list=(ArrayList<SinhVien>)ois.readObject();
        for (SinhVien sinhVien : list) {
            System.out.println(sinhVien);
        }
    }
}
