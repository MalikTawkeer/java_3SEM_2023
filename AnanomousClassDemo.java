import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.MouseEvent;

public class AnanomousClassDemo extends Frame{
    String msg="";

    public AnanomousClassDemo(){
        addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent mouseEvent){
                msg = "mouse pressed";
                repaint();                
            }            
        });
    }

    public static void main(String args[]){
        AnanomousClassDemo ananomousClassDemo =new AnanomousClassDemo();
        ananomousClassDemo.setSize(new Dimension(150,200));
        ananomousClassDemo.setVisible(true);
    }
}
