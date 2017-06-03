/**
 * Created by Vayne-Lover on 6/3/17.
 */
public class BankAccount {
    private int balance = 100;

    public int getBalance(){
        return balance;
    }

    public void withdraw(int amount){
        balance -= amount;
    }
}
