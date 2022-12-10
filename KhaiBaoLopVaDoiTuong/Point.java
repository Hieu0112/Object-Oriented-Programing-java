
package CodeJava1.KhaiBaoLopVaDoiTuong;
import java.util.Scanner;

public class Point {
    private double x;
    private double y;
    public Point(){
        
    }
    public Point(double x,double y){
        this.x=x;
        this.y=y;
    }
    public Point(Point p){
        this.x=p.x;
        this.y=p.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public double distance(Point secondPoint){
        double distanceX=secondPoint.x-this.x;
        double distanceY=secondPoint.y-this.y;
        return Math.sqrt(distanceX*distanceX+distanceY*distanceY);
    }
    public double distance(Point p1,Point p2){
        double distanceX=p1.x-p2.x;
        double distanceY=p1.y-p2.y;
        return Math.sqrt(distanceX*distanceX+distanceY*distanceY);
    }

    @Override
    public String toString() {
        return "1";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            Point A=new Point(sc.nextDouble(),sc.nextDouble());
            Point B=new Point(sc.nextDouble(),sc.nextDouble());
            System.out.format("%.4f",A.distance(B));
            System.out.println();
        }
    }
}
