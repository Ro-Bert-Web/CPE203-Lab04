import java.awt.Color;
import java.awt.Point;

public class Rectangle implements Shape{
   private Color color;
   private Point topLeft;
   private double width;
   private double height;

   public Rectangle(double w, double h, Point p, Color c){
      color = c;
      topLeft = p;
      width = w;
      height = h;
   }

   public void setColor(Color c){
      color = c;
   }
   public void setWidth(double w){
      width = w;
   }
   public void setHeight(double h){
      height = h;
   }
   public void translate(Point p){
      topLeft.setLocation(topLeft.getX() + p.getX(), topLeft.getY() + p.getY());
   }

   public Color getColor(){
      return color;
   }
   public Point getTopLeft(){
      return topLeft;
   }
   public double getWidth(){
      return width;
   }
   public double getHeight(){
      return height;
   }
   public double getArea(){
      return width * height;
   }
   public double getPerimeter(){
      return (width + height) * 2;
   }
}
