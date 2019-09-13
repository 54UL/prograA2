package Interface;

public class Circulo implements Figura
{
   private double radius;

   Circulo(double r)
   {
    radius = r;
   }
 
   void setRadius(double r)
   {
       radius=r;
   }

   double getRadius()
   {
       return radius;
   }
}