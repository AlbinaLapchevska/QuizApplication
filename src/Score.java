import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Score extends JFrame implements ActionListener {
    Score(String name, int score) {
        setBounds(450, 150, 1000, 700);
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);

        ImageIcon i1 = new ImageIcon("images/finish.jpg");
        JLabel image = new JLabel(i1);
        image.setBounds(0, 100, 600, 550);
        add(image);

        JLabel heading = new JLabel("Thank you " + name + " for playing!");
        heading.setBounds(75, 30, 700, 50);
        heading.setFont(new Font("Mongolian Baiti", Font.BOLD, 50));
        heading.setForeground(Color.magenta);
        add(heading);

        JLabel userscore = new JLabel("Your score is " + score);
        userscore.setBounds(550, 200, 600, 60);
        userscore.setFont(new Font("Mongolian Baiti", Font.BOLD, 50));
        userscore.setForeground(Color.CYAN);
        add(userscore);

        JButton submit = new JButton("Play Again");
        submit.setBounds(600, 370, 250, 60);
        submit.setBackground(Color.magenta);
        submit.setFont(new Font("Mongolian Baiti", Font.BOLD, 30));
        submit.addActionListener(this);
        add(submit);

        setVisible(true);
    }


    public static void main(String[] args) {
        new Score("", 0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new Login();
    }
}
