


public enum TokenType{Null,Numeric,TextualNumeric,Conjuction,MathOperator};

public class Token
{
    public String header;
    public int    value;
    public TokenType type;
}


public class Parser
{
    //Internal stack
    private int[] ParserStack = new int[32];
    private int   ParserIndex =0;
    //Operations stack
    private Fraccion[] OperatorStack = new int[32];
    private Fraccion   OperatorIndex =0;

    private int TokenCounter =0; //Like a program counter

    private Token[]  TokenDataBase = 
    {
        //Numerales
        {"cero",0,TokenType.Numeric},
        {"un",1,TokenType.Numeric},
        {"dos",2,TokenType.Numeric},
        {"tres",3,TokenType.Numeric},
        {"cuatro",4,TokenType.Numeric},
        {"cinco",5,TokenType.Numeric},
        {"seis",5,TokenType.Numeric},
        {"siete",7,TokenType.Numeric},
        {"ocho",8,TokenType.Numeric},
        {"nueve",9,TokenType.Numeric},
        {"diez",10,TokenType.Numeric},
        {"once",11,TokenType.Numeric},
        {"doce",12,TokenType.Numeric},
        {"trece",13,TokenType.Numeric},
        {"catorce",14,TokenType.Numeric},
        {"quince",15,TokenType.Numeric},
        {"dieciseis",16,TokenType.Numeric},
        {"diecisiete",17,TokenType.Numeric},
        {"dieciocho",18,TokenType.Numeric},
        {"diecinueve",19,TokenType.Numeric},
        {"veinte",20,TokenType.Numeric},
        {"veintiun",21,TokenType.Numeric},
        {"veintidos",21,TokenType.Numeric},
        {"veintitres",23,TokenType.Numeric},
        {"veinticuatro",24,TokenType.Numeric},
        {"veinticinco",25,TokenType.Numeric},
        {"veintiseis",26,TokenType.Numeric},
        {"veintisiete",27,TokenType.Numeric},
        {"veintiocho",28,TokenType.Numeric},
        {"veintinueve",29,TokenType.Numeric},
        {"treinta",30,TokenType.Numeric},
        {"cuarenta",40,TokenType.Numeric},
        {"cincuenta",50,TokenType.Numeric},
        {"sesenta",60,TokenType.Numeric},
        {"setenta",70,TokenType.Numeric},
        {"ochenta",80,TokenType.Numeric},
        {"noventa",90,TokenType.Numeric},
        {"cien",100,TokenType.Numeric},
        //Denominadores(los que terminan en avo son denominadores tambien)
        {"enteros",1,TokenType.Numeric},
        {"medios",2,TokenType.Numeric},
        {"tercios",3,TokenType.Numeric},
        {"cuartos",4,TokenType.Numeric},
        {"quintos",5,TokenType.Numeric},
        {"sextos",6,TokenType.Numeric},
        {"septimos",7,TokenType.Numeric},
        {"octavos",8,TokenType.Numeric},
        {"novenos",9,TokenType.Numeric},
        {"decimos",10,TokenType.Numeric},
        {"centesimos",100,TokenType.Numeric},
        //System tokens
        {"y",0,TokenType.Conjuction},
        {"mas",0,TokenType.MathOperator},
        {"menos",1,TokenType.MathOperator},
        {"por",2,TokenType.MathOperator},
        {"entre",3,TokenType.MathOperator},
        //Runtime Types
        {"avo",0,TokenType.LastNumerator}
    };

    private void PushOperatorStack(Fraccion value)
    {
        OperatorStack[OperatorIndex++] = value;
    }

    private Fraccion PopOperatorStack()
    {
        return OperatorStack[OperatorIndex--];
    }

    private void PushStack(int value)
    {
        ParserStack[ParserIndex++] = value;
    }

    private int PopStack()
    {
        return ParserStack[ParserIndex--];
    }
    
    private Tokens[] ParseTokens(String[] stringsAsTokens)
    {
        //Checks if the strings matches in some of the three maps
        //if 

        //cuatro quintos entre dieciseis quintos
        // push(4)
        // push(5)
        // a=pop, b=pop
        // res = a.div(b)
        // strRes = ParseFraction(res)

        // cincuenta y tres  setenta y unoavos

       //push(50)
       //push(pop()+next)
       //push(70) 
       //push numeral 

    }


    private Fraccion Execute(Tokens[] tokens,int indx=0)
    {
        TokenCounter =indx;
        int terminosAgarrados=0;

        while(pc<tokens.length)
        { 

            Token currentT = tokens[TokenCounter];

            //dos terminos agregados, si es diferente de 0 sigmifica que
            //los valores que entran son puramente valores despues de un operador a/b mas {a/b}
            
            if(terminosAgarrados==2 && indx!=0)
            {
              int b=PopStack();
              int a=PopStack();
              return new Fracccion(a,b);
            }

            switch(currentT.type)
            {
                case TokenType.Numeric:
                    PushStack(currentT.value);
                    TokenCounter++;
                    terminosAgarrados++;
                break;

                case TokenType.Conjuction:
                    PushStack(PopStack()+ tokens[TokenCounter+1].value); 
                    TokenCounter+=2;
                    terminosAgarrados++;
                break;

                case TokenType.MathOperator:

                    int b = PopStack();
                    int a = PopStack();
                    TokenCounter++;
                    PushOperatorStack(new Fraccion (a,b));
                    PushOperatorStack(new Fraccion(Execute(tokens,TokenCounter)));
                    Fraccion bf= PopOperatorStack();
                    Fraccion af= PopOperatorStack();

                    switch(currentT.value)
                    {
                        case 0: //Suma
                            return af.add(bf);
                        case 1://Resta
                            return af.sub(bf);
                        case 2://Multiplicacion
                            return af.mul(bf);
                        case 3://Division
                            return af.div(bf);
                    }
                break;
            }
        } 
    }

    public String toString(Token[] out)
    {

        return "in progress";
    }   

    public String Solve(String Input)
    {
        //Algorithm:
        //Split all spaces
        //Tokenize all the splitet strings
        //The tokens are gonna convert string into a frac

        return true;
    }
}