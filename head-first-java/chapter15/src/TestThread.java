/**
 * Created by Vayne-Lover on 5/31/17.
 */
class MyRunnable implements Runnable{
    public void run(){
        go();
    }

    public void go(){
        doMore();
    }

    public void doMore(){
        System.out.println("Top on stack!");
    }
}
public class TestThread {
    public static void main(String[] args){
        Runnable myRunnable = new MyRunnable();
        Thread myThread = new Thread(myRunnable);

        myThread.start();

        System.out.println("Back in main!");
    }

}
