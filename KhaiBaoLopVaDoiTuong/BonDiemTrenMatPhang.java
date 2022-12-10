
package CodeJava1.KhaiBaoLopVaDoiTuong;
import java.util.Scanner;
class Point3D{
    private int x,y,z;

    public Point3D() {
    }

    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public static boolean check(Point3D p1,Point3D p2,Point3D p3,Point3D p4){
        int X12=p2.x-p1.x;      int X13=p3.x-p1.x;
        int Y12=p2.y-p1.y;      int Y13=p3.y-p1.y;
        int Z12=p2.z-p1.z;      int Z13=p3.z-p1.z;
        
        int a = Y12*Z13-Z12*Y13;
        int b = X13*Z12-Z13*X12;
	int c = X12*Y13-Y12*X13;
        
        int X14=p4.x-p1.x;
        int Y14=p4.y-p1.y;
        int Z14=p4.z-p1.z;
        
        return (a*X14 + b*Y14 + c*Z14==0);
    }
}
public class BonDiemTrenMatPhang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
        Point3D p1 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p2 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p3 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p4 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        
        if(Point3D.check(p1,p2,p3,p4)){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
        }
    }
}
