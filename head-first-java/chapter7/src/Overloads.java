/**
 * Created by Vayne-Lover on 5/8/17.
 */
public class Overloads {
    String unique_id;

    public static int addNums(int a, int b){
        return a + b;
    }

    public static double addNums(double a, double b){
        return a + b;
    }

    public void setID(String id){
        unique_id = id;
    }

    public void setID(int id){
        unique_id = "" + id;
    }

    public void printID(){
        System.out.println(unique_id);
    }

    public static void main(String args[]){
        Overloads ol = new Overloads();
        int result1 = ol.addNums(1,5);
        System.out.println(result1);
        double result2 = ol.addNums(1.333,5.666);
        System.out.println(result2);
        ol.setID(15325);
        ol.printID();
        ol.setID("3234234");
        ol.printID();
    }
}
