public class Personita
{
    public Personita()
    {

    }
  
    public Personita(String name,int edad,String ap)
    {
        nombre = name;
        this.edad = edad;
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
   
    public int getEdad()
    {

        return edad;
    }

    public void setName(String newName)
    {
        this.nombre = newName;
    }

    private String nombre,ap;
    private int edad;
}