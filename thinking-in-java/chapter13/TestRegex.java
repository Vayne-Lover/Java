import java.util.regex.*;

public class TestRegex{
    public static void main(String[] args){
        System.out.println(args);

        if (args.length < 2){
            System.out.println("Error!");
            System.out.println("Usage: abcabcd abc+");
            System.exit(0);
        }

        for (String arg : args){
            Pattern p = Pattern.compile(arg);
            Matcher m = p.matcher(args[0]);

            while(m.find()){
                System.out.println("Regex:" + arg);
                System.out.println("Match \""+m.group()+"\" at " + m.start() + "-" + (m.end() - 1));
            }
        }
    }
}