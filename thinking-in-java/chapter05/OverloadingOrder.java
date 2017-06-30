public class OverloadingOrder{
    public static void f(int i, String s){
        System.out.println("int :" + i + ", String: " + s);
    }

    public static void f(String s, int i){
        System.out.println("String: " + s + ", int :" + i);
    }

    public static void main(String[] args){
        f(100, "str");
        f("str", 99);
    }
}