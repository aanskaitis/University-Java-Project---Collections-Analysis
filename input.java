//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//public class input {
//
//    public class entries {
//
//        String csvFile = "test_data.csv";
//        BufferedReader br = null;
//        String line = "";
//        String cvsSplitBy = ",";
//
//        try {
//
//            br = new BufferedReader(new FileReader(csvFile));
//            while ((line = br.readLine()) != null) {
//
//                // use comma as separator
//                String[] Entries = line.split(cvsSplitBy);
//                Entry eachEntry = new Entry(Entries[0], Entries[1], Entries[2]);
//
//                System.out.println(eachEntry.toString());
//
//            }
//
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (br != null) {
//                try {
//                    br.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//
//    }
//
//}