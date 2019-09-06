package HerenciaBasica;

public class Circulo
{
    public Circulo(){}
    public Circulo(double r){radius = r;} 

    public void setRadius(double r)
    {
        radius = r;
    }
    public double getRadius()
    {
        return radius;
    }
    public double getArea()
    {
        return radius * radius;
    }
    private double radius;
}