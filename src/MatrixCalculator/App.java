
public class App
{
    public static void main(String[]args)
    {
    Scanner entrada = new Scanner(System.in);
    boolean running = true;
    while (running) {
    System.out.println("0: add M , 1: sub M , 2: mul,3:inv M,4: det M,5:quit");
    int opcion = entrada.nextInt();
    switch (opcion) 
    {
            case 0:
                
                break;
            case 1:  
                break;
            case 2:
                break;
                case 3:
                break;
                case 4:
                break;
                case 5:
                running = false;
                break;
            default:
            System.out.println("something went wrong, check yourself");
    }
   }
  }
 }
}


