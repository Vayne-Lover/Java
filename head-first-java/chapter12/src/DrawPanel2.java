/**
 * Created by Vayne-Lover.
 * Date: 5/18/17.
 * Time: 14:12.
 */


import java.awt.*;
import javax.swing.*;

public class DrawPanel2 extends JPanel{
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        GradientPaint gradient = new GradientPaint(70, 70, Color.blue, 150, 150, Color.orange);
        
        g2d.setPaint(gradient);
        g2d.fillOval(70, 70, 100, 100);
    }

}
