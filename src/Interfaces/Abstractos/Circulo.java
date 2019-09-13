
public class Circulo implements IFigura
{
   private double radius;

   Circulo(double r)
   {
    radius = r;
   }
 
   @Override
   public double Area()
   {
       return 3.141616*radius*radius;
   } 

   void setRadius(double r)
   {
       radius=r;
   }

    public double getRadius()
   {
       return radius;
   }
}