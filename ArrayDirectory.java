import java.util.ArrayList;
import java.util.List;

public class ArrayDirectory implements Directory {
    static String[] entryDirectory = new String[0];

    @Override
    public void insertEntry(Entry entry) {
        for(int i=0; i<=entryDirectory.length; i++){
            if (entryDirectory[i] != null) {
                System.out.println("An array is full");
                boolean ArrayFull = true;
                break;
            } else {
                System.out.println("An array has an empty space");
                boolean ArrayFull = false;
            }
        }

    }

    @Override
    public void deleteEntryUsingName(String surname) {

    }

    @Override
    public void deleteEntryUsingExtension(String number) {

    }

    @Override
    public void updateExtensionUsingName(String surname, String newNumber) {

    }

    @Override
    public String lookupExtension(String surname) {
        return null;
    }

    @Override
    public List<Entry> toArrayList() {
        return null;
    }
}
