import javax.swing.*;
import java.awt.*;

public class percentagecalc extends JFrame {
    JLabel phy, chem, bio, maths, nepali;
    JButton button, button1, button2;
    JTextField textField;

    public percentagecalc() {
        setTitle("Percentage of Academics");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(600, 600, 600, 600);
        setResizable(false);
        setLayout(null);

        phy = new JLabel("Enter physics marks: ");
        phy.setForeground(Color.BLACK);
        phy.setFont(new Font("Arial", Font.BOLD, 12));
        phy.setBounds(200, 100, 200, 25);
        add(phy);

        textField = new JTextField();
        textField.setBounds(200, 120, 200, 25);
        add(textField);

        chem = new JLabel("Enter Chemistry marks:");
        chem.setForeground(Color.BLACK);
        chem.setFont(new Font("Arial", Font.BOLD, 12));
        chem.setBounds(200, 150, 200, 25);
        add(chem);

        textField = new JTextField();
        textField.setBounds(200, 170, 200, 25);
        add(textField);

        bio = new JLabel("Enter Biology marks: ");
        bio.setForeground(Color.BLACK);
        bio.setFont(new Font("Arial", Font.BOLD, 12));
        bio.setBounds(200, 190, 200, 25);
        add(bio);

        textField = new JTextField();
        textField.setBounds(200, 210, 200, 25);
        add(textField);

        maths = new JLabel("Enter mathematics marks: ");
        maths.setForeground(Color.BLACK);
        maths.setFont(new Font("Arial", Font.BOLD, 12));
        maths.setBounds(200, 230, 200, 25);
        add(maths);

        textField = new JTextField();
        textField.setBounds(200, 250, 200, 25);
        add(textField);

        nepali = new JLabel("Enter nepali marks: ");
        nepali.setForeground(Color.BLACK);
        nepali.setFont(new Font("Arial", Font.BOLD, 12));
        nepali.setBounds(200, 280, 200, 25);
        add(nepali);

        textField = new JTextField();
        textField.setBounds(200, 300, 200, 25);
        add(textField);

        button1 = new JButton(" Calculate");
        button1.setForeground(Color.BLUE);
        button1.setFont(new Font("Arial", Font.BOLD, 12));
        button1.setBounds(200, 330, 200, 25);
        add(button1);

        button2 = new JButton("Total Percentage: ");
        button2.setForeground(Color.BLUE);
        button2.setFont(new Font("Arial", Font.BOLD, 12));
        button2.setBounds(200, 370, 200, 25);
        add(button2);

    }

    public static void main(String[] args) {

        new PerOf5sub().setVisible(true);

    }
}