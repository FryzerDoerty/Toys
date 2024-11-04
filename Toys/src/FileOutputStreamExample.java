import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileOutputStreamExample {

    public static void addInfile(ArrayList<toys> arr) {
            try(
                    FileWriter writer = new FileWriter("prize.txt", true))
    {
        toys a = arr.get(0);
        String text = a.getName();
        writer.write(text);
        writer.append('\n');

        writer.flush();
    }
        catch(IOException ex){

        System.out.println(ex.getMessage());
    }}
}
