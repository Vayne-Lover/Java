public class Flower{
    int petalCount = 0;
    String s = "init value";

    Flower(int petals){
        petalCount = petals;
        System.out.println("Consturctor using int, petals = " + petals);
    }

    Flower(String ss){
        s= ss;
        System.out.println("Consturctor using string, s = " + petals);
    }
}