import java.util.ArrayList;
import java.util.List;
import Models.Persona;
import DataStructures.HashTable;

public class MainApp
{

   public static void main(String[] args)
   {     
       HashTable tabla = new HashTable(13);

       //Algoritmo, Menu: introducir, buscar
       //Introducir: agregar al hash map el elemento actual

       List  personaArreglo = new ArrayList();
       personaArreglo.add(new Persona("Saul",20,"aceves","montes"));
       personaArreglo.add(new Persona("Saul",20,"aceves","montes"));
       personaArreglo.add(new Persona("Saul",20,"aceves","montes"));
       personaArreglo.add(new Persona("charly",20,"1","2"));
       personaArreglo.add(new Persona("jose",20,"2","3"));
       personaArreglo.add(new Persona("diego",20,"3","4"));
       personaArreglo.add(new Persona("tijuanga",20,"4","5"));
     
      //para cada elemento de la lista de personas, insertarlo en la tabla
       personaArreglo.forEach((i)->
       {
        tabla.Insert(i,((Persona)i).getName());
       });

       //Buscamos los elementos
       List resultados = tabla.find("Saul");

    
       resultados.forEach((i)->
       {
           System.out.println("resultados:"+((Persona)i).getName());
       });

   }
}