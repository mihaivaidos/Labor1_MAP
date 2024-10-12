import Aufgabe_1.UniversityNotes;
import Aufgabe_2.ArrayNumbers;

public class Main {
    public static void main(String[] args) {

        // Erste Aufgabe
        int[] noten = {29, 37, 38, 41, 84, 67, 93, 100};
        System.out.println("~Erste Aufgabe~");
        System.out.println("Nicht ausreichende Noten: " + UniversityNotes.nichtAusreichendeNoten(noten));
        System.out.println("Durchschnittswert: " + UniversityNotes.durchschnittsWert(noten));
        System.out.println("Abgerundete Noten: " + UniversityNotes.abgerundetenNoten(noten));
        System.out.println("Maximale abgerundete Note: " + UniversityNotes.maxabgerundeteNote(noten));

        System.out.println("\n");

        // Zweite Aufgabe
        int []numbers = {4, 8, 3, 10, 17};
        System.out.println("~Zweite Aufgabe~");
        System.out.println("Maximale Zahl: " + ArrayNumbers.maxNumber(numbers));
        System.out.println("Minimale Zahl: " + ArrayNumbers.minNumber(numbers));
        System.out.println("Maximale Summe von n-1 Zahlen: " + ArrayNumbers.maxSum(numbers));
        System.out.println("Minimale Summe von n-1 Zahlen: " + ArrayNumbers.minSum(numbers));

    }
}