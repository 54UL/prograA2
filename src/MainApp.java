import java.util.*;

public class MainApp
{
   public static List<int> GenerateHashCode(String[] NamesStrings)
   {
    int hashcode=0;
    List<int>  hashTable= new List<int>();
        for(int i =0;i <NamesStrings.length() ;i++)
        {
            for(int is; i< NamesStrings[i].length; i++)
            {
            hashcode +=(char)is[i];
            }
            hashTable.add(hascode);
        }
     return hashTable;
   }

   public static void IncrementAge(int []value)
   {
       value[0]++;
   }
   
   public static void QuePasa( Persona ref)
   {
       //ref = new Persona();
       ref.setName("juanito");
   }

   public static void main(String[] args)
   {
       int test = 6;
       int []arreglo;
       arreglo = new int[5];
 
       Random rnd = new Random();

        for(int i = 0; i< arreglo.length; i++)
        {
        arreglo[i] = rnd.nextInt();
        System.out.println(arreglo[i]);
       }

       System.out.println("personas");
       Persona [] personaArreglo = new Persona[10];
       
       personaArreglo[0] = new Persona("Saul",20,"aceves","montes");
       personaArreglo[1] = new Persona("pablito",13,"paramo","deoca");
       
       
       QuePasa(personaArreglo[0]);
     
    for(int i = 0; i< 2; i++)
    {

    System.out.println(personaArreglo[i].getName());
    personaArreglo[i].setName(personaArreglo[i].getName()+"alterado:"+i);
    }

    

     int []testArray = new int[5];
     testArray[0]=666;

    MainApp.IncrementAge(testArray);
    System.out.print(testArray[0]);
   }
}