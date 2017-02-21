/**
 * Created by Vayne-Lover on 2/21/17.
 */
public class SimpleDotGameTestDrive {
    public static void main(String[] args){
        SimpleDotGame game=new SimpleDotGame();

        int[] location={2,3,4};

        game.setLocation(location);

        location[0]=1;

        System.out.println(game.getLocation()[0]);

        String guess="1";

        game.check(guess);

    }
}
