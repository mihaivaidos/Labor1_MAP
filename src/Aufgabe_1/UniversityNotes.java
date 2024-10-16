package Aufgabe_1;

import java.util.ArrayList;
import java.util.List;

public class UniversityNotes {

    public static List<Integer> nichtAusreichendeNoten(int []noten) {
        List<Integer> nichtAusreichend = new ArrayList<>();
        for(int note : noten) {
            if(note < 40) {
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

    public static List<Integer> abgerundetenNoten(int []noten) {
        List<Integer> abgerundeten = new ArrayList<>();
        for(int note : noten) {
            if(note < 38) {
                abgerundeten.add(note);
            } else {
                int naechstesMultipel = (int) (Math.ceil((double) note / 5) * 5);
                if (naechstesMultipel - note < 3) {
                    abgerundeten.add(naechstesMultipel);
                } else {
                    abgerundeten.add(note);
                }
            }
        }
        return abgerundeten;
    }

    public static int maxabgerundeteNote(int []noten) {
        List<Integer> abgerundeten = abgerundetenNoten(noten);
        int max = abgerundeten.getFirst();
        for(int note : abgerundeten) {
            if(note > max) {
                max = note;
            }
        }
        return max;
    }
}
