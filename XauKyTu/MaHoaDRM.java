/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XauKyTu;

import java.util.Scanner;

/**
 *
 * @author trinh
 */
public class MaHoaDRM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            char[]arr=s.toCharArray();
            int sum1=0,sum2=0;
            for(int i = 0; i < arr.length/2; i++)
                sum1+=arr[i]-'A';
            for(int i=arr.length/2;i<arr.length; i++)
                sum2+=arr[i]-'A';
            
            for(int i = 0; i < arr.length/2; i++){
                int x = sum1 + arr[i] - 'A';
                x%=26;
                arr[i] = (char) (x + 'A');
            }
            for(int i=arr.length/2;i<arr.length; i++){
                int x = sum2 + arr[i] - 'A';
                x%=26;
                arr[i] = (char) (x + 'A');
            }
            int len=arr.length/2;
            for(int i = 0; i < len; i++){
                int x = arr[i] - 'A' + arr[len + i] - 'A';
                x%=26;
                arr[i] = (char) (x + 'A');
            }
            for(int i = 0; i < arr.length/2; i++) 
                System.out.print(arr[i]);
            System.out.println();
        }
    }
}
