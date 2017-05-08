/**
 * Created by Vayne-Lover on 5/8/17.
 */
public class TestBoat {
    public static void main(String args[]) {
        Boat bt = new Boat();
        bt.setLength(22);
        System.out.println(bt.getLength());

        RowBoat rb = new RowBoat();
        SailBoat sb = new SailBoat();

        bt.move();
        rb.move();
        sb.move();
    }
}
