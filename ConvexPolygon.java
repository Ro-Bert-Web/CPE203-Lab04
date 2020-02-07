import java.awt.Color;
import java.awt.Point;
import java.util.List;
import java.util.ArrayList;

public class ConvexPolygon implements Shape{
   private Color color;
   private Point points[];

   public ConvexPolygon(Point p[], Color c){
      color = c;
      points = p;
   }

   public void setColor(Color c){
      color = c;
   }
   public void translate(Point p){
      for(int i = 0; i < points.length; i++){
         points[i].setLocation(points[i].getX() + p.getX(), points[i].getY() + p.getY());
      }
   }

   public Color getColor(){
      return color;
   }
   public Point getVertex(int i){
      return points[i];
   }
   public double getArea(){
      double area = 0.0;
      Point a = points[0];
      for(int i = 1; i < points.length - 1; i++){
         Point b = points[i];
         Point c = points[i + 1];
         Triangle tri = new Triangle(a, b, c, color);
         area += tri.getArea();
      }
      return area;
   }
   public double getPerimeter(){
      double perimeter = 0.0;
      for(int i = 0; i < points.length; i++){
         Point p1 = points[i];
         Point p2 = points[(i + 1) % points.length];
         perimeter += Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
      }
      return perimeter;
   }
}
