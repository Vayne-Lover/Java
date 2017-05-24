/**
 * Created by Vayne-Lover on 5/24/17.
 */

import java.io.*;

public class GameSaverTest {
    public static void main(String[] args){
        GameCharacter one = new GameCharacter(50,"Elf",new String[]{"bow","dust"});
        GameCharacter two = new GameCharacter(200,"Troll",new String[]{"bare hands","big ax"});
        GameCharacter three = new GameCharacter(120,"Magician", new String[]{"spells","invisibility"});

        try{
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Game.ser"));
            os.writeObject(one);
            os.writeObject(two);
            os.writeObject(three);
            os.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
