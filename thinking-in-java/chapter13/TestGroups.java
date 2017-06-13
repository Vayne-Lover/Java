import java.util.regex.*;

public class TestGroups{
    public static final String POEM =
            "Twas brilling, and the slighty toves\n" +
            "Did gyre and gimble in the wabe.\n" +
            "All mimsy were the borogoves,\n" +
            "And the mome raths outgrabs.\n\n" +
            "Beware the Jabberwockwock, my son,\n" +
            "The jaws that bite, the clasw that catch.\n" +
            "Beware the Jubjub bird, and shun\n" +
            "The frumious Bandersnatch.";

    public static void main(String[] args){
        Pattern p = Pattern.compile("(?m)(\\S+)\\s+((\\S+)\\s+(\\S+))$");
        Matcher m = p.matcher(POEM);

        while(m.find()){
            int i = 0;
            for(int j = 0; j <= m.groupCount(); ++j){
                System.out.println("[" + m.group(j) + "]");
                i++;
            }
            System.out.println();
        }
    }
}