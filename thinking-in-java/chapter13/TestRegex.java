import java.util.regex.*;

public class TestRegex{
    public static void main(String[] args){
        if (args.length < 2){
            System.out.println("Error");
            System.exit(0);
        }

        for (String arg : args){
            Pattern p = Pattern.compile(arg);
            Matcher m = p.matcher(args[0]);

            while(m.find()){
                System.out.println("Match \""+m.group()+"\" at " + m.start() + "-" + m.end() - 1);
            }
        }
    }
}