/**
 * Created by Vayne-Lover on 5/20/17.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TwoButtons {
    private JFrame frame;
    private JLabel label;

    public static void main(String[] args){
        TwoButtons tb = new TwoButtons();
        tb.go();
    }

    private void go(){
        frame = new JFrame();
        label = new JLabel("I'm a Label");
        JButton bt1 = new JButton("Change Label");
        JButton bt2 = new JButton("Change Color");
        DrawPanel3 panel = new DrawPanel3();

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        bt1.addActionListener(new LabelListener());
        bt2.addActionListener(new ColorListener());

        frame.getContentPane().add(BorderLayout.SOUTH,bt2);
        frame.getContentPane().add(BorderLayout.CENTER,panel);
        frame.getContentPane().add(BorderLayout.EAST,bt1);
        frame.getContentPane().add(BorderLayout.WEST,label);

        frame.setSize(500,500);
        frame.setVisible(true);
    }

    class LabelListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            label.setText("Oh!");
        }
    }

    class ColorListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            frame.repaint();
        }
    }
}
