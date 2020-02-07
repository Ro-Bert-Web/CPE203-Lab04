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
      return Math.abs(
         ((a.getX() - b.getX()) * (a.getY()) -(c.getY())) - ((a.getY() - b.getY()) * (a.getX() - c.getX()))
      ) / 2;
   }
   public double getPerimeter(){
      return (
         Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2)) +
         Math.sqrt(Math.pow(b.getX() - c.getX(), 2) + Math.pow(b.getY() - c.getY(), 2)) +
         Math.sqrt(Math.pow(c.getX() - a.getX(), 2) + Math.pow(c.getY() - a.getY(), 2))
      );
   }
}
