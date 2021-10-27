import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class UniqueDupes {
    String line;
    HashSet<String> uniques;
    HashSet<String> dupes;

    public UniqueDupes(String line) {
        this.line = line;
        ArrayList<String> list =  new ArrayList<String>(Arrays.asList(line.split(" ")));
        uniques = new HashSet<String>();
        dupes = new HashSet<String>();
        for (String elem: list) {
            if (!uniques.add(elem)) {
                dupes.add(elem);
            }
        }
    }

    public String getInitialInput() {
        return line;
    }
    public HashSet getDupes() {
        return dupes;
    }
    public HashSet getUniques() {
        return uniques;
    }

    public String toString() {
        return "Original List : " + line + "\nUniques : " + uniques + "\nDupes : " + dupes + "\n";
    }
}
