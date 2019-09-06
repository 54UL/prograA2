import Models.Persona;
import DataStructures.HashTable;
import java.util.*;

public class MainApp
{
   
    public static void findElement(HashTable tbl,Scanner in)
    {
        int findOption=0;
        int countingPp=0;
        List resultados = tbl.find(in.getNext());
        System.out.println("chose a record by index");
        resultados.forEach((e)->
        {
            System.out.println("indx:"+countingPp+" pp:"+e.getName()+"  "+e.getAp());
            countingPp++;
        }); 
         System.out.println("select one to show info");
         findOption = entrada.getNextInt();
          
         if(findOption>=resultados.length() || findOption <= 0)
          System.out.println("check yourself m8");
         else
        {
         Persona findedPp = resultados.get(findOption);
           System.out.println("indx:"+countingPp+" pp:"
        +findedPp.getName()+"  "+findedPp.getAp()+"  "+findedPp.getAm()+" age: "+findedPp.getEdad());
        }   
    }

   public static void main(String[] args)
   {     
       HashTable tabla = new HashTable(13);
       Scanner   entrada = new Scanner(System.in);
       boolean running = true;
       while(running)
       {
           System.out.println("0: add, 1: find , 2: quit");
           int opcion  = entrada.getNextInt();
           switch(opcion)
           {
               case 0:
                tabla.add(new Persona(entrada));
               break;
               case 1:
                findElement(tabla,entrada);
               break;
               case 2:
               running=false;
               break;
               default:
               Sytem.out.println("something went wrong, check yourself");
           }
       }
   }
}