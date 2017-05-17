/**
 * Created by Vayne-Lover.
 * Date: 5/15/17.
 * Time: 15:49.
 */

import javax.swing.*;

public class SimpleGUI1 {
    public static void main(String[] argv){
        JFrame frame = new JFrame();
        JButton button = new JButton("Click me!");

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.getContentPane().add(button);

        frame.setSize(200,200);

        frame.setVisible(true);

    }
}
