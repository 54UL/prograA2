import Models.Persona;
import DataStructures.HashTable;
import java.util.Scanner;
import java.util.List;
public class MainApp {


    public static void findElement(HashTable tbl, Scanner in) {
        int findOption = 0;
        int countingPp = 0;

        List resultados = tbl.find(in.next());
        if(resultados.size()==0)
        {
            System.out.println("intente de nuevo pls");    
            return;
        }
        System.out.println("chose a record by index");
        
        for(int i =0; i< resultados.size(); i++)
        {
            Persona actualpp =(Persona) resultados.get(i);
            System.out.println("indx:" + i + " pp:" + actualpp.getName() + "  " + actualpp.getAp());
        }

        findOption = in.nextInt();
        System.out.println("select one to show info");

        if (findOption >= resultados.size() || findOption < 0)
            System.out.println("check yourself m8");
        else {
            Persona findedPp =(Persona) resultados.get(findOption);
            System.out.println("indx:" + countingPp + " pp:" + findedPp.getName() + "  " + findedPp.getAp() + "  "
                    + findedPp.getAm() + " age: " + findedPp.getEdad());
        }
    }

    public static void main(String[] args) {
        HashTable tabla = new HashTable(13);
        Scanner entrada = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("0: add, 1: find , 2: quit");
            int opcion = entrada.nextInt();
            switch (opcion) {
            case 0:
                Persona newPersona = new Persona(entrada);
                tabla.Insert(newPersona,newPersona.getName());
                break;
            case 1:
                findElement(tabla, entrada);
                break;
            case 2:
                running = false;
                break;
            default:
                System.out.println("something went wrong, check yourself");
            }
        }
    }
}