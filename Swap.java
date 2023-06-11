import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Swap
{
    public static void main(String args[])
    {
        Frame frame = new Frame("My Frame");

        Label l1 = new Label("First");
        Label l2 = new Label("Second");

        TextField textField = new TextField(10);
        TextField textField2 = new TextField(10);
        TextField t3 = new TextField(10);

        Button b = new Button("Done");
        b.setBackground(Color.red);

        frame.add(l1);
        frame.add(textField);
        frame.add(l2);
        frame.add(textField2);
        frame.add(b);
        frame.add(t3);

        frame.setLayout(new FlowLayout());
        frame.setSize(300,300);
        frame.setVisible(true);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String s1 = textField.getText().toString();
                String s2 = textField2.getText().toString();
                String temp = s1;
                

                textField.setText(s2);
                textField2.setText(temp);
                t3.setText(s1 +" SWAPPED WITH "+ s2);
            }            
        });
    }
}