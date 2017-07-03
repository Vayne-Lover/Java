public class PrimitiveOverloading{
    void f1(char x){System.out.println("f1(char)");}
    void f1(byte x){System.out.println("f1(byte)");}
    void f1(short x){System.out.println("f1(short)");}
    void f1(int x){System.out.println("f1(int)");}
    void f1(long x){System.out.println("f1(long)");}
    void f1(float x){System.out.println("f1(float)");}

    public void testChar(){
        char x = 'x';
        f1(x);
    }

    public void testByte(){
        byte x = 0;
        f1(x);
    }

    public void testShort(){
        short x = 0;
        f1(x);
    }

    public void testInt(){
        int x = 0;
        f1(x);
    }

    public void testLong(){
        long x = 0;
        f1(x);
    }

    public void testFloat(){
        float x = 0;
        f1(x);
    }

    public static void main(String[] args){
        PrimitiveOverloading p = new PrimitiveOverloading();
        p.testChar();
        p.testByte();
        p.testShort();
        p.testInt();
        p.testLong();
        p.testFloat();
    }
}