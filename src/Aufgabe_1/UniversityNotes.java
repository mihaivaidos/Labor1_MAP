package Aufgabe_1;

import java.util.ArrayList;
import java.util.List;

public class UniversityNotes {

    public static List<Integer> nichtAusreichendeNoten(List<Integer> noten) {
        List<Integer> nichtAusreichend = new ArrayList<>();
        for(int note : noten) {
            if(note < 40) {
                nichtAusreichend.add(note);
            }
        }
        return nichtAusreichend;
    }

    public static double durchschnittsWert(List<Integer> noten) {
        int summe = 0;
        for(int note : noten) {
            summe += note;
        }
        return Math.round((double) summe / noten.size() * 100.0) / 100.0;
    }

    public static List<Integer> abgerundetenNoten(List<Integer> noten) {
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

    public static int maxabgerundeteNote(List<Integer> noten) {
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
