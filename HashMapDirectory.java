import java.util.ArrayList;
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
        extensionEntry.remove(surnameEntry.get(surname).TelephoneExtension);
    }

    @Override
    public void deleteEntryUsingExtension(String number) {
        extensionEntry.remove(number);
        surnameEntry.remove(extensionEntry.get(number).Surname);
    }

    @Override
    public void updateExtensionUsingName(String surname, String newNumber) {
        surnameEntry.get(surname).TelephoneExtension = newNumber;
        extensionEntry.remove(surnameEntry.get(surname).TelephoneExtension);
        Entry newEntry = new Entry(surname, surnameEntry.get(surname).Initials, newNumber);
        extensionEntry.put(newNumber, newEntry);
    }

    @Override
    public String lookupExtension(String surname) {
        return surnameEntry.get(surname).TelephoneExtension;
    }

    @Override
    public List<Entry> toArrayList() {
        return new ArrayList<>(extensionEntry.values());
    }
}
