/**
 * Created by Vayne-Lover on 2/20/17.
 */
public class Dog {
    String name;

    public void bark(){
        System.out.println(name+" Says woo!");
    }

    public static void main(String[] args){
        Dog[] mydogs=new Dog[3];
        Dog dog1=new Dog();
        dog1.name="0";
        dog1.bark();

        mydogs[0]=new Dog();
        mydogs[1]=new Dog();
        mydogs[2]=dog1;

        mydogs[0].name="A";
        mydogs[1].name="B";

        int x=0;
        while(x<mydogs.length){
            mydogs[x].bark();
            x+=1;
        }
    }
}
