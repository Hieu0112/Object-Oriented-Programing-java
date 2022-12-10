package hocphi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HelloJar {
    public static void main(String[] args) {
        PaymentController pc = new PaymentController();
        //Output for test
        Invoice invoice = pc.getInvoice();
        InvoiceView.show(invoice);
    }
}
class Invoice {
    private Student student;
    private List<Subject> list = new ArrayList<>();
    private Rule rule;
    private double tien;
    
    public Invoice() {
    }
    public Invoice(Student student, List<Subject> list, Rule rule) {
        this.student = student;
        this.list = list;
        this.rule = rule;
        this.tien = getTien();
    }

    private long getTien() {
        long res = 0;
        for (Subject subject : list) {
            res += subject.getTin();
        }
        res *= rule.getGia();
        return res;
    }
    @Override
    public String toString() {
        String listSubject = "";
        for(Subject subject : list) {
            listSubject += subject;
        }
        return student + "\nCác môn học:" + listSubject + "\nHọc phí phải nộp là: " + String.format("%.01f",tien) +  rule;
    }
    
}
class InvoiceView {
    public static void show(Invoice invoice) {
        System.out.println(invoice);
    }

}
class PaymentController {
    Student student;
    List<Subject> list = new ArrayList<>();
    Rule rule;
    public PaymentController() {
        Scanner sc = new Scanner(System.in);
        student = new Student(sc.nextLine(), sc.nextLine());
        int t= Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            list.add(new Subject(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        rule = new Rule(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
    }

    public Invoice getInvoice() {
        Invoice invoice = new Invoice(student, list, rule);
        return invoice;
    }

}
class Rule {
    private String soQD;
    private String name_QD;
    private int gia;

    public Rule(String soQD, String name_QD, int gia) {
        this.soQD = soQD;
        this.name_QD = name_QD;
        this.gia = gia;
    }
    
    
    public int getGia() {
        return gia;
    }

    @Override
    public String toString() {
        return "\nTheo QĐ: " + soQD;
    }
}
class Student {
    private String ma;
    private String name;

    public Student(String ma, String name) {
        this.ma = ma;
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "Mã sinh viên: " + ma + "\nHọ tên: " + name;
    }
}
class Subject {
    private String Id_mon ,name_mon;
    private int tin;

    public Subject(String Id_mon, String name_mon, int tin) {
        this.Id_mon = Id_mon;
        this.name_mon = name_mon;
        this.tin = tin;
    }
    
    public int getTin() {
        return tin;
    }
    @Override
    public String toString() {
        return "\n" + name_mon;
    }
    
}



