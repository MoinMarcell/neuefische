package methoden;

/*
1. Schreibe eine Methode, die zwei int Parameter entgegennimmt und die Summe dieser zurückgibt
2. Schreibe eine 2. Methode, die zwei int Parameter entgegennimmt und einen String “Summe : <int-parameter>” zurückgibt.
3. Führe beide Methoden in der main-Methode nacheinander aus und gib den String auf der Konsole aus
 */

/*
1. Schreibe eine weitere Methode, die zwei int Parameter entgegennimmt und prüft, ob einer der int Werte größer als 100 ist.
2. Schaue dir den Java Scanner an.
3. Schreibe eine Methode, die über den Java Scanner zwei int Werte entgegennimmt und in der Konsole die Summer beider Werte ausgibt
 */

import java.util.Scanner;

public class MethodenMain {
    public static void main(String[] args) {
        int a = 22;
        int b = 10;
        System.out.println(sum(a, b));

        Scanner sc = new Scanner(System.in);
        System.out.println("Erste Zahl eingeben: ");
        int x = sc.nextInt();
        System.out.println("Zweite Zahl eingeben: ");
        int y = sc.nextInt();

        System.out.println(x + " + " + y + " = " + (x+y));
        if(!greater100(x, y)){
            System.out.println("Keine der Zahlen ist größer als 0 :(");
        }else {
            System.out.println("Eine der Zahlen ist größer ist größer als 0 :)");
        }
        sc.close();
    }

    public static int add(int a, int b){
        return a + b;
    }

    public static String sum(int a, int b){
        return "Summe: " + add(a, b);
    }

    public static boolean greater100(int a, int b){
        return a > 100 || (b > 100 ? true : false);
    }
}
