/**
 * Created by Vayne-Lover on 5/16/17.
 */
import java.awt.*;
import javax.swing.*;

public class SimpleGUI3 {
    JFrame frame;

    public static void main(String[] args){
        SimpleGUI3 gui = new SimpleGUI3();
        gui.go();
    }

    public void go(){
        frame = new JFrame();
        DrawPanel panel = new DrawPanel();

        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
