/**
 * Created by Vayne-Lover on 5/29/17.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class Box {
    private ArrayList<String> list = new ArrayList<String>();

    public static void main(String[] args){
        Box box = new Box();
        box.go();
    }

    private void go(){
        getSongs();
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }

    private void getSongs(){
        try{
            File file = new File("Songs.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null){
                addSong(line);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }

    private void addSong(String line){
        String[] songs = line.split("/");
        list.add(songs[0]);
    }
}
