public class Flower{
    int petalCount = 0;
    String s = "init value";

    Flower(int petals){
        petalCount = petals;
        System.out.println("Consturctor using int, petals = " + petals);
    }

    Flower(String ss){
        s= ss;
        System.out.println("Consturctor using string, s = " + ss);
    }

    Flower(String ss, int petals){
        this(petals);
        this.s = ss;
        System.out.println("Consturctor using string and int , s = " + ss + ",petasl = " + petals);
    }

    Flower(){
        this("hi", 47);
        System.out.println("Default consturctor!");
    }

    public static void main(String[] args){
        Flower x = new Flower();
    }
}