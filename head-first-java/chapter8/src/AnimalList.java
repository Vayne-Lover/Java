/**
 * Created by Vayne-Lover on 5/9/17.
 */
public class AnimalList {

    private Animal[] animalList = new Animal[5];
    private int index = 0;

    void add(Animal ani){
        if(index < animalList.length){
            animalList[index] = ani;
            System.out.println("Animal list add at " + index);
            index += 1;
        }
    }

}
