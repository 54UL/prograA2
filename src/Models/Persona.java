package Models;


public class Persona
{
    public Persona()
    {


    }

    public Persona(String name,int edad,String ap,String am)
    {
        nombre = name;
        this.edad = edad;
        this.am = am;
        this.ap = ap;
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