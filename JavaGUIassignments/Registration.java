import javax.management.MBeanAttributeInfo;
import javax.swing.*;
import javax.tools.JavaCompiler;
import java.awt.*;

public class Registration extends JFrame {
    JLabel label;
    JTextField text;
    JButton button;
    JComboBox drop;
    JRadioButton radio;
    JPasswordField password;
    public  Registration(){
        initilize();
        uiInitilize();
    }
    public  void initilize(){
        setTitle("Registration page");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(400,150,600,500);
        setResizable(false);
        setLayout(null);

        Color c= new Color(94, 75, 16);
        getContentPane().setBackground(c);
    }
    public  void uiInitilize(){
        label=new JLabel("Sign up page for Student");
        label.setForeground(Color.BLACK);
        label.setFont(new Font("Arial",Font.BOLD,25));
        label.setBounds(100,40,350,25);
        add(label);

//            usernames
        label=new JLabel("Name of student");
        label.setForeground(Color.BLACK);
        label.setFont(new Font("Arial",Font.BOLD,15));
        label.setBounds(70,100,200,25);
        add(label);
//            textbox
        text=new JTextField();
        text.setForeground(Color.black);
        text.setBounds(200,100,250,20);
        add(text);


//            Email
        label=new JLabel("Email");
        label.setForeground(Color.BLACK);
        label.setFont(new Font("Arial",Font.BOLD,15));
        label.setBounds(70,130,200,25);
        add(label);
        //            textbox
        text=new JTextField();
        text.setForeground(Color.black);
        text.setBounds(200,130,200,20);
        add(text);

//            password
        label=new JLabel("Password");
        label.setForeground(Color.BLACK);
        label.setFont(new Font("Arial",Font.BOLD,15));
        label.setBounds(70,160,200,25);
        add(label);

        //            textbox
        password=new JPasswordField();
        password.setForeground(Color.black);
        password.setBounds(200,160,200,20);
        add(password);

//gender
        label=new JLabel("Gender");
        label.setForeground(Color.BLACK);
        label.setFont(new Font("Arial",Font.BOLD,15));
        label.setBounds(70,190,200,25);
        add(label);
//            radio
        radio=new JRadioButton("Male");
        radio.setForeground(Color.black);
//            radio.setBackground(Color.YELLOW);
        radio.setBounds(200,190,90,25);
        radio.setOpaque(false);
        add(radio);

        radio=new JRadioButton("FeMale");
        radio.setForeground(Color.black);
//            radio.setBackground(Color.YELLOW);
        radio.setOpaque(false);
        radio.setBounds(290,190,90,25);
        add(radio);
//            Address
        label=new JLabel("Address");
        label.setForeground(Color.BLACK);
        label.setFont(new Font("Arial",Font.BOLD,15));
        label.setBounds(70,220,200,25);
        add(label);

        //            textbox
        text=new JTextField();
        text.setForeground(Color.black);
        text.setBounds(200,220,200,20);
        add(text);
//            phonenumber
        label=new JLabel("Phone Number");
        label.setForeground(Color.BLACK);
        label.setFont(new Font("Arial",Font.BOLD,15));
        label.setBounds(70,250,200,25);
        add(label);

        //            textbox
        text=new JTextField();
        text.setForeground(Color.black);
        text.setBounds(200,250,200,20);
        add(text);

        label=new JLabel("Batch");
        label.setForeground(Color.BLACK);
        label.setFont(new Font("Arial",Font.BOLD,15));
        label.setBounds(70,290,300,25);
        add(label);
//            Drop
        String batch[]={"Select Batch","Batch 31","Batch 32"};
        drop=new JComboBox(batch);
        drop.setForeground(Color.black);
        drop.setOpaque(false);
        drop.setBounds(200,290,200,25);
        add(drop);

//            button
        button=new JButton("Signup");
        button.setForeground(Color.WHITE);
        button.setBackground(Color.blue);
        button.setBounds(110,420,90,25);
        add(button);

        button=new JButton("Back To Login");
        button.setForeground(Color.WHITE);
        button.setBackground(Color.red);
        button.setBounds(300,420,200,25);
        add(button);
    }
    public static void main(String[] args) {
        new Registration().setVisible(true);

    }
}

