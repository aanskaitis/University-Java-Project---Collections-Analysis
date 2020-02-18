import java.util.Arrays;
public class main {

    public static void main(String[] args){
        String file = "test_data.csv";
        //ArrayDirectory newDirectory = new ArrayDirectory();
        //input.FileRead(file, newDirectory);
        //System.out.println(Arrays.toString(ArrayDirectory.entryDirectory));
        //System.out.println(newDirectory.toArrayList());
//        ArrayListDirectory newListDirectory = new ArrayListDirectory();
//        input.FileRead(file, newListDirectory);
//        System.out.println(Arrays.toString(newListDirectory.toArrayList().toArray()));
//        newListDirectory.deleteEntryUsingName("Heliet");
//        System.out.println(Arrays.toString(newListDirectory.toArrayList().toArray()));
//        newListDirectory.deleteEntryUsingExtension("98287");
//        System.out.println(Arrays.toString(newListDirectory.toArrayList().toArray()));
//        newListDirectory.updateExtensionUsingName("Piggott","81111");
//        System.out.println(Arrays.toString(newListDirectory.toArrayList().toArray()));
//        System.out.println(newListDirectory.lookupExtension("Sedgemond"));
//        System.out.println(Arrays.toString(newListDirectory.toArrayList().toArray()));
        HashMapDirectory extensionSurname = new HashMapDirectory();
        HashMapDirectory extensionInitials = new HashMapDirectory();
        input.FileRead(file, extensionSurname);
        input.FileRead(file, extensionInitials);


    }
}
