/**
 * Created by Vayne-Lover on 5/22/17.
 */

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Box implements Serializable {
    private int width;
    private int height;

    private void setWidth(int w){
        width = w;
    }

    private void setHeight(int h){
        height = h;
    }

    public static void main(String[] args){
        Box box = new Box();
        box.setHeight(10);
        box.setWidth(20);

        try{
            FileOutputStream fs = new FileOutputStream("foo.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(box);
            os.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }

}
