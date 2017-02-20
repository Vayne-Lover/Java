/**
 * Created by Vayne-Lover on 2/20/17.
 */
public class Dog {
    private int size;

    public void setSize(int s){
        size=s;
    }

    public int getSize(){
        return size;
    }

    public void bark(){
        if(size >20){
            System.out.println("AAA");
        }else if ( size > 10){
            System.out.println("BBB");
        }else{
            System.out.println("CCC");
        }
    }
}
