
public class Cuadrado implements IFigura
{
    private double lados;
    //public  double other =666666;
    public Cuadrado()
    {
        
    }

    public Cuadrado(double l)
    {
        lados =l;
    }

    void setLado(double l)
    {
        lados = l;
    }

    double getLado()
    {
        return lados;
    }
   @Override
   public double Area()
    {
        return lados*lados;
    }
}