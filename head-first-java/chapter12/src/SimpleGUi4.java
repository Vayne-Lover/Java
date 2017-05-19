/**
 * Created by Vayne-Lover on 5/19/17.
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SimpleGUi4 implements ActionListener{
    JFrame frame;

    public static void main(String[] args){
        SimpleGUi4 gui = new SimpleGUi4();
        gui.go();
    }

    public void go(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

        JButton button = new JButton("Change colors");
        button.addActionListener(this);


        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        frame.repaint();
    }
}
