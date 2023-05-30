import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileException {

    public static void main(String[] args) {
        File file = new File("exp.txt");
        try{
            FileReader reader= new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
            throw new RuntimeException(e);
        }
    }
}
