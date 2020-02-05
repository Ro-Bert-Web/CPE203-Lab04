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
      return 0.0;
   }
   public double getPerimeter(){
      return 0.0;
   }
}
