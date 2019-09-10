package HerenciaBasica;

public class Cilindro extends Circulo
{
    public Cilindro(){
        super(0);
    }
    public Cilindro(double r,double h)
    {
        super(r);
        heigth =h;
    } 

    public double getVolumen()
    {
     return   heigth*6.2832 * getRadius()* super.getRadius() * 2;
    }
    
    @Override
    public double getArea()
    {
        return getRadius()*3.141516;
    }
 
    private double heigth;
}