package Composicion;

public class Cilindro
{
    private double Altura;
    private Circulo base;

    public Cilindro()
    {
        this.Altura = 0;
       this.base = new Circulo();
    }

    public Cilindro(double radius,double altura)
    {
        this.Altura = altura;
        base = new Circulo(radius);
    }

    public Cilindro(Circulo base,double altura)
    {
        this.base = base;
        this.Altura = altura;
    }
}