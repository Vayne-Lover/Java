/**
 * Created by Vayne-Lover on 5/27/17.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
    private void go(){
        try{
            Socket s = new Socket("127.0.0.1", 4242);

            InputStreamReader streamReader = new InputStreamReader(s.getInputStream());
            BufferedReader reader = new BufferedReader(streamReader);

            String advice = reader.readLine();

            System.out.println(advice);

            reader.close();

        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    public static void main(String[] args){
        Client cli = new Client();
        cli.go();
    }

}

