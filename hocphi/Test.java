/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hocphi;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author trinh
 */
class Invoice {
    private Rule rule;
    private Student st;
    private ArrayList<Subject> alSubject;
    private double amount;

    public Invoice(Rule rule) {
        this.rule = rule;
    }

    public Rule getRule() {
        return rule;
    }


    public Student getSt() {
        return st;
    }

    public void setSt(Student st) {
        this.st = st;
    }
    

    public ArrayList<Subject> getAlSubject() {
        return alSubject;
    }

    public void setAlSubject(ArrayList<Subject> alSubject) {
        this.alSubject = alSubject;
    }
    

    public double getAmount() {
        double sum=0;
        for (Subject subject : alSubject) {
            sum+=(double)subject.getCredit();
        }
        return sum*rule.getCreditPrice();
    }

    
}
class Rule {
    private String code;
    private String name;
    private double creditPrice;

    public Rule(String code, String name, double creditPrice) {
        this.code = code;
        this.name = name;
        this.creditPrice = creditPrice;
    }


    public String getCode() {
        return code;
    }


    public String getName() {
        return name;
    }


    public double getCreditPrice() {
        return creditPrice;
    }

    
}
class Student {
    private String code;
    private String name;


    public Student(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }


    
}
class Subject {
    private String name;
    private String code;
    private int credit;

    public Subject(String name, String code, int credit) {
        this.name = name;
        this.code = code;
        this.credit = credit;
    }

    public String getName() {
        return name;
    }


    public String getCode() {
        return code;
    }


    public int getCredit() {
        return credit;
    }

    @Override
    public String toString() {
        return "";
    }

    
}
public class Test {
    public static void main(String[] args) {
        PaymentController pc = new PaymentController();
        //Output for test
        Invoice invoice = pc.getInvoice();
        InvoiceView.show(invoice);
    }
}
class InvoiceView {

    public static void show(Invoice invoice) {
        System.out.println("Mã sinh viên: " + invoice.getSt().getCode());
        System.out.println("Họ tên: " + invoice.getSt().getName());
        System.out.println("Các môn học:");
        for (Subject subject : invoice.getAlSubject()) {
            System.out.println(subject.getName());
        }
        System.out.println("Học phí phải nộp là: " + invoice.getAmount());
        System.out.println("Theo QĐ: " + invoice.getRule().getCode());
    }
    
}
class PaymentController {
    Student student;
    ArrayList<Subject> list = new ArrayList<>();
    Rule rule;
    public PaymentController() {
        Scanner sc = new Scanner(System.in);
        String code=sc.nextLine();
        String name=sc.nextLine();
        student = new Student(code,name);
        int t= Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String codeM=sc.nextLine();
            String nameM=sc.nextLine();
            int tc=Integer.parseInt(sc.nextLine());
            list.add(new Subject(nameM,codeM,tc));
        }
        rule = new Rule(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
    }

    public Invoice getInvoice() {
        Invoice invoice = new Invoice(rule);
        invoice.setSt(student);
        invoice.setAlSubject(list);
        return invoice;
    }
    
}
