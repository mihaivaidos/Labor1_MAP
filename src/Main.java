import Aufgabe_1.UniversityNotes;
import Aufgabe_2.ArrayNumbers;
import Aufgabe_3.BigNumberOperations;
import Aufgabe_4.ElectronicShop;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Aufgabe 1
        System.out.println("~Erste Aufgabe~");

        int[] noten = {29, 37, 38, 41, 84, 67, 93, 100};

        System.out.println("Nicht ausreichende Noten: " + UniversityNotes.nichtAusreichendeNoten(noten));
        System.out.println("Durchschnittswert: " + UniversityNotes.durchschnittsWert(noten));
        System.out.println("Abgerundete Noten: " + UniversityNotes.abgerundetenNoten(noten));
        System.out.println("Maximale abgerundete Note: " + UniversityNotes.maxabgerundeteNote(noten));

        System.out.println("\n");

        // Aufgabe 2
        System.out.println("~Zweite Aufgabe~");

        int []numbers = {4, 8, 3, 10, 17};

        System.out.println("Maximale Zahl: " + ArrayNumbers.maxNumber(numbers));
        System.out.println("Minimale Zahl: " + ArrayNumbers.minNumber(numbers));
        System.out.println("Maximale Summe von n-1 Zahlen: " + ArrayNumbers.maxSum(numbers));
        System.out.println("Minimale Summe von n-1 Zahlen: " + ArrayNumbers.minSum(numbers));

        System.out.println("\n");

        // Aufgabe 3
        System.out.println("~Dritte Aufgabe~");

        int[] num1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] num2 = {8, 7, 0, 0, 0, 0, 0, 0, 0};

        int[] sum = BigNumberOperations.add(num1, num2);
        System.out.println("Summe: " + Arrays.toString(sum));

        int[] num3 = {8, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] num4 = {5, 4, 0, 0, 0, 0, 0, 0, 0};

        int[] diff = BigNumberOperations.subtract(num3, num4);
        System.out.println("Differenz: " + Arrays.toString(diff));

        int[] num5 = {2, 3, 6, 0, 0, 0, 0, 0, 0};
        int digit = 2;

        int[] product = BigNumberOperations.multiply(num5, digit);
        System.out.println("Multiplikation: " + Arrays.toString(product));

        int[] division = BigNumberOperations.divide(num5, digit);
        System.out.println("Division: " + Arrays.toString(division));

        System.out.println("\n");

        // Aufgabe 4
        System.out.println("~Vierte Aufgabe~");

        int []keyboards = {40, 35, 70, 15, 45, 20, 50};
        int []usb = {20, 40, 50, 10, 43, 25};

        System.out.println("Die billigste Tastatur: " + ElectronicShop.cheapestKeyboard(keyboards));
        System.out.println("Der teuersten Gegenstand: " + ElectronicShop.expensiveDevice(keyboards, usb));

        int budget = 64;
        System.out.println("Das teuerste USB Laufwerk, das man kaufen kann: " + ElectronicShop.affordExpensiveUSB(usb, budget));
        System.out.println("Der maximale Wert, mit dem man sowohl einen USB Laufwerk als auch eine Tastatur kaufen können: " + ElectronicShop.spendMaxBoth(keyboards, usb, budget));
    }

}