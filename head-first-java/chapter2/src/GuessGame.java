/**
 * Created by Vayne-Lover on 2/19/17.
 */
class Game{
    Player p1;
    Player p2;
    Player p3;
    int guessTime=0;

    public void startGame(){
        p1=new Player();
        p2=new Player();
        p3=new Player();

        int result= (int)(Math.random()*10);

        while(true){
            System.out.println("Now start to guess"+result);

            guessTime+=1;

            p1.guess();
            p2.guess();
            p3.guess();

            System.out.println("Player 1 guess :"+p1.number);
            System.out.println("Player 2 guess :"+p2.number);
            System.out.println("Player 3 guess :"+p3.number);

            if (p1.number==result|p2.number==result|p3.number==result){
                System.out.println("Success");
                System.out.println("Use "+guessTime+" times");
                break;
            } else {
                System.out.println("Guess Again");
            }
        }

    }
}

class Player{
    int number=0;
    public void guess(){
        number=(int)(Math.random()*10);
        System.out.println("I'm guessing "+number);

    }

}
public class GuessGame {
    public static void main(String[] args){
    Game game=new Game();
    game.startGame();
    }
}
