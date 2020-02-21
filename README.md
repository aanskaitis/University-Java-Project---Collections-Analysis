The project analyse different types of directories.
---
Run main class to start the program, which asks for user input for further action.

Input class methods:
---
FileRead - takes csv file and imports its data into chosen directory. For example try these commands:


ArrayDirectory newDirectory = new ArrayDirectory();

Input.FileRead("test_data.csv", newDirectory);

Output class methods:
--
TxtFile - transform performance class results into txt file.
Table - transform data into ASCII format table. DataToCsv - creates csv file and fills it with given data.

Try writing this code in the main class:

Output.TxtFile("PerformanceAnalysis");

Output.Table("test_data.csv");

ArrayDirectory newDirectory = new ArrayDirectory();

Input.FileRead("test_data.csv", newDirectory);

Output.DataToCsv("new_file", newDirectory)