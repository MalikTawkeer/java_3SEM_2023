import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseEvent;
public class MouseMotionListnerDemo extends MouseMotionAdapter{
    Frame frame;

    MouseMotionListnerDemo(){
        frame = new Frame("My Frame");
        
        frame.addMouseMotionListener(this);

        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public void mouseDragged(MouseEvent mouseEvent){
        Graphics graphics = frame.getGraphics();
        graphics.setColor(Color.red);
        graphics.fillOval(mouseEvent.getX(), mouseEvent.getY(),20,20);
    }

    public static void main(String malik[]){
        new MouseMotionListnerDemo();
    }

}