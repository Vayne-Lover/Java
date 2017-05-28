/**
 * Created by Vayne-Lover on 5/28/17.
 */
public class Server {
    String[] advice = {"Take it.", "Go go go!", "Hello!", "Nice!"};

    public void go(){

    }

    public String getAdvicd(){
        int random = (int) (Math.random() * advice.length);
        return advice[random];
    }

    public static void main(String[] args){
        Server ser = new Server();
        ser.go();
    }
}
