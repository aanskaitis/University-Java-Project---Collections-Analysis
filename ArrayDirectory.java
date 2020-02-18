import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDirectory implements Directory {
    static Entry[] entryDirectory = new Entry[0];
    @Override
    public void insertEntry(Entry entry) {
        Entry[] newDirectory = new Entry[entryDirectory.length + 1];
        int i = 0;
        for(i=0; i<entryDirectory.length; i++){
        newDirectory[i] = entryDirectory[i];
        }
        newDirectory[i] = entry;
        entryDirectory = newDirectory;
    }

    @Override
    public void deleteEntryUsingName(String surname) {
        Entry[] newDirectory = new Entry[entryDirectory.length - 1];
        int i;
        for(i=0; i<newDirectory.length; i++){
            if(!entryDirectory[i].Surname.equals(surname)){
                newDirectory[i] = entryDirectory[i];
            } else {
                break;
            }
        }
        while(i<newDirectory.length){
            newDirectory[i] = entryDirectory[i+1];
            i++;
        }
        entryDirectory = newDirectory;
    }

    @Override
    public void deleteEntryUsingExtension(String number) {
        Entry[] newDirectory = new Entry[entryDirectory.length - 1];
        int i;
        for(i=0; i<newDirectory.length; i++){
            if(!entryDirectory[i].TelephoneExtension.equals(number)){
                newDirectory[i] = entryDirectory[i];
            } else {
                break;
            }
        }
        while(i<newDirectory.length){
            newDirectory[i] = entryDirectory[i+1];
            i++;
        }
        entryDirectory = newDirectory;

    }

    @Override
    public void updateExtensionUsingName(String surname, String newNumber) {
        Entry[] newDirectory = new Entry[entryDirectory.length];
        int i;
        for(i=0; i<newDirectory.length; i++){
            newDirectory[i] = entryDirectory[i];
            if(newDirectory[i].Surname.equals(surname)){
                newDirectory[i].TelephoneExtension = newNumber;
            }
        }
        entryDirectory = newDirectory;

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
