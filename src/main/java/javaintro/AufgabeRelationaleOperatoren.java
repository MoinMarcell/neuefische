package javaintro;

/*
1. Führe Rechenoperationen mit int Werten aus (Addition, Subtraktion, Multiplikation, Division)
2. Prüfe die Werte auf: größer, kleiner, Gleichheit
3. Mache dasselbe mit float und double Werten.
 */

public class AufgabeRelationaleOperatoren {
    public static void main(String[] args) {
        int x = 22;
        int y = 10;
        int sum = x + y;
        int difference = x - y;
        int product = x * y;
        int quotient = x / y;

        if(difference <= sum){
            System.out.println(product);
        }
        if(quotient >= product){
            System.out.println(sum);
        }
    }
}
