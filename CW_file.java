package package1;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CW_file {
    public static void main(String args[]){
        File myfile=new File("CW_file.txt");
        try{
            myfile.createNewFile();
            System.out.println("File create successfuly");
        }
        catch(Exception e){
           System.out.println(e);
        }

    }
}
