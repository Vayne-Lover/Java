/**
 * Created by Vayne-Lover on 2/20/17.
 */
public class DogTest {
    public static void main(String[] args){
        Dog dog1=new Dog();
        dog1.setSize(10);
        System.out.println(dog1.getSize());


        Dog[] dogs=new Dog[3];

        dogs[0]=new Dog();
        dogs[1]=new Dog();
        dogs[2]=dog1;

        dogs[0].setSize(20);
        dogs[1].setSize(5);

        dogs[0].bark();
        dogs[1].bark();
        dogs[2].bark();

    }
}
