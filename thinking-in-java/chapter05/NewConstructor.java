class Bird{
    Bird(int i){}
    Bird(float i, int j){}
}

public class NewConstructor{
    public static void main(String[] args){
        Bird a1 = new Bird(1.0f, 3);
        Bird a2 = new Bird(38);
    }
}