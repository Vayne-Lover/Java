/**
 * Created by Vayne-Lover on 2/21/17.
 */
public class SimpleDotGame {
    private int numberOfHits=0;
    private int[] location;

    public void setLocation(int[] location1){
        location=location1;
    }

    public int[] getLocation(){
        return location;
    }

    public void check(String guessNumber){
        int guess=Integer.parseInt(guessNumber);
        String result="miss";
        for(int loc:location){
            if(guess==loc){
                result="hit";
                numberOfHits+=1;
                break;
            }
        }
        if(numberOfHits==location.length){
            result="Win!";
        }
        System.out.println(result);

    }
}
