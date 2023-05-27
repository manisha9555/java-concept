import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CWH {
    public static void main(String[] args) {

        File myFile = new File("CWH_file1.txt");
        try {
            FileWriter fileWriter = new FileWriter("CWH_file1.txt");
            fileWriter.write("CodeWithHarry is one step solution for your all programming problems.\nKeep learning, Keep coding!");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
