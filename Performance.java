import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Performance {

    static String file = "test_data.csv";
    static ArrayDirectory ArrayTest = new ArrayDirectory();
    static ArrayListDirectory ArrayListTest = new ArrayListDirectory();
    static HashMapDirectory HashMapTest = new HashMapDirectory();
    static StopWatch time = new StopWatch();

    public static void ArrayPerformance() {
        input.FileRead(file, ArrayTest);
        Entry testEntry = ArrayTest.toArrayList().get(ArrayTest.toArrayList().size()/2);
        System.out.println("Average time of inserting an Entry into Array:");
        int combinedTime = 0;
        for (int i = 0; i < 1000; i++) {
            time.start();
            ArrayTest.insertEntry(testEntry);
            time.stop();
            combinedTime += time.getElapsedTime();
            time.reset();
            ArrayTest.deleteEntryUsingName(testEntry.Surname);
        }
        int averageTime = combinedTime / 1000;
        System.out.println(averageTime + " nano seconds");

        System.out.println("Average time of deleting an Entry using name from Array:");
        combinedTime = 0;
        for (int i = 0; i < 1000; i++) {
            ArrayTest.insertEntry(testEntry);
            time.start();
            ArrayTest.deleteEntryUsingName(testEntry.Surname);
            time.stop();
            combinedTime += time.getElapsedTime();
            time.reset();
        }
        averageTime = combinedTime / 1000;
        System.out.println(averageTime + " nano seconds");
        System.out.println("Average time of deleting an Entry using extension from Array:");
        combinedTime = 0;
        for (int i = 0; i < 1000; i++) {
            time.start();
            ArrayTest.insertEntry(testEntry);
            time.stop();
            combinedTime += time.getElapsedTime();
            time.reset();
            ArrayTest.deleteEntryUsingExtension(testEntry.TelephoneExtension);
        }
        averageTime = combinedTime / 1000;
        System.out.println(averageTime + " nano seconds");
        System.out.println("Average time of looking up an extension of an entry from Array:");
        ArrayTest.insertEntry(testEntry);
        combinedTime = 0;
        for (int i = 0; i < 1000; i++) {
            time.start();
            ArrayTest.lookupExtension(testEntry.Surname);
            time.stop();
            combinedTime += time.getElapsedTime();
            time.reset();
        }
        averageTime = combinedTime / 1000;
        System.out.println(averageTime + " nano seconds");
    }

    public static void ArrayListPerformance () {
        input.FileRead(file, ArrayListTest);
        Entry testEntry = ArrayListTest.toArrayList().get(ArrayListTest.toArrayList().size()/2);
        System.out.println("Average time of inserting an Entry into ArrayList:");
        int combinedTime = 0;
        for (int i = 0; i < 1000; i++) {
            time.start();
            ArrayListTest.insertEntry(testEntry);
            time.stop();
            combinedTime += time.getElapsedTime();
            time.reset();
            ArrayListTest.deleteEntryUsingName(testEntry.Surname);
        }
        int averageTime = combinedTime / 1000;
        System.out.println(averageTime + " nano seconds");
        System.out.println("Average time of deleting an Entry using name from ArrayList:");
        combinedTime = 0;
        for (int i = 0; i < 1000; i++) {
            ArrayListTest.insertEntry(testEntry);
            time.start();
            ArrayListTest.deleteEntryUsingName(testEntry.Surname);
            time.stop();
            combinedTime += time.getElapsedTime();
            time.reset();
        }
        averageTime = combinedTime / 1000;
        System.out.println(averageTime + " nano seconds");
        System.out.println("Average time of deleting an Entry using extension from ArrayList:");
        combinedTime = 0;
        for (int i = 0; i < 1000; i++) {
            time.start();
            ArrayListTest.insertEntry(testEntry);
            time.stop();
            combinedTime += time.getElapsedTime();
            time.reset();
            ArrayListTest.deleteEntryUsingExtension(testEntry.TelephoneExtension);
        }
        averageTime = combinedTime / 1000;
        System.out.println(averageTime + " nano seconds");
        System.out.println("Average time of looking up an extension of an entry from ArrayList:");
        ArrayListTest.insertEntry(testEntry);
        combinedTime = 0;
        for (int i = 0; i < 1000; i++) {
            time.start();
            ArrayListTest.lookupExtension(testEntry.Surname);
            time.stop();
            combinedTime += time.getElapsedTime();
            time.reset();
        }
        averageTime = combinedTime / 1000;
        System.out.println(averageTime + " nano seconds");
    }

    public static void HashMapPerformance () {
        input.FileRead(file, HashMapTest);
        Entry testEntry = HashMapTest.toArrayList().get(HashMapTest.toArrayList().size()/2);
        System.out.println("Average time of inserting an Entry into HashMap:");
        int combinedTime = 0;
        for (int i = 0; i < 1000; i++) {
            time.start();
            HashMapTest.insertEntry(testEntry);
            time.stop();
            combinedTime += time.getElapsedTime();
            time.reset();
            HashMapTest.deleteEntryUsingName(testEntry.Surname);
        }
        // The average time for HashMaps are divided by 2, because we used 2 HashMaps.
        int averageTime = (combinedTime / 1000) / 2;
        System.out.println(averageTime + " nano seconds");
        System.out.println("Average time of deleting an Entry using name from HashMap:");
        combinedTime = 0;
        for (int i = 0; i < 1000; i++) {
            HashMapTest.insertEntry(testEntry);
            time.start();
            HashMapTest.deleteEntryUsingName(testEntry.Surname);
            time.stop();
            combinedTime += time.getElapsedTime();
            time.reset();
        }
        averageTime = (combinedTime / 1000) / 2;
        System.out.println(averageTime + " nano seconds");
        System.out.println("Average time of deleting an Entry using extension from HashMap:");
        combinedTime = 0;
        for (int i = 0; i < 1000; i++) {
            time.start();
            HashMapTest.insertEntry(testEntry);
            time.stop();
            combinedTime += time.getElapsedTime();
            time.reset();
            HashMapTest.deleteEntryUsingExtension(testEntry.TelephoneExtension);
        }
        averageTime = (combinedTime / 1000) / 2;
        System.out.println(averageTime + " nano seconds");
        System.out.println("Average time of looking up an extension of an entry from HashMap:");
        HashMapTest.insertEntry(testEntry);
        combinedTime = 0;
        for (int i = 0; i < 1000; i++) {
            time.start();
            HashMapTest.lookupExtension(testEntry.Surname);
            time.stop();
            combinedTime += time.getElapsedTime();
            time.reset();
        }
        // Only one HashMap is used to lookup extension, therefore the average time is not divided by 2.
        averageTime = combinedTime / 1000;
        System.out.println(averageTime + " nano seconds");
    }
}

