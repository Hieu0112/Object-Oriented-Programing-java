package CodeJava1.KhaiBaoLopVaDoiTuong;

import java.util.Scanner;
public class PointCV {
    private double x;
    private double y;
    public PointCV(){
        
    }
    public PointCV(double x,double y){
        this.x=x;
        this.y=y;
    }
    public PointCV(PointCV p){
        this.x=p.x;
        this.y=p.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public double distance(PointCV secondPoint){
        double distanceX=secondPoint.x-this.x;
        double distanceY=secondPoint.y-this.y;
        return Math.sqrt(distanceX*distanceX+distanceY*distanceY);
    }
    public double distance(PointCV p1,PointCV p2){
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
            PointCV A=new PointCV(sc.nextDouble(),sc.nextDouble());
            PointCV B=new PointCV(sc.nextDouble(),sc.nextDouble());
            PointCV C=new PointCV(sc.nextDouble(),sc.nextDouble());
            double a=A.distance(B);
            double b=A.distance(C);
            double c=B.distance(C);
            double s=Math.sqrt((a + b + c) * (a + b - c) * (a - b + c) * (-a + b + c));
            if( a<b+c && b<a+c && c<a+b )
                System.out.format("%.2f\n",s/4);
            else
                System.out.println("INVALID");
        }
    }
}
