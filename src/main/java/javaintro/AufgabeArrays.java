package javaintro;

/*
1. Lege einen Array der Länge drei, vom Typ int an.
2. Weise allen 'Stellen' des Arrays Werte zu.
3. Gebe die erste und die dritte Stelle des Arrays auf der Konsole aus.
4. Rechne die erste und die zweite Stelle des Arrays zusammen und gebe das Ergebnis auf der Konsole aus.
5. Gebe die Länge des Arrays auf der Konsole aus.
 */

import java.util.Random;

public class AufgabeArrays {
    public static void main(String[] args) {
        int[] arr = new int[3];
        Random random = new Random();
        int rand1 = random.nextInt(10, 100);
        int rand2 = random.nextInt(10, 100);
        int rand3 = random.nextInt(10, 100);
        arr[0] = rand1;
        arr[1] = rand2;
        arr[2] = rand3;
        int sum = arr[0] + arr[1];

        System.out.println("Erste Stelle: " + arr[0] + "\nDritte Stelle: " + arr[2]);
        System.out.println();
        System.out.println(arr[0] + " + " + arr[1] + " = " + sum);
        System.out.println();
        System.out.println("Länge des Arrays: " + arr.length);
    }
}
