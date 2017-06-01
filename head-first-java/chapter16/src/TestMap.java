/**
 * Created by Vayne-Lover on 6/1/17.
 */

import java.util.HashMap;

public class TestMap {
    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        map.put("AAA", 124);
        map.put("BBB", 341);
        map.put("CCC", 351);

        System.out.println(map);

        System.out.println(map.get("AAA"));
    }
}
