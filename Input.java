import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Input {

    public static Directory FileRead(String csvFile, Directory directory) {
        // This method takes the csv file, reads it and stores its data into a chosen directory
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

    public static void UserInputs(){
        // This method allows user to input commands to achieve different things like access directory or print a table, etc.
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
                Input.FileRead(file, newDirectory);
                System.out.println(Arrays.toString(newDirectory.toArrayList().toArray()));
            } else if (chosenDirectory.equals("ARRAYLIST")){
                ArrayListDirectory newDirectory = new ArrayListDirectory();
                Input.FileRead(file, newDirectory);
                System.out.println(Arrays.toString(newDirectory.toArrayList().toArray()));
            } else if (chosenDirectory.equals("HASHMAP")) {
                HashMapDirectory newDirectory = new HashMapDirectory();
                Input.FileRead(file, newDirectory);
                System.out.println(Arrays.toString(newDirectory.toArrayList().toArray()));
            } else if (chosenDirectory.equals("EXIT")) {
                System.exit(0);
            } else {
                System.out.println("Unidentified type of directory");
                UserInputs();
            }
        } else if(answer.equals("TABLE")){
            Output.Table(file);
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
                String chosenInitials = initials.nextLine();
                Scanner extension = new Scanner(System.in);
                System.out.println("Enter telephone extension (only 5 digits):");
                String chosenExtension = extension.nextLine();
                ArrayDirectory newDirectory = new ArrayDirectory();
                Input.FileRead(file, newDirectory);
                Entry newEntry = new Entry(chosenSurname, chosenInitials, chosenExtension);
                newDirectory.insertEntry(newEntry);
                System.out.println(newEntry + " was inserted as a new entry.");
                UserInputs();
            } else if(chosenDirectory.equals("ARRAYLIST")){
                Scanner surname = new Scanner(System.in);
                System.out.println("Enter surname:");
                String chosenSurname = surname.nextLine();
                Scanner initials = new Scanner(System.in);
                System.out.println("Enter initials:");
                String chosenInitials = initials.nextLine();
                Scanner extension = new Scanner(System.in);
                System.out.println("Enter telephone extension:");
                String chosenExtension = extension.nextLine();
                ArrayListDirectory newDirectory = new ArrayListDirectory();
                Input.FileRead(file, newDirectory);
                Entry newEntry = new Entry(chosenSurname, chosenInitials, chosenExtension);
                newDirectory.insertEntry(newEntry);
                System.out.println(newEntry + " was inserted as a new entry.");
                UserInputs();
            } else if(chosenDirectory.equals("HASHMAP")){
                Scanner surname = new Scanner(System.in);
                System.out.println("Enter surname:");
                String chosenSurname = surname.nextLine();
                Scanner initials = new Scanner(System.in);
                System.out.println("Enter initials:");
                String chosenInitials = initials.nextLine();
                Scanner extension = new Scanner(System.in);
                System.out.println("Enter telephone extension:");
                String chosenExtension = extension.nextLine();
                HashMapDirectory newDirectory = new HashMapDirectory();
                Input.FileRead(file, newDirectory);
                Entry newEntry = new Entry(chosenSurname, chosenInitials, chosenExtension);
                newDirectory.insertEntry(newEntry);
                System.out.println(newEntry + " was inserted as a new entry.");
                UserInputs();
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

