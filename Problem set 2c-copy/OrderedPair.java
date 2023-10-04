
/**
 * Write a description of class OrderedPair here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OrderedPair
{
 double x;
 double y;
 
 public OrderedPair()
 {
     x = 0.0;
     y = 0.0;
 }
 
 public OrderedPair(double x, double y)
 {
     this.x = x;
     this.y = y;
 }
 
 public double getX()
 {
     return x;
 }
 
 public double getY()
 {
     return y;
 }
 
 public String toString()
 {
     return ""+ x + ", " + y;
 }
}