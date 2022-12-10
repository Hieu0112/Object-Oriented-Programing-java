
package CodeJava1.Mang;
import java.util.Scanner;
public class TichMaTranVoiChuyenViCuaNo {
    public static void xuat(int res[][],int n,int m) {
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)
                System.out.print(res[i][j]+" ");
            System.out.println();
        }
    }
    public static void tich(int a[][],int b[][],int n,int m){
        int[][] res=new int[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                for(int k=0;k<m;k++)
                    res[i][j]+=a[i][k]*b[k][j];
        xuat(res,n,n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for(int lap=1;lap<=t;lap++){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int [][] a=new int[n][m];
            int [][] b=new int[m][n];
            for(int i=0;i<n;i++)
                for(int j=0;j<m;j++)
                    a[i][j]=sc.nextInt();
            for(int i=0;i<n;i++)
                for(int j=0;j<m;j++)
                    b[j][i]=a[i][j];
            System.out.println("Test "+lap+":");
            tich(a,b,n,m);
            System.out.println();
        }
    }
}
