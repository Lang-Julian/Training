package Aufgabe3;
//https://training.bitelligence.net/java/exercise/modulo/divisibleByTwo

class Aufgabe3 {
    private static final int DIVISOR = 2;
    //Implementieren Sie eine Java-Methode mit dem Namen isDivisibleByTwo, die eine Ganzzahl als Parameter erwartet und überprüft, ob diese Ganzzahl durch 2 teilbar ist. Die Methode soll einen boolean-Wert zurückgeben, der true ist, wenn die Zahl durch 2 teilbar ist, andernfalls soll er false sein.
    //Zusätzlich soll ein Test erstellt werden welcher überprüft, ob die Implementierung auch fehlerfrei funktioniert.

    public static boolean isDivisibleByTwo(int number) {
        /**
         * A number divided by two, which doesn't result in a rest of zero
         * is divisable by two.2
         * @param number dividend
         * @return boolean is number diivisable by two
         */

        return number%DIVISOR==0;

    }
}