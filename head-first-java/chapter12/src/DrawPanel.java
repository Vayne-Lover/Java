/**
 * Created by Vayne-Lover.
 * Date: 5/16/17.
 * Time: 15:50.
 */

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel{
    public void paintComponent(java.awt.Graphics g){
        g.setColor(Color.orange);
        g.fillRect(20,50,100,100);
    }
}
