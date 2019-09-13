package Interface;
public class Cuadrado
{
    private double lados;

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
}