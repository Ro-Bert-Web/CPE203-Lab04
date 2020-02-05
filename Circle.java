import java.awt.Color;
import java.awt.Point;

public class Circle implements Shape{
   private Color color;
   private Point center;
   private double radius;

   public Circle(Point p, double r, Color c){
      color = c;
      center = p;
      radius = r;
   }

   public void setColor(Color c){
      color = c;
   }
   public void setCenter(Point p){
      center = p;
   }
   public void setRadius(double r){
      radius = r;
   }
   public void translate(Point p){
      center.setLocation(center.getX() + p.getX(), center.getY() + p.getY());
   }

   public Color getColor(){
      return color;
   }
   public Point getCenter(){
      return center;
   }
   public double getRadius(){
      return radius;
   }
   public double getArea(){
      return Math.PI * Math.pow(radius, 2);
   }
   public double getPerimeter(){
      return Math.PI * radius * 2;
   }
}
