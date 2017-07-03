public class Demotion{
    public void f1(char x){System.out.println("f1(char)");}
    public void f1(byte x){System.out.println("f1(byte)");}
    public void f1(short x){System.out.println("f1(short)");}
    public void f1(int x){System.out.println("f1(int)");}
    public void f1(long x){System.out.println("f1(long)");}
    public void f1(float x){System.out.println("f1(float)");}

    public void test(){
        double x = 0;
        //f1(x);
        f1((float)x);
        f1((long)x);
        f1((int)x);
        f1((short)x);
        f1((byte)x);
        f1((char)x);
    }

    public static void main(String[] args){
        Demotion demo = new Demotion();
        demo.test();
    }
}