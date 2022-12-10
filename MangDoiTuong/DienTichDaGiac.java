package CodeJava1.MangDoiTuong;

import java.util.*;

class Point {
    private double x;
    private double y;

    public Point() {

    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point (Point n) {
        this.x = n.x;
        this.y = n.y;
    }

    public double getX () {
        return x;
    }

    public double getY () {
        return y;
    }

    public double distance (Point n) {
        double d, r;
        r = Math.pow(n.x - this.x,2);
        d = Math.pow(n.y - this.y, 2);
        return Math.sqrt(r + d);
    }

    public double distance (Point n, Point m) {
        double d, r;
        r = Math.pow(n.x - m.x,2);
        d = Math.pow(n.y - m.y, 2);
        return Math.sqrt(Math.abs(d - r));
    }   

    public String toString () {
        return "1";
    }
}

public class DienTichDaGiac {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        ArrayList<Point>arr=new ArrayList<>();
        while (t --> 0) {
            arr.clear();
            int n=sc.nextInt();
            for(int i=1;i<=n;i++){
                arr.add(new Point(sc.nextDouble(),sc.nextDouble()));
            }
            double sum1=arr.get(n-1).getX()*arr.get(0).getY();
            double sum2=arr.get(n-1).getY()*arr.get(0).getX();
            for(int i=0;i<n-1;i++){
                sum1+=arr.get(i).getX()*arr.get(i+1).getY();
                sum2+=arr.get(i).getY()*arr.get(i+1).getX();
            }
            double sum=sum1-sum2;
            System.out.format("%.3f\n",sum/2);
        }
    }
}
