/**
 * Created by Vayne-Lover on 5/16/17.
 */
import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel{
    public void paintComponent(java.awt.Graphics g){
        g.setColor(Color.orange);
        g.fillRect(20,50,100,100);
    }
}