package danhsachsinhvien1;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SinhVien implements Serializable{
    private String ma,ten,lop;
    private Date ngaysinh;
    private float gpa;
    public SinhVien(int ma, String name, String lop, String ns, float gpa) 
            throws Exception {
        this.ma = "B20DCCN" + String.format("%03d", ma);
        this.ten = name;
        this.lop = lop;
        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ns);
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " +
                new SimpleDateFormat("dd/MM/yyyy").format(ngaysinh)+ " " 
                +String.format("%.2f",gpa);
    }
}
