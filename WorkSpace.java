import java.awt.Color;
import java.awt.Point;
import java.util.List;
import java.util.LinkedList;

public class WorkSpace{
   private List<Shape> shapes;

   public WorkSpace(){
      shapes = new LinkedList<>();
   }

   public void add(Shape shape){
      shapes.add(shape);
   }

   public Shape get(int i){
      return shapes.get(i);
   }
   public int size(){
      return shapes.size();
   }
   public List<Circle> getCircles(){
      List<Circle> rslt = new LinkedList<>();
      for(int i = 0; i < shapes.size(); i++){
         if(shapes.get(i) instanceof Circle){
            rslt.add((Circle)shapes.get(i));
         }
      }
      return rslt;
   }
   public List<Rectangle> getRectangles(){
      List<Rectangle> rslt = new LinkedList<>();
      for(int i = 0; i < shapes.size(); i++){
         if(shapes.get(i) instanceof Rectangle){
            rslt.add((Rectangle)shapes.get(i));
         }
      }
      return rslt;
   }
   public List<Triangle> getTriangles(){
      List<Triangle> rslt = new LinkedList<>();
      for(int i = 0; i < shapes.size(); i++){
         if(shapes.get(i) instanceof Triangle){
            rslt.add((Triangle)shapes.get(i));
         }
      }
      return rslt;
   }
   public List<ConvexPolygon> getConvexPolygons(){
      List<ConvexPolygon> rslt = new LinkedList<>();
      for(int i = 0; i < shapes.size(); i++){
         if(shapes.get(i) instanceof ConvexPolygon){
            rslt.add((ConvexPolygon)shapes.get(i));
         }
      }
      return rslt;
   }
   public List<Shape> getShapesByColor(Color c){
      List<Shape> rslt = new LinkedList<>();
      for(int i = 0; i < shapes.size(); i++){
         if(shapes.get(i).getColor() == c){
            rslt.add(shapes.get(i));
         }
      }
      return rslt;
   }
   public double getAreaOfAllShapes(){
      double rslt = 0.0;
      for(int i = 0; i < shapes.size(); i++){
         rslt += shapes.get(i).getArea();
      }
      return rslt;
   }
   public double getPerimeterOfAllShapes(){
      double rslt = 0.0;
      for(int i = 0; i < shapes.size(); i++){
         rslt += shapes.get(i).getPerimeter();
      }
      return rslt;
   }
}
