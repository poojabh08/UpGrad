import java.util.Scanner;
import java.io.FileWriter;

public class WriteFile {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        try {

            FileWriter writer = new FileWriter("/Users/poojahegde/Desktop/test.txt"); // Specify the path of the file where you wish to store the output of this code

            System.out.print("Enter what you wish to write ");
            String line = scan.nextLine(); // read the line

            // write the input line to the file.
            writer.write(line);
            writer.close();
            System.out.println("Done");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
