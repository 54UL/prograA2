import java.util.Scanner;
import HerenciaBasica.*;
public class main
{
    public static void main(String[]args)
    {
        Scanner xdd= new Scanner(System.in);
        String value = xdd.next();
        System.out.println(value);
        Personita instance1 = new Personita();
       //Object ref = instance1;
        Cilindro xd = new Cilindro(30.0d,30.0d);
        xd.setRadius(40);
        System.out.println(xd.getArea());   
    }
}