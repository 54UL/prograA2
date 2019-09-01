
public class Fraccion
{
    Fraccion(){}
    Fraccion(Fraccion other)
    {
        this.denominador = other.denominador;
        this.numerador = other.numerador;
    }

    Fraccion(int Num,int Den)
    {
        this.denominador = Den;
        this.numerador =Num;
    }


    public Fraccion sub(Fraccion B)
    {
         return new Fraccion((this.numerador *B.denominador) -(this.denominador *B.numerador),this.denominador * B.denominador );
    }
  
    public Fraccion add(Fraccion B)
    {
         return new Fraccion((this.numerador *B.denominador) +(this.denominador *B.numerador),this.denominador * B.denominador );
    }
    public Fraccion div(Fraccion B)
    {
         return new Fraccion();
    }
    public Fraccion mul(Fraccion B)
    {
        return new Fraccion();
    }
    


    public int denominador;
    public int numerador;
       
}