import java.util.Arrays;
import java.util.Scanner;

public class UserInterface {
    public static void UserInputs(){
        String file = "test_data.csv";
        Scanner UserInput = new Scanner(System.in);
        System.out.println("Write DISPLAY to display the current data, write INSERT to insert a new entry:");
        String answer = UserInput.nextLine();
        if(answer.equals("DISPLAY")){
            Scanner directory = new Scanner(System.in);
            System.out.println("Write ARRAY, ARRAYLIST or HASHMAP to select directory to display:");
            String chosenDirectory = directory.nextLine();
            if(chosenDirectory.equals("ARRAY")){
                ArrayDirectory newDirectory = new ArrayDirectory();
                input.FileRead(file, newDirectory);
                System.out.println(Arrays.toString(newDirectory.toArrayList().toArray()));
            }
        }
    }
}
