
package CodeJava1.KhaiBaoLopVaDoiTuong;

import java.util.Scanner;

class Matrix{
    private int n,m;
    private int[][] arr;
    public Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        this.arr=new int[n][m];
    }

    public Matrix(int n, int m, int[][] arr) {
        this.n = n;
        this.m = m;
        this.arr = arr;
    }
    
    public int[][] getArr() {
        return arr;
    }

    public int getM() {
        return m;
    }

    public int getN() {
        return n;
    }
    
    public void nextMatrix(Scanner sc){
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                this.arr[i][j]=sc.nextInt();
    }
    public Matrix mul(Matrix tmp){
        int p=tmp.getM();
        int[][] res=new int[n][p];
        for(int i=0;i<n;i++){
            for(int j=0;j<p;j++)
                for(int k=0;k<m;k++)
                    res[i][j]+=arr[i][k]*tmp.getArr()[k][j];
        }
        return new Matrix(n,p, res);
    }
    public String Result_kq(){
        String res="";
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)
                res+=String.valueOf(arr[i][j])+" ";
            res+='\n';
        }
        return res;
    }
    @Override
    public String toString() {
        return Result_kq();
    }
    
}
public class tich2DoiTuongMaTran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), p = sc.nextInt();
        Matrix a = new Matrix(n,m);
        a.nextMatrix(sc);
        Matrix b = new Matrix(m,p);
        b.nextMatrix(sc);
        System.out.println(a.mul(b));
    }
}
