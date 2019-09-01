import java.util.*;

public class MainApp2
{

   public static List<int> GenerateHashCode(String[] NamesStrings)
   {
    int hashcode=0;
    List<int>  hashTable = new List<int>();
        for(int i =0;i <NamesStrings.length ;i++)
        {
            for(int is; i< NamesStrings[i].length; i++)
            {
             hashcode +=(int)is[i];
            }
            hashTable.add(hashcode);
        }
     return hashTable;
   }

   
   public static void main(String[] args)
   {     
       Persona [] personaArreglo = new Persona[10];
       personaArreglo[0] = new Persona("Saul",20,"aceves","montes");
       personaArreglo[1] = new Persona("pablito",13,"paramo","deoca");    
   }
}