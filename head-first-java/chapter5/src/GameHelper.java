/**
 * Created by Vayne-Lover on 2/22/17.
 */
import java.io.*;
public class GameHelper {
    public String GetUserInput(){
        String input=null;
        System.out.print("Please input your guess : ");
        try{
            BufferedReader is=new BufferedReader(new InputStreamReader(System.in));
            input=is.readLine();
            if(input.length()==0){
                return null;
            }
        }catch(IOException e){
            System.out.println(e);
        }
        return input;
    }
}
