import java.util.ArrayList;
import java.util.List;

public class ArrayListDirectory implements Directory{
    private ArrayList<Entry> entryListDirectory = new ArrayList<Entry>();
    @Override
    public void insertEntry(Entry entry) {
        entryListDirectory.add(entry);
    }

    @Override
    public void deleteEntryUsingName(String surname) {
        int i;
        for(i=0; i<entryListDirectory.size(); i++){
            if(entryListDirectory.get(i).Surname.equals(surname)){
                break;
            }
        }
        entryListDirectory.remove(i);
    }

    @Override
    public void deleteEntryUsingExtension(String number) {
        int i;
        for(i=0; i<entryListDirectory.size(); i++){
            if(entryListDirectory.get(i).TelephoneExtension.equals(number)){
                break;
            }
        }
        entryListDirectory.remove(i);
    }

    @Override
    public void updateExtensionUsingName(String surname, String newNumber) {
        for(int i=0; i<entryListDirectory.size(); i++){
            if(entryListDirectory.get(i).Surname.equals(surname)){
                entryListDirectory.get(i).TelephoneExtension = newNumber;
            }
        }
    }

    @Override
    public String lookupExtension(String surname) {
        int i;
        for(i = 0; i < entryListDirectory.size(); i++) {
            if (entryListDirectory.get(i).Surname.equals(surname)) {
                break;
            }
        }
        return entryListDirectory.get(i).TelephoneExtension;
    }

    @Override
    public List<Entry> toArrayList() {
        return entryListDirectory;
    }
}
