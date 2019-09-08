


public enum TokenType{Null,ShortNumeric,LongNumeric,Conjuction,MathOperator};

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
        {"cero",0,TokenType.ShortNumeric},
        {"un",1,TokenType.ShortNumeric},
        {"dos",2,TokenType.ShortNumeric},
        {"tres",3,TokenType.ShortNumeric},
        {"cuatro",4,TokenType.ShortNumeric},
        {"cinco",5,TokenType.ShortNumeric},
        {"seis",5,TokenType.ShortNumeric},
        {"siete",7,TokenType.ShortNumeric},
        {"ocho",8,TokenType.ShortNumeric},
        {"nueve",9,TokenType.ShortNumeric},
        {"diez",10,TokenType.ShortNumeric},
        {"once",11,TokenType.ShortNumeric},
        {"doce",12,TokenType.ShortNumeric},
        {"trece",13,TokenType.ShortNumeric},
        {"catorce",14,TokenType.ShortNumeric},
        {"quince",15,TokenType.ShortNumeric},
        {"dieciseis",16,TokenType.ShortNumeric},
        {"diecisiete",17,TokenType.ShortNumeric},
        {"dieciocho",18,TokenType.ShortNumeric},
        {"diecinueve",19,TokenType.ShortNumeric},
        {"veinte",20,TokenType.ShortNumeric},
        {"veintiun",21,TokenType.ShortNumeric},
        {"veintidos",21,TokenType.ShortNumeric},
        {"veintitres",23,TokenType.ShortNumeric},
        {"veinticuatro",24,TokenType.ShortNumeric},
        {"veinticinco",25,TokenType.ShortNumeric},
        {"veintiseis",26,TokenType.ShortNumeric},
        {"veintisiete",27,TokenType.ShortNumeric},
        {"veintiocho",28,TokenType.ShortNumeric},
        {"veintinueve",29,TokenType.ShortNumeric},
        {"treinta",30,TokenType.ShortNumeric},
        {"cuarenta",40,TokenType.ShortNumeric},
        {"cincuenta",50,TokenType.ShortNumeric},
        {"sesenta",60,TokenType.ShortNumeric},
        {"setenta",70,TokenType.ShortNumeric},
        {"ochenta",80,TokenType.ShortNumeric},
        {"noventa",90,TokenType.ShortNumeric},
        {"cien",100,TokenType.ShortNumeric},
        //Denominadores(los que terminan en avo son denominadores tambien)
        {"enteros",1,TokenType.LongNumeric},
        {"medios",2,TokenType.LongNumeric},
        {"tercios",3,TokenType.LongNumeric},
        {"cuartos",4,TokenType.LongNumeric},
        {"quintos",5,TokenType.LongNumeric},
        {"sextos",6,TokenType.LongNumeric},
        {"septimos",7,TokenType.LongNumeric},
        {"octavos",8,TokenType.LongNumeric},
        {"novenos",9,TokenType.LongNumeric},
        {"decimos",10,TokenType.LongNumeric},
        {"centesimos",100,TokenType.LongNumeric},
        //System tokens
        {"y",0,TokenType.Conjuction},
        {"mas",0,TokenType.MathOperator},
        {"menos",1,TokenType.MathOperator},
        {"por",2,TokenType.MathOperator},
        {"entre",3,TokenType.MathOperator},
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
    
    private Tokens[] ParseStrings(String[] stringsAsTokens)
    {
        //Checks if the strings matches in some of the three maps
        //if has a match in the short numeric, give them the related token.
    }

    private Fraccion ParseTokenArray(Tokens[] tokens)
    {
        TokenCounter =0;

        while(pc<tokens.length)
        { 
            Token currentT = tokens[TokenCounter];
            switch(currentT.type)
            {
                case TokenType.ShortNumeric:
                PushStack(currentT.value);
                TokenCounter++;
                break;
                
                case TokenType.LongNumeric:
                PushStack(currentT.value);
                TokenCounter++;
                break;

                case TokenType.Conjuction:
                PushStack(PopStack()+ tokens[TokenCounter+1].value); 
                TokenCounter+=2;
                break;

                case TokenType.MathOperator:
                    switch(currentT.value)
                    {
                        case 0: //Suma
                        break;

                        case 1://Resta
                        break;

                        case 2://Multiplicacion
                        break;

                        case 3://Division
                        break;
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