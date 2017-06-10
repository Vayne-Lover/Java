import java.util.*;

public class Splitting{
    public static String knights = "Then, when you have found the shrubbery," +
                                   " you must cut down the mightiest tree in the forest... " +
                                   "with... a herring!";

    public static void splitting(String regex){
        System.out.println(Arrays.toString(knights.split(regex)));
    }

    public static void main(String[] args){
        splitting(" ");
        splitting("\\W+");
        splitting("n\\W+");
    }
}