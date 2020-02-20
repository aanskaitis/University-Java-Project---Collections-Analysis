
public class Performance {

    static String file = "test_data.csv";
    static ArrayDirectory ArrayTest = new ArrayDirectory();
    static ArrayListDirectory ArrayListTest = new ArrayListDirectory();
    static HashMapDirectory HashMapTest = new HashMapDirectory();
    static StopWatch time = new StopWatch();

    public static int ArrayInsert() {
        Input.FileRead(file, ArrayTest);
        Entry testEntry = ArrayTest.toArrayList().get(ArrayTest.toArrayList().size() / 2);
        int averageTime;
        int combinedTime = 0;
        for (int i = 0; i < 1000; i++) {
            time.start();
            ArrayTest.insertEntry(testEntry);
            time.stop();
            combinedTime += time.getElapsedTime();
            time.reset();
            ArrayTest.deleteEntryUsingName(testEntry.Surname);
        }
        averageTime = combinedTime / 1000;
        return averageTime;
    }
    public static int ArrayDeleteUsingName() {
        Input.FileRead(file, ArrayTest);
        Entry testEntry = ArrayTest.toArrayList().get(ArrayTest.toArrayList().size() / 2);
        int averageTime;
        int combinedTime = 0;
        for (int i = 0; i < 1000; i++) {
            ArrayTest.insertEntry(testEntry);
            time.start();
            ArrayTest.deleteEntryUsingName(testEntry.Surname);
            time.stop();
            combinedTime += time.getElapsedTime();
            time.reset();
        }
        averageTime = combinedTime / 1000;
        return averageTime;
    }

    public static int ArrayDeleteUsingExtension() {
        Input.FileRead(file, ArrayTest);
        Entry testEntry = ArrayTest.toArrayList().get(ArrayTest.toArrayList().size() / 2);
        int averageTime;
        int combinedTime = 0;
        for (int i = 0; i < 1000; i++) {
            time.start();
            ArrayTest.insertEntry(testEntry);
            time.stop();
            combinedTime += time.getElapsedTime();
            time.reset();
            ArrayTest.deleteEntryUsingExtension(testEntry.TelephoneExtension);
        }
        averageTime = combinedTime / 1000;
        return averageTime;
    }

    public static int ArrayLookup() {
        Input.FileRead(file, ArrayTest);
        Entry testEntry = ArrayTest.toArrayList().get(ArrayTest.toArrayList().size() / 2);
        int averageTime;
        ArrayTest.insertEntry(testEntry);
        int combinedTime = 0;
        for (int i = 0; i < 1000; i++) {
            time.start();
            ArrayTest.lookupExtension(testEntry.Surname);
            time.stop();
            combinedTime += time.getElapsedTime();
            time.reset();
        }
        averageTime = combinedTime / 1000;
        return averageTime;
    }

    public static int ArrayListInsert () {
        Input.FileRead(file, ArrayListTest);
        Entry testEntry = ArrayListTest.toArrayList().get(ArrayListTest.toArrayList().size() / 2);
        int averageTime;
        int combinedTime = 0;
        for (int i = 0; i < 1000; i++) {
            time.start();
            ArrayListTest.insertEntry(testEntry);
            time.stop();
            combinedTime += time.getElapsedTime();
            time.reset();
            ArrayListTest.deleteEntryUsingName(testEntry.Surname);
        }
        averageTime = combinedTime / 1000;
        return averageTime;
    }

