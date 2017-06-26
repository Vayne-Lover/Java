import java.util.regex.*;

public class StartEnd{
    public static String input = "As long as there is injustuce, whenever a\n" +
                                "Targeathian baby cries out, whenervr a distress\n" +
                                "signal sounds among the stars ... We'l be there.\n" +
                                "This fine ship, and this fine crew ...\n" +
                                "Never give up!Never surrender!";

    private static class Display{
        private boolean regexPrinted = false;
        private String regex;
        Display(String regex){this.regex = regex;}
        void display(String message){
            if(!regexPrinted){
                System.out.println(regex);
                regexPrinted = true;
            }
            System.out.println(message);
        }
    }

    public static void examine(String s, String regex){
        Display d = new Display(regex);
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);

        while(m.find()){
            d.display("find() ' " + m.group() + " ' start = " + m.start() + "end = " + m.end());

            if(m.lookingAt()){
                d.display("lookingAt() " + " start = " + m.start() + "end = " + m.end());
            }

            if(m.matches()){
                d.display("matches() " + " start = " + m.start() + "end = " + m.end());
            }
        }
    }

    public static void main(String[] args){
        for(String in : input.split("\n")){
            System.out.println("Input: " + in);
            for(String regex : new String[]{"\\w*ere\\w*", "\\w*ever", "T\\w+", "Never.*?!"})
                examine(in, regex);
        }
    }
}