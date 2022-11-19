package ba.unsa.etf.rpr;

/**
 * Klasa u kojoj se nalazi main
 */
public class App 
{
    /**
     * main metoda
     * @param args -niz stringova proslijeđen metodi
     */
    public static void main( String[] args ){
        String a = args[0];
        try{
            double b = ExpressionEvaluator.evaluate(a);
            System.out.println(b);
        }catch(RuntimeException e){
            System.out.println("Neispravan aritmeticki izraz!");
        }
    }
}
