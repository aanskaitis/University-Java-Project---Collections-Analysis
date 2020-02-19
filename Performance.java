
public class Performance {
    static StopWatch time = new StopWatch();
    static Entry testEntry = new Entry("TestSurname", "TestInitials", "TestExtension");

    public static void ArrayPerformace() {
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

        System.out.println("Average time of deleting and Entry from Array:");
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
    }
}
