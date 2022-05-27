import javax.swing.*;
import java.awt.*;

public class AreaRectangle extends JFrame {
    JLabel length, breadth, Area;
    JTextField textField;
    JButton button1, button2;

    public AreaRectangle(){
        setTitle("Area of Rectangle");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(600,600,600,600);
        setResizable(false);
        setLayout(null);

        length = new JLabel("Enter length: ");
        length.setForeground(Color.BLACK);
        length.setFont(new Font("Arial",Font.BOLD,12));
        length.setBounds(200,100,200,25);
        add(length);

        textField = new JTextField();
        textField.setBounds(200,120,200,25);
        add(textField);

        breadth = new JLabel("Enter Breadth:");
        breadth.setForeground(Color.BLACK);
        breadth.setFont(new Font("Arial",Font.BOLD,12));
        breadth.setBounds(200,150,200,25);
        add(breadth);

        textField = new JTextField();
        textField.setBounds(200,170,200,25);
        add(textField);

        button1 = new JButton(" Calculate");
        button1.setForeground(Color.BLUE);
        button1.setFont(new Font("Arial",Font.BOLD,12));
        button1.setBounds(200,200,200,25);
        add(button1);

        button2 = new JButton("Area of Rectangle is: ");
        button2.setForeground(Color.YELLOW);
        button2.setFont(new Font("Arial",Font.BOLD,12));
        button2.setBounds(250,230,200,25);
        add(button2);



    }

    public static void main(String[] args) {
        new AreaRectangle().setVisible(true);
    }

}