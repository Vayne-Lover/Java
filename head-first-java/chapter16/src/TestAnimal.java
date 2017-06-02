import java.util.ArrayList;

/**
 * Created by Vayne-Lover on 6/2/17.
 */

abstract class Animal{
    void eat(){
        System.out.println("Animal eating");
    }
}

class Dog extends Animal{
    void eat(){
        System.out.println("Dog eating");
    }
}

class Cat extends Animal{
    void eat(){
        System.out.println("Cat eating");
    }
}

public class TestAnimal {
    public static void take(ArrayList<? extends Animal> list){
        for(Animal a:list){
            a.eat();
        }
    }
    public static void main(String[] args){
        ArrayList<Animal> animals = new ArrayList<Animal>();

        animals.add(new Dog());
        animals.add(new Cat());

        take(animals);
    }
}
