import Aufgabe_1.UniversityNotes;
import Aufgabe_2.ArrayNumbers;
import Aufgabe_3.BigNumberOperations;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Erste Aufgabe
        System.out.println("~Erste Aufgabe~");

        int[] noten = {29, 37, 38, 41, 84, 67, 93, 100};

        System.out.println("Nicht ausreichende Noten: " + UniversityNotes.nichtAusreichendeNoten(noten));
        System.out.println("Durchschnittswert: " + UniversityNotes.durchschnittsWert(noten));
        System.out.println("Abgerundete Noten: " + UniversityNotes.abgerundetenNoten(noten));
        System.out.println("Maximale abgerundete Note: " + UniversityNotes.maxabgerundeteNote(noten));

        System.out.println("\n");

        // Zweite Aufgabe
        System.out.println("~Zweite Aufgabe~");

        int []numbers = {4, 8, 3, 10, 17};

        System.out.println("Maximale Zahl: " + ArrayNumbers.maxNumber(numbers));
        System.out.println("Minimale Zahl: " + ArrayNumbers.minNumber(numbers));
        System.out.println("Maximale Summe von n-1 Zahlen: " + ArrayNumbers.maxSum(numbers));
        System.out.println("Minimale Summe von n-1 Zahlen: " + ArrayNumbers.minSum(numbers));

        System.out.println("\n");

        // Dritte Aufgabe
        System.out.println("~Dritte Aufgabe~");

        int[] num1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] num2 = {8, 7, 0, 0, 0, 0, 0, 0, 0};

        int[] sum = BigNumberOperations.add(num1, num2);
        System.out.println("Summe: " + Arrays.toString(sum));

        int[] num3 = {8, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] num4 = {5, 4, 0, 0, 0, 0, 0, 0, 0};

        int[] diff = BigNumberOperations.subtract(num3, num4);
        System.out.println("Differenz: " + Arrays.toString(diff));
    }

}