import java.util.regex.*;

public class TestReFlags {
    public static void main(String[] args){
        String s = "java has regex\nJava has regex\n" +
                   "JAVA has pretty good regular expressions\n" +
                   "Regular expressions are in Java";
        Pattern p = Pattern.compile("^java", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
        Matcher m = p.matcher(s);

        while(m.find()){
            System.out.println(m.group());
        }
    }
}