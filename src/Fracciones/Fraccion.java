



public class Fraccion {
    private int num, den;
    private boolean divCero = false;
    private String stringVal="";

    stringNum = new String[]{"cero","un","dos","tres","cuatro","cinco","seis",
    "siete","ocho","nueve","diez","once","doce",
    "trece","catorce","quince","dieciseis","diecisiete","dieciocho","diecinueve","veinte",
    "veintiun","veintidos","veintitres","veinticuatro","veinticinco","veintiseis","veintisiete",
    "veintiocho","veintinueve","treinta","cuarenta","cincuenta","sesenta","setenta",
    "ochenta","noventa","cien"};
    intNum = new int[]{0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,
    22,23,24,25,26,27,28,29,30,40,50,60,70,80,90,100};
    stringDen = new String[]{"enteros","medios","tercios","cuartos","quintos","sextos","septimos","octavos",
    "novenos","decimos","centesimos"};
    intDen = new int[]{1,2,3,4,5,6,7,8,9,10,100};
    stringOp = new String[]{"mas", "menos", "por", "entre"};

    
    public Fraccion(){
        num = 1;
        den = 1;
    }
    
    public Fraccion(int num, int den){
        if(den != 0){
            this.num = num;
            this.den = den;
        }else{
            System.out.println("error");
            divCero = true;
        }
    }
    
    public Fraccion suma(Fraccion f1){
        int rNum = (den != f1.den)?num * f1.den + f1.num * den : num + f1.num;
        int rDen = (den != f1.den)?den * f1.den : den;
        return new Fraccion(rNum, rDen);
    }
    
    public Fraccion resta(Fraccion f1){
        int rNum = (den != f1.den)?num * f1.den - f1.num * den : num - f1.num;
        int rDen = (den != f1.den)?den * f1.den : den;
        return new Fraccion(rNum, rDen);
    }
    
    public Fraccion mult(Fraccion f1){
        int rNum = num * f1.num;
        int rDen = den * f1.den;
        return new Fraccion(rNum, rDen);
    }
    
    public Fraccion div(Fraccion f1){
        int rNum = num * f1.den;
        int rDen = den * f1.num;
        return new Fraccion(rNum, rDen);
    }
    
    @Override
    public String toString(){
        return num + " / " + den;
    }
}