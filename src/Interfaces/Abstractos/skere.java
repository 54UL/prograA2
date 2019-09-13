
public class skere
{
    public static void main(String[]args)
    {
        IFigura xd = new Cuadrado(3);
        System.out.println(xd.Area());
        
        IFigura soyAninimoxdxd = new Figura()
        {
            @Override
            public double Area(){return 777;}
        };
    }
}