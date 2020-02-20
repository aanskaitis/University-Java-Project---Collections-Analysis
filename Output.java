import java.awt.*;
import java.io.*;
import java.lang.System;
import java.util.Arrays;

public class Output {
    public static void Table(String csvFile) {
        BufferedReader br = null;
        String line = "";
        String csvSplitBy = ",";

        String leftAlignFormat = "| %-15s | %-15s | %-15s |%n";

        System.out.format("+-----------------+-----------------+-----------------+%n");
        System.out.format("| Surname         | Initials        | Extension       |%n");
        System.out.format("+-----------------+-----------------+-----------------+%n");
        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                String[] entries = line.split(csvSplitBy);
                System.out.format(leftAlignFormat, entries[0], entries[1], entries[2]);
            }

            System.out.format("+-----------------+-----------------+-----------------+%n");
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

    }

    public static void TxtFile(String filePathAndName) throws FileNotFoundException {
        // If no path was given, a file will be created in the project's directory.
        PrintStream out = new PrintStream(new FileOutputStream(filePathAndName + ".txt"));
        out.println("Average times of Array directory methods:");
        out.println("Inserting: " + Performance.ArrayInsert() + " nano seconds ===== Worst case");
        out.println("Deleting using name: " + Performance.ArrayDeleteUsingName() + " nano seconds ===== Worst case");
        out.println("Deleting using extension: " + Performance.ArrayDeleteUsingExtension() + " nano seconds ===== Worst case");
        out.println("Looking up: " + Performance.ArrayLookup() + " nano seconds ===== Best case");
        out.println("\n");
        out.println("Average times of ArrayList directory methods:");
        out.println("Inserting: " + Performance.ArrayListInsert() + " nano seconds ===== Average case");
        out.println("Deleting using name: " + Performance.ArrayListDeleteUsingName() + " nano seconds ===== Average case");
        out.println("Deleting using extension: " + Performance.ArrayListDeleteUsingExtension() + " nano seconds ===== Average case");
        out.println("Looking up: " + Performance.ArrayListLookup() + " nano seconds ===== Worst case");
        out.println("\n");
        out.println("Average times of HashMap directory methods:");
        out.println("Inserting: " + Performance.HashMapInsert() + " nano seconds ===== Best case");
        out.println("Deleting using name: " + Performance.HashMapDeleteUsingName() + " nano seconds ===== Best case");
        out.println("Deleting using extension: " + Performance.HashMapDeleteUsingExtension() + " nano seconds ===== Best case");
        out.println("Looking up: " + Performance.HashMapLookup() + " nano seconds ===== Average case");
        out.close();
    }
}
