/**
 * Created by Vayne-Lover on 5/23/17.
 */

import java.io.*;

public class GameCharacter implements Serializable {
    private int power;
    private String type;
    private String[] weapons;

    public GameCharacter(int p, String t, String[] w){
        power = p;
        type = t;
        weapons = w;
    }

    public int getPower(){
        return power;
    }

    public String getType() {
        return type;
    }

    public String getWeapons() {
        String weaponList = "";
        for(String w:weapons)
            weaponList += w+" ";
        return weaponList;
    }
}
