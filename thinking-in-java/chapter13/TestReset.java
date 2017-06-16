import java.util.regex.*;

public class TestReset{
    public static void main(String[] args){
        String str1 = "fix the rug with bags";
        String str2 = "fix the rig with rags";

        Matcher m = Pattern.compile("[frb][aiu][gx]").matcher(str1);

        while(m.find()){
            System.out.print(m.group() + " ");
        }
        System.out.println();

        m.reset(str2);

        while(m.find()){
            System.out.print(m.group() + " ");
        }
        System.out.println();
    }
}