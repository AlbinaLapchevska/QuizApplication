import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    Login() {
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);

        ImageIcon i1 =new ImageIcon("images/login.jpg");
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,700,650);
        add(image);

        JLabel heading = new JLabel("Welcome to QuizApp!");
        heading.setBounds(590,170,700,60);
        heading.setFont(new Font("Mongolian Baiti",Font.BOLD,58));
        heading.setForeground(Color.MAGENTA);
        add(heading);

        JLabel name = new JLabel("Enter your name:");
        name.setBounds(690,290,700,50);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,40));
        name.setForeground(Color.CYAN);
        add(name);

        JTextField textField = new JTextField();
        textField.setBounds(630,380,450,50);
        textField.setFont(new Font("Mongolian Baiti",Font.BOLD,28));
        add(textField);

        JButton cont = new JButton("CONTINUE");
        cont.setBounds(630,480,200,50);
        cont.setBackground(Color.MAGENTA);
        cont.setFont(new Font("Mongolian Baiti",Font.BOLD,24));
        add(cont);

        JButton exit = new JButton("EXIT");
        exit.setBounds(880,480,200,50);
        exit.setBackground(Color.MAGENTA);
        exit.setFont(new Font("Mongolian Baiti",Font.BOLD,24));
        add(exit);

        setSize(1200,800);
        setLocation(400,150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }
}
