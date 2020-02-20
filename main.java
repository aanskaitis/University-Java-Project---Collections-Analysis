import java.io.FileNotFoundException;
import java.util.Arrays;
public class main {

    public static void main(String[] args) throws FileNotFoundException {
        // Array example
        ArrayDirectory directoryArray = new ArrayDirectory();
        Input.FileRead("test_data.csv", directoryArray);
        System.out.println(Arrays.toString(directoryArray.toArrayList().toArray()));
        // ArrayList example
        ArrayListDirectory directoryArrayList = new ArrayListDirectory();
        Input.FileRead("test_data.csv", directoryArrayList);
        System.out.println(Arrays.toString(directoryArrayList.toArrayList().toArray()));
        // HashMap example
        HashMapDirectory directoryHashMap = new HashMapDirectory();
        Input.FileRead("test_data.csv", directoryHashMap);
        System.out.println(Arrays.toString(directoryHashMap.toArrayList().toArray()));
        // Creating a performance analysis report as a txt file
        Output.TxtFile("PerformanceAnalysis");
        // User inputs
        Input.UserInputs();
    }
}
