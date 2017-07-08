public class Apricot{
    void peak(){System.out.println("peak()");}
    void pit(){
        System.out.println("pit()");
        this.peak();
    }
    public static void main(String[] args){
        Apricot a = new Apricot();
        a.peak();
        a.pit();
    }
}