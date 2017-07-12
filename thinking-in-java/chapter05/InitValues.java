public class InitValues{
    private int num;

    InitValues(){
        num = 1;
        System.out.println("The init value is " + num);
    }

    public static void main(String[] args){
        InitValues i = new InitValues();
    }
}