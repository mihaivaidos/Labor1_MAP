import Aufgabe_1.UniversityNotes;

public class Main {
    public static void main(String[] args) {

        // Erste Aufgabe
        int[] noten = {29, 37, 38, 41, 84, 67, 93, 100};
        System.out.println("Nicht ausreichende Noten: " + UniversityNotes.nichtAusreichendeNoten(noten));
        System.out.println("Durchschnittswert: " + UniversityNotes.durchschnittsWert(noten));
        System.out.println("Abgerundete Noten: " + UniversityNotes.abgerundetenNoten(noten));
        System.out.println("Maximale abgerundete Note: " + UniversityNotes.maxabgerundeteNote(noten));

    }
}