package ba.unsa.etf.rpr;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){

        //String a = args[0];
        String a = "( 5 + ( 4 * ( sqrt ( 4 ) ) )";
        try{
            double b = ExpressionEvaulator.evaluate(a);
            System.out.println(b);
        }catch(RuntimeException e){
            System.out.println("Neispravan aritmeticki izraz!");
        }
    }
}
