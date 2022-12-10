package danhsachsinhvien1;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("SV.in"));
        List<SinhVien>list=(ArrayList<SinhVien>)ois.readObject();
        for (SinhVien sinhVien : list) {
            System.out.println(sinhVien);
        }
    }
}
