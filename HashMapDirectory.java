import java.util.HashMap;
import java.util.List;

public class HashMapDirectory implements Directory {
    static HashMap<String, Entry> extensionEntry = new HashMap<String, Entry>();
    static HashMap<String, Entry> surnameEntry = new HashMap<String, Entry>();

    @Override
    public void insertEntry(Entry entry) {
        extensionEntry.put(entry.TelephoneExtension, entry);
        surnameEntry.put(entry.Surname, entry);
    }

    @Override
    public void deleteEntryUsingName(String surname) {
        surnameEntry.remove(surname);
    }

    @Override
    public void deleteEntryUsingExtension(String number) {
        extensionEntry.remove(number);
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
