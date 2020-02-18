import java.util.HashMap;
import java.util.List;

public class HashMapDirectory implements Directory {
    static HashMap<String, String> extensionNameHashMap = new HashMap<String, String>();
    static HashMap<String, String> extensionInitialsHashMap = new HashMap<String, String>();
    @Override
    public void insertEntry(Entry entry) {
        extensionNameHashMap.put(entry.TelephoneExtension, entry.Surname);
        extensionInitialsHashMap.put(entry.TelephoneExtension, entry.Initials);
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
