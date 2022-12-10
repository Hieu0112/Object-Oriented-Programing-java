/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class chia11 {
    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t-->0){
        String str=sc.next();
        int sum=0; 
        for(int i=0;i<str.length();i++){
            if(i%2==0)sum+=(str.charAt(i)-'0');
            else sum-=(str.charAt(i)-'0');
        }
        if(sum%11==0)System.out.println("YES");
        else System.out.println("NO");
        }
    }
}
