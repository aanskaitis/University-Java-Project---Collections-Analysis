import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class input {

    public static Directory FileRead(String csvFile, Directory directory) {

        BufferedReader br = null;
        String line = "";
        String csvSplitBy = ",";

        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                String[] entries = line.split(csvSplitBy);
                Entry newEntry = new Entry(entries[0], entries[1], entries[2]);
                directory.insertEntry(newEntry);

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return directory;

    }

}

