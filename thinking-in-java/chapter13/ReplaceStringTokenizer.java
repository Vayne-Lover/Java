import java.util.*;

public class ReplaceStringTokenizer{
    public static void main(String[] args){
        String input = "But i'm not dead yet! I feel happy!";
        StringTokenizer stoke = new StringTokenizer(input);
        while(stoke.hasMoreElements()){
            System.out.println(stoke.nextToken()+ " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(input.split(" ")));
        Scanner scanner = new Scanner(input);
        while(scanner.hasNext()){
            System.out.println(scanner.next()+ " ");
        }
    }
}