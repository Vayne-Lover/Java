/**
 * Created by Vayne-Lover.
 * Date: 5/15/17.
 * Time: 15:50.
 */

import javax.swing.*;
import java.awt.event.*;

public class SimpleGUI2 implements ActionListener{
    private JButton button;

    public static void main(String[] argv){
        SimpleGUI2 gui = new SimpleGUI2();
        gui.go();
    }

    private void go(){
        JFrame frame = new JFrame();
        button = new JButton("Click me!");

        button.addActionListener(this);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.setSize(300,300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event){
        button.setText("I am clicked!");
    }
}
