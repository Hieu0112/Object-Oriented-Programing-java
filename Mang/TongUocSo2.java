/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mang;

import java.util.Scanner;

/**
 *
 * @author trinh
 */
public class TongUocSo2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int[]check=new int[y+1];
        for (int i = 0; i < check.length; i++) {
            check[i]=0;
        }
        for (int i = 2; i < check.length; i++) {
            for (int j = 2*i; j < check.length; j+=i) {
                if(check[i]==0)
                    check[j]=1;
            }
        }
        
    }
}
