/**
 * Created by Vayne-Lover on 5/26/17.
 */

import java.io.*;
import static java.lang.System.*;

public class ReadFile {
    public static void main(String[] args){
        try{
            File file = new File("text.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);

            String line = null;

            while( (line = reader.readLine())!=null){
                out.println(line);
            }

            reader.close();

        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
