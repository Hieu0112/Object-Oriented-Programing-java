/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

import java.util.Scanner;

/**
 *
 * @author trinh
 */
public class LuaChonThamLam {
    static String Min(int n,int s){
        String res="";
        while(s>=10){
            res+="9";
            s-=9;
        }
        n-=res.length();
        if(n==1){
            res=s+res;
        }
        else{
            res=(s-1)+res;
            n-=2;
            while(n-->0)
                res="0"+res;
            res='1'+res;
        }
        return res;
    }
    static String Max(int n,int s){
        String res="";
        while(s>=10){
            res="9"+res;
            s-=9;
        }
        res=res+s;
        int len=res.length();
        n-=len;
        while(n-->0){
            res=res+'0';
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=sc.nextInt();
        if(n*9<s||s==0){
            System.out.println("-1 -1");
        }
        else{
            System.out.println(Min(n,s)+" "+Max(n,s));
        }
    }
}
