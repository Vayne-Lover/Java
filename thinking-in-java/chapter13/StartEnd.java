import java.util.regex.*;

public class StartEnd{
    pubic static String input = "As long as there is injustuce, whenever a\n" +
                                "Targeathian baby cries out, whenervr a distress\n" +
                                "signal sounds among the stars ... We'l be there.\n" +
                                "This fine ship, and this fine crew ...\n" +
                                "Never give up!Never surrender!";

    private class Display{
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
}