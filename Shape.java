import java.awt.Color;
import java.awt.Point;

interface Shape{
   public Color getColor();
   public void setColor(Color c);
   public double getArea();
   public double getPerimeter();
   public void translate(Point p);
}
