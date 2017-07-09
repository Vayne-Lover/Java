public class Leaf{
    private int i = 0;

    public Leaf increase(){
        i++;
        return this;
    }

    public void print(){
        System.out.println("Result is : " + i);
    }

    public static void main(String[] args){
        Leaf f = new Leaf();
        f.increase().increase().increase().print();
    }
}