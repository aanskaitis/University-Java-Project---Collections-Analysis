import java.util.Arrays;
public class main {

    public static void main(String[] args){
        String file = "test_data.csv";
        ArrayDirectory newDirectory = new ArrayDirectory();
        input.FileRead(file, newDirectory);
        System.out.println(Arrays.toString(ArrayDirectory.entryDirectory));
        newDirectory.updateExtensionUsingName("Prott","27596");
        System.out.println(Arrays.toString(ArrayDirectory.entryDirectory));


    }
}
