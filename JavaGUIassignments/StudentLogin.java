import javax.swing.*;
import java.awt.*;
public class StudentLogin extends JFrame {
    JLabel labelHello;
    JButton buttonLog;
    JLabel labelUsername;
    JLabel labelPassword;
    JTextField usernameBox;
    JTextField passwordBox;
    JLabel showPass;
    Checkbox checkPass;
    JLabel newAccount;
    JButton buttonSign;

    public StudentLogin() {
        setTitle("Student Login Page");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(600,600,600,600);
        setResizable(false);
        setLayout(null);


        labelHello= new JLabel("Welcome to Login Page");
        labelHello.setForeground(Color.BLACK);
        labelHello.setFont(new Font("Arial",Font.BOLD,18));
        labelHello.setBounds(200,50,300,25);
        add(labelHello);

        labelUsername = new JLabel("Username: ");
        labelUsername.setForeground(Color.BLACK);
        labelUsername.setFont(new Font("Arial",Font.BOLD,12));
        labelUsername.setBounds(200,100,200,25);
        add(labelUsername);

        usernameBox = new JTextField();
        usernameBox.setBounds(200,120,200,25);
        add(usernameBox);

        labelPassword = new JLabel("Password: ");
        labelPassword.setForeground(Color.BLACK);
        labelPassword.setFont(new Font("Arial",Font.BOLD,12));
        labelPassword.setBounds(200,170,200,25);
        add(labelPassword);

        passwordBox = new JTextField();
        passwordBox.setBounds(200,190,200,25);
        add(passwordBox);

        showPass = new JLabel("Show Password");
        showPass.setForeground(Color.BLACK);
        showPass.setFont(new Font("Arial",Font.BOLD,9));
        showPass.setBounds(220,220,200,25);
        add(showPass);

        checkPass = new Checkbox();
        checkPass.setBounds(200,220,200,25);
        add(checkPass);

        newAccount = new JLabel("Don't have an account? Click to create.");
        newAccount.setForeground(Color.BLACK);
        newAccount.setFont(new Font("Arial",Font.BOLD,10));
        newAccount.setBounds(200,250,200,25);
        add(newAccount);

        buttonLog = new JButton("Log in");
        buttonLog.setForeground(Color.BLACK);
        buttonLog.setFont(new Font("Arial",Font.BOLD,10));
        buttonLog.setBounds(200,270,100,25);
        add(buttonLog);

        buttonSign = new JButton("Sign in");
        buttonSign.setForeground(Color.BLACK);
        buttonSign.setFont(new Font("Arial",Font.BOLD,10));
        buttonSign.setBounds(310,270,100,25);
        add(buttonSign);

    }

    public static void main(String[] args) {
        new StudentLogin().setVisible(true);
    }
}