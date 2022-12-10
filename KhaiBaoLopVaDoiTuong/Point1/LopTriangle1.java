
package CodeJava1.KhaiBaoLopVaDoiTuong.Point1;
import java.util.Scanner;
class Triangle{
    private Point p1,p2,p3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public double getP1P2() {
        return p1.distance(p2);
    }

    public double getP2P3() {
        return p2.distance(p3);
    }

    public double getP3P1() {
        return p3.distance(p1);
    }
    
    
    public boolean valid(){
        return (getP1P2()<getP2P3()+getP3P1() && getP2P3()<getP3P1()+getP1P2() && getP3P1()<getP1P2()+getP2P3());
    }
    
    public String getPerimeter(){
        return String.format("%.3f", getP1P2() + getP2P3() + getP3P1());
    }
}
class Point{
    private double x,y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public static Point nextPoint(Scanner sc){
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        return new Point(x,y);
    }
    
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
     public double distance(Point p2){
        double distanceX=x-p2.x;
        double distanceY=y-p2.y;
        return Math.sqrt(distanceX*distanceX+distanceY*distanceY);
    }
}
public class LopTriangle1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
}
