/**
 * Created by Vayne-Lover on 5/28/17.
 */

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private String[] advice = {"Take it.", "Go go go!", "Hello!", "Nice!"};

    private void go() {
        try{
            ServerSocket serverSocket = new ServerSocket(4242);

            while (true) {
                Socket soc = serverSocket.accept();

                PrintWriter writer = new PrintWriter(soc.getOutputStream());
                String ad = getAdvice();
                writer.println(ad);
                writer.close();
                System.out.println(ad);
            }
        }catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    private String getAdvice() {
        int random = (int) (Math.random() * advice.length);
        return advice[random];
    }

    public static void main(String[] args){
        Server ser = new Server();
        ser.go();
    }
}
