import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.print.DocFlavor.STRING;

public class CalculatorApplication {

   public static void main(String args[])
   {
    Frame myFrame = new Frame("Calculator");

    Label l1 = new Label("First Number: ");
    Label l2 = new Label("Second Number: ");
    TextField t1 = new TextField(10);
    TextField t2 = new TextField(10);

    Button additionBtn = new Button("+");
    Button multiplicationBtn = new Button("*");
    Button subtractionBtn = new Button("-");
    Button divisionBtn = new Button("/");
    
    
    TextArea textArea = new TextArea(5,5);
    textArea.setBackground(Color.green);
    textArea.setForeground(Color.white);
    textArea.setText("jsk");

    //adding button and txtfeild components into frame 
    myFrame.add(l1);
    myFrame.add(t1);
    myFrame.add(l2);
    myFrame.add(t2);
    myFrame.add(additionBtn);
    myFrame.add(multiplicationBtn);
    myFrame.add(subtractionBtn);
    myFrame.add(divisionBtn);
    myFrame.add(textArea);
    

    myFrame.setLayout(new FlowLayout());
    myFrame.setSize(300,300);
    myFrame.setVisible(true);


    // ADDITON listner
    additionBtn.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {
        int n1 = Integer.parseInt(t1.getText().toString());
        int n2 = Integer.parseInt(t2.getText().toString());
        String result = Integer.toString(n1+n2);
        textArea.setText(result);
        }
    });

    // MULTIPLICATION listner
    multiplicationBtn.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {
        int n1 = Integer.parseInt(t1.getText().toString());
        int n2 = Integer.parseInt(t2.getText().toString());
        String result = Integer.toString(n1 * n2);
        textArea.setText(result);
        }
    });

    // SUBTRACTION listner
    subtractionBtn.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {
        int n1 = Integer.parseInt(t1.getText().toString());
        int n2 = Integer.parseInt(t2.getText().toString());
        String result = Integer.toString(n1 - n2);
        textArea.setText(result);
        }
    });

    // DIVISION listner
    divisionBtn.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {
        int n1 = Integer.parseInt(t1.getText().toString());
        int n2 = Integer.parseInt(t2.getText().toString());
        String result = Integer.toString(n1 / n2);
        textArea.setText(result);
        }
    });

    // DIVISION listner
    divisionBtn.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {
        int n1 = Integer.parseInt(t1.getText().toString());
        int n2 = Integer.parseInt(t2.getText().toString());
        String result = Integer.toString(n1 / n2);
        textArea.setText(result);
        }
    });

   }
}
