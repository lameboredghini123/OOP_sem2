import javax.swing.*;
import java.awt.*;

public class SimpleInterest extends JFrame {
    JLabel principal, time, rate;
    JButton button, button1, button2;
    JTextField textField;

    public SimpleInterest() {
        setTitle("Simple Interest");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(600, 600, 600, 600);
        setResizable(false);
        setLayout(null);

        principal = new JLabel("Enter the Principal: ");
        principal.setForeground(Color.BLUE);
        principal.setFont(new Font("Arial", Font.BOLD, 12));
        principal.setBounds(200, 100, 200, 25);
        add(principal);

        textField = new JTextField();
        textField.setBounds(200, 120, 200, 25);
        add(textField);

        time = new JLabel("Enter The Time:");
        time.setForeground(Color.BLUE);
        time.setFont(new Font("Arial", Font.BOLD, 12));
        time.setBounds(200, 150, 200, 25);
        add(time);

        textField = new JTextField();
        textField.setBounds(200, 170, 200, 25);
        add(textField);

        rate = new JLabel("Enter The Rate: ");
        rate.setForeground(Color.BLUE);
        rate.setFont(new Font("Arial", Font.BOLD, 12));
        rate.setBounds(200, 190, 200, 25);
        add(rate);

        textField = new JTextField();
        textField.setBounds(200, 210, 200, 25);
        add(textField);

        button1 = new JButton(" Execute Calculation");
        button1.setForeground(Color.BLUE);
        button1.setFont(new Font("Arial", Font.BOLD, 12));
        button1.setBounds(200, 240, 200, 25);
        add(button1);

        button2 = new JButton("Simple Interest: ");
        button2.setForeground(Color.BLUE);
        button2.setFont(new Font("Arial", Font.BOLD, 12));
        button2.setBounds(250, 270, 200, 25);
        add(button2);


    }

    public static void main(String[] args) {

        new SI().setVisible(true);

    }
}