package Models;
import java.util.Scanner;

public class Persona
{
    public Persona()
    {

    }
    public Persona(Scanner in)
    {
        GetValuesFromInput(in);
    }

    public Persona(String name,int edad,String ap,String am)
    {
        nombre = name;
        this.edad = edad;
        this.am = am;
        this.ap = ap;
    }
    public void GetValuesFromInput(Scanner input)
    {
        System.out.println("introduce el nombre");
        nombre = input.next();  
        System.out.println("introduce el Apellido paterno");
        ap = input.next();
        System.out.println("introduce el Apellido materno");
        am = input.next();
        System.out.println("introduce la edad");
        edad = input.nextInt();
    }
    public String getName()
    {
    return nombre;
    }

    public String getAp()
    {
        return ap;
    }
    public String getAm()
    {

        return am;
    }
    public int getEdad()
    {

        return edad;
    }

    public void setName(String newName)
    {
        this.nombre = newName;
    }
    
    private String nombre,am,ap;
    private int edad;
}