/**
 * Created by Vayne-Lover.
 * Date: 5/16/17.
 * Time: 15:50.
 */

import java.awt.*;
import javax.swing.*;

public class SimpleGUI3 {

    public static void main(String[] args){
        SimpleGUI3 gui = new SimpleGUI3();
        gui.go();
    }

    private void go(){
        JFrame frame = new JFrame();
        DrawPanel panel = new DrawPanel();
        DrawPanel1 panel1 = new DrawPanel1();

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.CENTER, panel1);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
