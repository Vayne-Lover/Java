import java.util.*;
import java.util.regex.*;

public class SplitDemo{
    public static void main(String[] args){
        String str = "This!!unusual use!!of exclamation!!points";
        System.out.println(Arrays.toString(Pattern.compile("!!").split(str)));
        System.out.println(Arrays.toString(Pattern.compile("!!").split(str, 3)));
    }
}