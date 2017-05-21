/**
 * Created by Vayne-Lover on 5/21/17.
 */

import javax.swing.*;
import java.awt.*;

public class SimpleAnimation {
    private int x = 70;
    private int y = 70;

    public static void main(String[] args){
        SimpleAnimation gui = new SimpleAnimation();
        gui.go();
    }

    private void go(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        DrawPanels panel = new DrawPanels();

        frame.getContentPane().add(panel);

        frame.setSize(300,300);

        frame.setVisible(true);

        for (int i = 0; i<130; i++){
            x++;
            y++;

            panel.repaint();

            try
            {
                Thread.sleep(50);
            }
            catch(Exception ex)
            {
                System.out.println(ex);
            }
        }
    }


    class DrawPanels extends JPanel{
        public void paintComponent(Graphics g){
            g.setColor(Color.white);
            g.fillOval(0,0, this.getWidth(), this.getHeight());

            g.setColor(Color.green);
            g.fillOval(x, y,40,40);
        }
    }
}
