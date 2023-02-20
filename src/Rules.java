import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules extends JFrame implements ActionListener {
    String name;
    JButton start, back;

    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);

        JLabel heading = new JLabel("Rules of QuizApp!");
        heading.setBounds(350, 30, 700, 60);
        heading.setFont(new Font("Mongolian Baiti", Font.BOLD, 56));
        heading.setForeground(Color.MAGENTA);
        add(heading);

        JLabel greeting = new JLabel(" Welcome " + name + " to QuizApp!");
        greeting.setBounds(100, 120, 700, 60);
        greeting.setFont(new Font("Mongolian Baiti", Font.BOLD, 50));
        greeting.setForeground(Color.CYAN);
        add(greeting);

        JLabel rules = new JLabel();
        rules.setBounds(50, 150, 700, 460);
        rules.setFont(new Font("Mongolian Baiti", Font.BOLD, 32));
        rules.setForeground(Color.MAGENTA);
        rules.setText("<html>" +
                "1. You will have 10 questions." + "<br><br>" +
                "2. Each question has only one correct answer. " + "<br><br>" +
                "3. Be careful and have fun. " + "<br><br>" +
                "4. Click button START to see first question." + "<br><br>" +
                "5. Click button FINISH to see result." + "<br><br>" +

                "<html>"
        );
        add(rules);

        back = new JButton("BACK");
        back.setBounds(300, 580, 200, 50);
        back.setBackground(Color.CYAN);
        back.setFont(new Font("Mongolian Baiti", Font.BOLD, 24));
        back.addActionListener(this);
        add(back);

        start = new JButton("START");
        start.setBounds(630, 580, 200, 50);
        start.setBackground(Color.CYAN);
        start.setFont(new Font("Mongolian Baiti", Font.BOLD, 24));
        start.addActionListener(this);
        add(start);

        setSize(1200, 800);
        setLocation(400, 150);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == back) {
            setVisible(false);
            new Login();

        } else if (e.getSource() == start) {
            setVisible(false);
            new Quiz();

        }
    }

    public static void main(String[] args) {
        new Rules("");
    }


}
