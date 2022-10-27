import java.util.ArrayList;

public class RandomScoreGenerator {
    public static String[] notes = {"C ", "D ", "E ", "F# ", "G ", "A ", "B "};
    public static String[] rhythms =
            {"tresillo rhythm (3 + 3 + 2)",
            "galloping rhythm (2 + 1 + 1)",
            "syncopated rhythm (1 + (2)*)",
            "dotted quarter note rhythm", "dotted half note rhythm",
            "quarter note rhythm", "half note rhythm", "whole note rhythm",
            "held for as long as you can",
            "7/8 rhythm (3 + 2 + 2)", "7/8 rhythm (3 + 3 + 1)", "5/8 rhythm (3 + 2)",
            "triplet rhythm trip(2)",
            "tumbao rhythm (3 + (3 + 5)*)"};


    public static String[] range = {"in a LOW register", "in a MIDDLE register", "in a HIGH register"};

    public static int randomNumber(int min, int max) {
        return ((int) (Math.random() * (max - min + 1) + min));
    }

    public static String randomArrayEntry(String[] array) {
        return array[randomNumber(0, array.length - 1)];
    }

    public static boolean isElem(String note, String[] notes) {
        for (String i : notes) {
            if (note.equals(i)) {
                return true;
            }
        }
        return false;
    }

    public static String randomNotes() {
        int counter = 0;
        int total = randomNumber(1, 4);
        String thisNote;
        String finalNotes = " ";
        String[] noteCollection = new String[total + 1];
        while (counter <= total) {
            thisNote = randomArrayEntry(notes);
            if (!(isElem(thisNote, noteCollection))) {
                noteCollection[counter] = thisNote;
                counter += 1;
            }
        }
        for (String i : noteCollection) {
            finalNotes += i;
        }
        return finalNotes;
    }


    public static void main(String[] args) {
        System.out.println("Play any of the following notes: (" + randomNotes() + ")");
        System.out.println(randomArrayEntry(range));
        System.out.println("while playing a " + randomArrayEntry(rhythms));
    }
}

