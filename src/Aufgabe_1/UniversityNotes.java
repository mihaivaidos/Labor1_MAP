package Aufgabe_1;

import java.util.ArrayList;
import java.util.List;

public class UniversityNotes {

    public static List<Integer> nichtAusreichendeNoten(int []noten) {
        List<Integer> nichtAusreichend = new ArrayList<>();
        for(int note : noten) {
            if(note < 38) {
                nichtAusreichend.add(note);
            }
        }
        return nichtAusreichend;
    }

    public static double durchschnittsWert(int []noten) {
        int summe = 0;
        for(int note : noten) {
            summe += note;
        }
        return Math.round((double) summe / noten.length * 100.0) / 100.0;
    }

}
