import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
String fileName = "Prachi.txt";
try {
FileWriter writer = new FileWriter(fileName);
writer.write("Hello! I am Prachi Pillay.");
writer.close();
System.out.println("Successfully wrote to the file.");
File file = new File(fileName);
Scanner reader = new Scanner(file);
System.out.println("File Content:");
while (reader.hasNextLine()) {
System.out.println(reader.nextLine());
}
reader.close();
} catch (IOException e) {
System.out.println("An error occurred: " + e.getMessage());
}
}
}
