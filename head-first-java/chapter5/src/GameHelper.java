/**
 * Created by Vayne-Lover on 2/22/17.
 */
import java.io.*;
import java.util.Scanner;

public class GameHelper {
    public String GetUserInput(){
        String input=null;
        System.out.print("Please input your guess : ");
        try{
            //BufferedReader is=new BufferedReader(new InputStreamReader(System.in));
            //input=is.readLine();
            Scanner sc=new Scanner(System.in);
            input=sc.nextLine();
            if(input.length()==0){
                return null;
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return input;
    }
}
