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

        JLabel heading = new JLabel("Welcome to my Quiz App!");
        heading.setBounds(640,170,700,50);
        heading.setFont(new Font("Times New Roman",Font.BOLD,40));
        heading.setForeground(Color.MAGENTA);
        add(heading);

        setSize(1200,800);
        setLocation(400,150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }
}
