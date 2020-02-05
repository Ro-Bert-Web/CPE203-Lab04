import java.awt.Color;
import java.awt.Point;

public class Triangle implements Shape{
   private Color color;
   private Point a;
   private Point b;
   private Point c;

   public Triangle(Point x, Point y, Point z, Color clr){
      color = clr;
      a = x;
      b = y;
      c = z;
   }

   public void setColor(Color c){
      color = c;
   }
   public void setVertexA(Point p){
      a = p;
   }
   public void setVertexB(Point p){
      b = p;
   }
   public void setVertexC(Point p){
      c = p;
   }
   public void translate(Point p){
      a.setLocation(a.getX() + p.getX(), a.getY() + p.getY());
      b.setLocation(b.getX() + p.getX(), b.getY() + p.getY());
      c.setLocation(c.getX() + p.getX(), c.getY() + p.getY());
   }

   public Color getColor(){
      return color;
   }
   public Point getVertexA(){
      return a;
   }
   public Point getVertexB(){
      return b;
   }
   public Point getVertexC(){
      return c;
   }
   public double getArea(){
      return 0.0;
   }
   public double getPerimeter(){
      return 0.0;
   }
}
