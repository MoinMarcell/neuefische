package methoden;

/*
Schreibe eine Methode, die prüft, ob ein String

    1. länger als 20 Zeichen ist
    2. die Zeichenfolge "fancy" enthält
    3. Schreibe eine Methode die eine andere Methode von dir aufruft.
 */

public class AufgabeStrings {
    public static void main(String[] args) {
        String s = "sfergvFanCysdfwedsc34trdevf";
        System.out.println(checkFancy(s));
    }

    public static boolean checkFancy(String s){
        return s.toLowerCase().contains("fancy") && s.length() > 20;
    }
}
