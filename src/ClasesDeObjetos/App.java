

public class App
{

    App(){}



    public static void main(String[]args)
    {
  
     Fraccion xd = new Fraccion(3,1);
      Fraccion xdd = new Fraccion(4,4);

     Fraccion resutl = xd.add(xdd);
     
     System.out.println("numerador:"+resutl.numerador+"; denominador"+resutl.denominador);
    }


}