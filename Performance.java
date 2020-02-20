
public class Performance {
    static StopWatch time = new StopWatch();
    static Entry testEntry = new Entry("TestSurname", "TestInitials", "TestExtension");

    public static void ArrayPerformance() {
        ArrayDirectory newDirectory = new ArrayDirectory();
        System.out.println("Average time of inserting an Entry into Array:");
        int combinedTime = 0;
        for (int i = 0; i < 10000; i++) {
            time.start();
            newDirectory.insertEntry(testEntry);
            time.stop();
            combinedTime += time.getElapsedTime();
            time.reset();
            newDirectory.deleteEntryUsingName("TestSurname");
        }
        int averageTime = combinedTime / 10000;
        System.out.println(averageTime + " nano seconds");

        System.out.println("Average time of deleting an Entry using name from Array:");
        combinedTime = 0;
        for (int i = 0; i < 10000; i++) {
            newDirectory.insertEntry(testEntry);
            time.start();
            newDirectory.deleteEntryUsingName("TestSurname");
            time.stop();
            combinedTime += time.getElapsedTime();
            time.reset();
        }
        averageTime = combinedTime / 10000;
        System.out.println(averageTime + " nano seconds");
        System.out.println("Average time of deleting an Entry using extension from Array:");
        combinedTime = 0;
        for (int i = 0; i < 10000; i++) {
            time.start();
            newDirectory.insertEntry(testEntry);
            time.stop();
            combinedTime += time.getElapsedTime();
            time.reset();
            newDirectory.deleteEntryUsingExtension("TestExtension");
        }
        averageTime = combinedTime / 10000;
        System.out.println(averageTime + " nano seconds");
        System.out.println("Average time of looking up an extension of an entry from Array:");
        newDirectory.insertEntry(testEntry);
        combinedTime = 0;
        for (int i = 0; i < 10000; i++) {
            time.start();
            newDirectory.lookupExtension("TestSurname");
            time.stop();
            combinedTime += time.getElapsedTime();
            time.reset();
        }
        averageTime = combinedTime / 10000;
        System.out.println(averageTime + " nano seconds");
    }

    public static void ArrayListPerformance() {
        ArrayListDirectory newDirectory = new ArrayListDirectory();
        System.out.println("Average time of inserting an Entry into ArrayList:");
        int combinedTime = 0;
        for (int i = 0; i < 10000; i++) {
            time.start();
            newDirectory.insertEntry(testEntry);
            time.stop();
            combinedTime += time.getElapsedTime();
            time.reset();
            newDirectory.deleteEntryUsingName("TestSurname");
        }
        int averageTime = combinedTime / 10000;
        System.out.println(averageTime + " nano seconds");
        System.out.println("Average time of deleting an Entry using name from ArrayList:");
        combinedTime = 0;
        for (int i = 0; i < 10000; i++) {
            newDirectory.insertEntry(testEntry);
            time.start();
            newDirectory.deleteEntryUsingName("TestSurname");
            time.stop();
            combinedTime += time.getElapsedTime();
            time.reset();
        }
        averageTime = combinedTime / 10000;
        System.out.println(averageTime + " nano seconds");
        System.out.println("Average time of deleting an Entry using extension from ArrayList:");
        combinedTime = 0;
        for (int i = 0; i < 10000; i++) {
            time.start();
            newDirectory.insertEntry(testEntry);
            time.stop();
            combinedTime += time.getElapsedTime();
            time.reset();
            newDirectory.deleteEntryUsingExtension("TestExtension");
        }
        averageTime = combinedTime / 10000;
        System.out.println(averageTime + " nano seconds");
        System.out.println("Average time of looking up an extension of an entry from ArrayList:");
        newDirectory.insertEntry(testEntry);
        combinedTime = 0;
        for (int i = 0; i < 10000; i++) {
            time.start();
            newDirectory.lookupExtension("TestSurname");
            time.stop();
            combinedTime += time.getElapsedTime();
            time.reset();
        }
        averageTime = combinedTime / 10000;
        System.out.println(averageTime + " nano seconds");
    }

    public static void HashMapPerformance(){
        HashMapDirectory newDirectory = new HashMapDirectory();
        System.out.println("Average time of inserting an Entry into HashMap:");
        int combinedTime = 0;
        for (int i = 0; i < 10000; i++) {
            time.start();
            newDirectory.insertEntry(testEntry);
            time.stop();
            combinedTime += time.getElapsedTime();
            time.reset();
            newDirectory.deleteEntryUsingName("TestSurname");
        }
        // The average time for HashMaps are divided by 2, because we used 2 HashMaps.
        int averageTime = (combinedTime / 10000) / 2;
        System.out.println(averageTime + " nano seconds");
        System.out.println("Average time of deleting an Entry using name from HashMap:");
        combinedTime = 0;
        for (int i = 0; i < 10000; i++) {
            newDirectory.insertEntry(testEntry);
            time.start();
            newDirectory.deleteEntryUsingName("TestSurname");
            time.stop();
            combinedTime += time.getElapsedTime();
            time.reset();
        }
        averageTime = (combinedTime / 10000) / 2;
        System.out.println(averageTime + " nano seconds");
        System.out.println("Average time of deleting an Entry using extension from HashMap:");
        combinedTime = 0;
        for (int i = 0; i < 10000; i++) {
            time.start();
            newDirectory.insertEntry(testEntry);
            time.stop();
            combinedTime += time.getElapsedTime();
            time.reset();
            newDirectory.deleteEntryUsingExtension("TestExtension");
        }
        averageTime = (combinedTime / 10000) / 2;
        System.out.println(averageTime + " nano seconds");
        System.out.println("Average time of looking up an extension of an entry from HashMap:");
        newDirectory.insertEntry(testEntry);
        combinedTime = 0;
        for (int i = 0; i < 10000; i++) {
            time.start();
            newDirectory.lookupExtension("TestSurname");
            time.stop();
            combinedTime += time.getElapsedTime();
            time.reset();
        }
        // Only one HashMap is used to lookup extension, therefore the average time is not divided by 2.
        averageTime = combinedTime / 10000;
        System.out.println(averageTime + " nano seconds");
    }
}
