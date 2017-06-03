/**
 * Created by Vayne-Lover on 6/4/17.
 */
public class BankJob implements Runnable {
    private BankAccount account = new BankAccount();

    public static void main(String[] args){
        BankJob job = new BankJob();
        Thread one = new Thread(job);
        Thread two = new Thread(job);

        one.start();
        two.start();
    }

    public void run(){
        for(int i = 0; i < 10; ++i){
            withdraw(10);
            if(account.getBalance() < 0){
                System.out.println("Overdrawn");
            }
        }

    }

    private synchronized void withdraw(int amount){
        if (account.getBalance() >= amount) {
            System.out.println(Thread.currentThread().getName() + " is about to withdraw");

            try {
                System.out.println(Thread.currentThread().getName() + " is going to sleep");
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " wake up");
            account.withdraw(amount);
            System.out.println(Thread.currentThread().getName() + " completes the withdraw");
        }
        else
        {
            System.out.println("Sorry, not enough for " + Thread.currentThread().getName());
        }
    }

}
