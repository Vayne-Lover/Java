/**
 * Created by Vayne-Lover on 5/17/17.
 */
import java.awt.*;
import javax.swing.*;

public class DrawPanel1 extends JPanel{

    public void paintComponent(java.awt.Graphics g){
        g.fillRect(0,0, this.getWidth(), this.getHeight());

        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);

        Color color = new Color(red, green, blue);

        g.setColor(color);
        g.fillOval(70,70,100,100);
    }
}
