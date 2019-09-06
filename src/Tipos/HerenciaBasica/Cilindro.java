package HerenciaBasica;

public class Cilindro extends Circulo
{
    public Cilindro(){}
    public Cilindro(double r,double h){setRadius(r); heigth =h;} 

    public double getVolumen()
    {
     return   heigth*6.2832 * getRadius()* super.getRadius() * 2;
    }
    
    @Override
    public double getArea()
    {
        return 3.0D;
    }
 
    private double heigth;
}