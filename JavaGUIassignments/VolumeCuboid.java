import javax.swing.*;
import java.awt.*;

public class VolumeCuboid extends JFrame {
    JLabel length,breadth,height;
    JButton button,button1,button2;
    JTextField textField;

    public VolumeCuboid(){
        setTitle("Volume of Cuboid");
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

        height = new JLabel("Enter Height: ");
        height.setForeground(Color.BLACK);
        height.setFont(new Font("Arial",Font.BOLD,12));
        height.setBounds(200,190,200,25);
        add(height);

        textField = new JTextField();
        textField.setBounds(200,210,200,25);
        add(textField);

        button1 = new JButton(" Calculate");
        button1.setForeground(Color.BLUE);
        button1.setFont(new Font("Arial",Font.BOLD,12));
        button1.setBounds(200,240,200,25);
        add(button1);

        button2 = new JButton("Volume of Cuboid is: ");
        button2.setForeground(Color.YELLOW);
        button2.setFont(new Font("Arial",Font.BOLD,12));
        button2.setBounds(250,270,200,25);
        add(button2);


    }

    public static void main(String[] args) {
        new VolumeCuboid().setVisible(true);
    }



}