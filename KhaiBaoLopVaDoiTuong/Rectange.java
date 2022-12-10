
package CodeJava1.KhaiBaoLopVaDoiTuong;
import java.util.Scanner;
public class Rectange{
    private double width;
    private double height;
    private String color;
    public Rectange(){
        this.width=1;
        this.height=1;
        
    }
    public Rectange(double width,double height,String color){
        this.width=width;
        this.height=height;
        this.color=color;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height=height;
    }

    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public double findArea(){
        return height*width;
    }
    
    public double finPerimeter(){
        return 2*(width+height);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double width=sc.nextDouble();
        double height=sc.nextDouble();
        String color=sc.next().toLowerCase();
        color=String.valueOf(color.charAt(0)).toUpperCase()+color.substring(1);
        Rectange hcn=new Rectange(width,height,color);
        if(height>0&&width>0)
            System.out.println((int)hcn.finPerimeter()+" "+(int)hcn.findArea()+" "+hcn.getColor());      
        else System.out.println("INVALID");
        }
}


