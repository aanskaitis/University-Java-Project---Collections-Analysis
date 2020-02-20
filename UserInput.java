import java.util.Arrays;
import java.util.Scanner;

public class UserInput {
    public static void UserInputs(){
        String file = "test_data.csv";
        System.out.println("Type EXIT if you want to exit the program.");
        Scanner UserInput = new Scanner(System.in);
        System.out.println("Write DISPLAY or TABLE to display the current data as a list or as a table, write INSERT to insert a new entry:");
        String answer = UserInput.nextLine();
        if(answer.equals("DISPLAY")){
            Scanner directory = new Scanner(System.in);
            System.out.println("Write ARRAY, ARRAYLIST or HASHMAP to select directory to display:");
            String chosenDirectory = directory.nextLine();
            if(chosenDirectory.equals("ARRAY")){
                ArrayDirectory newDirectory = new ArrayDirectory();
                input.FileRead(file, newDirectory);
                System.out.println(Arrays.toString(newDirectory.toArrayList().toArray()));
            } else if (chosenDirectory.equals("ARRAYLIST")){
                ArrayListDirectory newDirectory = new ArrayListDirectory();
                input.FileRead(file, newDirectory);
                System.out.println(Arrays.toString(newDirectory.toArrayList().toArray()));
            } else if (chosenDirectory.equals("HASHMAP")) {
                HashMapDirectory newDirectory = new HashMapDirectory();
                input.FileRead(file, newDirectory);
                System.out.println(Arrays.toString(newDirectory.toArrayList().toArray()));
            } else if (chosenDirectory.equals("EXIT")) {
                System.exit(0);
            } else {
                System.out.println("Unidentified type of directory");
                UserInputs();
            }
        } else if(answer.equals("TABLE")){
            output.Table(file);
        } else if(answer.equals("INSERT")){
            Scanner directory = new Scanner(System.in);
            System.out.println("Write ARRAY, ARRAYLIST or HASHMAP to select directory to insert value to:");
            String chosenDirectory = directory.nextLine();
            if(chosenDirectory.equals("ARRAY")){
                Scanner surname = new Scanner(System.in);
                System.out.println("Enter surname:");
                String chosenSurname = surname.nextLine();
                Scanner initials = new Scanner(System.in);
                System.out.println("Enter initials:");
                String chosenInitials = surname.nextLine();
                Scanner extension = new Scanner(System.in);
                System.out.println("Enter telephone extension:");
                String chosenExtension = surname.nextLine();
                ArrayDirectory newDirectory = new ArrayDirectory();
                input.FileRead(file, newDirectory);
                Entry newEntry = new Entry(chosenSurname, chosenInitials, chosenExtension);
                newDirectory.insertEntry(newEntry);
                System.out.println(newEntry + " was inserted as a new entry.");
            } else if(chosenDirectory.equals("ARRAYLIST")){
                Scanner surname = new Scanner(System.in);
                System.out.println("Enter surname:");
                String chosenSurname = surname.nextLine();
                Scanner initials = new Scanner(System.in);
                System.out.println("Enter initials:");
                String chosenInitials = surname.nextLine();
                Scanner extension = new Scanner(System.in);
                System.out.println("Enter telephone extension:");
                String chosenExtension = surname.nextLine();
                ArrayListDirectory newDirectory = new ArrayListDirectory();
                input.FileRead(file, newDirectory);
                Entry newEntry = new Entry(chosenSurname, chosenInitials, chosenExtension);
                newDirectory.insertEntry(newEntry);
                System.out.println(newEntry + " was inserted as a new entry.");
            } else if(chosenDirectory.equals("HASHMAP")){
                Scanner surname = new Scanner(System.in);
                System.out.println("Enter surname:");
                String chosenSurname = surname.nextLine();
                Scanner initials = new Scanner(System.in);
                System.out.println("Enter initials:");
                String chosenInitials = surname.nextLine();
                Scanner extension = new Scanner(System.in);
                System.out.println("Enter telephone extension:");
                String chosenExtension = surname.nextLine();
                HashMapDirectory newDirectory = new HashMapDirectory();
                input.FileRead(file, newDirectory);
                Entry newEntry = new Entry(chosenSurname, chosenInitials, chosenExtension);
                newDirectory.insertEntry(newEntry);
                System.out.println(newEntry + " was inserted as a new entry.");
            } else if (chosenDirectory.equals("EXIT")) {
                System.exit(0);
            } else {
                System.out.println("Unidentified type of directory");
                UserInputs();
            }
        } else if (answer.equals("EXIT")) {
            System.exit(0);
        } else {
            System.out.println("Unidentified command.");
            UserInputs();
        }
    }
}