    public static int ArrayListDeleteUsingName() {
        Input.FileRead(file, ArrayListTest);
        Entry testEntry = ArrayListTest.toArrayList().get(ArrayListTest.toArrayList().size() / 2);
        int averageTime;
        int combinedTime = 0;
        for (int i = 0; i < 1000; i++) {
            ArrayListTest.insertEntry(testEntry);
            time.start();
            ArrayListTest.deleteEntryUsingName(testEntry.Surname);
            time.stop();
            combinedTime += time.getElapsedTime();
            time.reset();
        }
        averageTime = combinedTime / 1000;
        return averageTime;
    }
    public static int ArrayListDeleteUsingExtension() {
        Input.FileRead(file, ArrayListTest);
        Entry testEntry = ArrayListTest.toArrayList().get(ArrayListTest.toArrayList().size() / 2);
        int averageTime;
        int combinedTime = 0;
        for (int i = 0; i < 1000; i++) {
            time.start();
            ArrayListTest.insertEntry(testEntry);
            time.stop();
            combinedTime += time.getElapsedTime();
            time.reset();
            ArrayListTest.deleteEntryUsingExtension(testEntry.TelephoneExtension);
        }
        averageTime = combinedTime / 1000;
        return averageTime;
    }

    public static int ArrayListLookup() {
        Input.FileRead(file, ArrayListTest);
        Entry testEntry = ArrayListTest.toArrayList().get(ArrayListTest.toArrayList().size() / 2);
        int averageTime;
        int combinedTime = 0;
        for (int i = 0; i < 1000; i++) {
            time.start();
            ArrayListTest.lookupExtension(testEntry.Surname);
            time.stop();
            combinedTime += time.getElapsedTime();
            time.reset();
        }
        averageTime = combinedTime / 1000;
        return averageTime;
    }

    public static int HashMapInsert() {
        Input.FileRead(file, HashMapTest);
        Entry testEntry = HashMapTest.toArrayList().get(HashMapTest.toArrayList().size() / 2);
        int averageTime;
        int combinedTime = 0;
        for (int i = 0; i < 1000; i++) {
            time.start();
            HashMapTest.insertEntry(testEntry);
            time.stop();
            combinedTime += time.getElapsedTime();
            time.reset();
            HashMapTest.deleteEntryUsingName(testEntry.Surname);
        }
        // Insert and Delete methods use two HashMaps, there the average time is divided by 2.
        averageTime = (combinedTime / 1000) / 2;
        return averageTime;
    }

    public static int HashMapDeleteUsingName() {
        Input.FileRead(file, HashMapTest);
        Entry testEntry = HashMapTest.toArrayList().get(HashMapTest.toArrayList().size() / 2);
        int averageTime;
        int combinedTime = 0;
        for (int i = 0; i < 1000; i++) {
            HashMapTest.insertEntry(testEntry);
            time.start();
            HashMapTest.deleteEntryUsingName(testEntry.Surname);
            time.stop();
            combinedTime += time.getElapsedTime();
            time.reset();
        }
        averageTime = (combinedTime / 1000) / 2;
        return averageTime;
    }

    public static int HashMapDeleteUsingExtension() {
        Input.FileRead(file, HashMapTest);
        Entry testEntry = HashMapTest.toArrayList().get(HashMapTest.toArrayList().size() / 2);
        int averageTime;
        int combinedTime = 0;
        for (int i = 0; i < 1000; i++) {
            time.start();
            HashMapTest.insertEntry(testEntry);
            time.stop();
            combinedTime += time.getElapsedTime();
            time.reset();
            HashMapTest.deleteEntryUsingExtension(testEntry.TelephoneExtension);
        }
        averageTime = (combinedTime / 1000) / 2;
        return averageTime;
    }

    public static int HashMapLookup() {
        Input.FileRead(file, HashMapTest);
        Entry testEntry = HashMapTest.toArrayList().get(HashMapTest.toArrayList().size() / 2);
        int averageTime;
        int combinedTime = 0;
        HashMapTest.insertEntry(testEntry);
        for (int i = 0; i < 1000; i++) {
            time.start();
            HashMapTest.lookupExtension(testEntry.Surname);
            time.stop();
            combinedTime += time.getElapsedTime();
            time.reset();
        }
        // Look up method uses only one HashMap, therefore the average time is not divided by 2 here.
        averageTime = (combinedTime / 1000);
        return averageTime;
    }
}

