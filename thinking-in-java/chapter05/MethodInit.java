public class MethodInit{
    private int num;
    private void init(){
        return 11;
    }

    MethodInit(){
        num = init();
        System.out.println('The number is : ' + num);
    }

    public static void main(String[] args){
        MethodInit m = new MethodInit();
    }
}