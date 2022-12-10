/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VaoRaFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author trinh
 */
public class TinhGiaTriBieuThuc {
    static String pheptrinh="+-*/";
    static boolean checkDau(char dau){
        return pheptrinh.contains(String.valueOf(dau));
    }
    static int UutienDau(char dau){
        if(dau=='*'||dau=='/')
            return 1;
        else if(dau=='+'||dau=='-')
            return 2;
        else return 3;
    }
    static String ChuanHoaString(String s){
        String res="";
        Stack<Character>st=new Stack<>();
        st.push('!');
        for (int i=0;i<s.length();i++) {
            if(s.charAt(i)=='('){
                st.push(s.charAt(i));
                continue;
            }
            else if(s.charAt(i)==')'){
                while(st.peek()!='('){
                    res+=st.peek();
                    st.pop();
                }
                st.pop();
                continue;
            }
            else if(checkDau(s.charAt(i))){
                while(UutienDau(st.peek())<=UutienDau(s.charAt(i))){ 
                   res+=st.peek();
                   st.pop();
               }
                st.push(s.charAt(i));
                continue;
            }
            long so=0;
            boolean ok=true;
            while(i<s.length() && s.charAt(i)!=')'
                    &&!checkDau(s.charAt(i))){
                    long ss=(long)(s.charAt(i)-'0');
                    i++;
                    so=so*10+ss;
                    ok=false;
            }
            if(!ok)
                i--;
            res+='(';
            res+=Long.toString(so);
            res+=")";
        }
            while(st.peek()!='!'){
                res+=st.peek();
                st.pop();
        }
            return res;
    }
    static long TinhKetQua(String a){
        Stack<Long>st=new Stack<>();
        int i=0;
        while(i<a.length()){
            if(a.charAt(i)=='('){
                i++;
                long so=0;
                while(a.charAt(i)!=')'){
                    so=so*10 +(a.charAt(i)-'0');
                    i++;
                }
                i++;
                st.push(so);
            }
            else if(st.size()>1){
                long tmp1=st.peek();
                st.pop();
                long tmp2=st.peek();
                st.pop();
                if (a.charAt(i) == '+')
                    st.push(tmp1 + tmp2);
                else if (a.charAt(i) == '-')
                    st.push(tmp2 - tmp1);
                else if (a.charAt(i) == '*')
                    st.push(tmp1 * tmp2);
                else if (a.charAt(i) == '/')
                    st.push(tmp2 / tmp1);
                i++;
            }
        }
        return st.peek();
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("BIEUTHUC.in"));
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s=sc.nextLine();
//            System.out.println(ChuanHoaString(s));
            System.out.println(TinhKetQua(ChuanHoaString(s)));
        }
    }
}
