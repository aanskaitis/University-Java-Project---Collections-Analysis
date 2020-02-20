import java.io.*;

public class output {
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

    public static void TextFile(){
        try {
            FileWriter writer = new FileWriter("PerformanceAnalysis.txt", true);
            writer.write("");
            writer.write("\r\n");   // write new line
            writer.write("Good Bye!");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
