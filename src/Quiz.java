import javax.swing.*;
import java.awt.*;

public class Quiz extends JFrame {
    String questions[][] = new String[10][5];
    String answers[][] = new String[10][2];
    JLabel questionNumber, question;
    JRadioButton opt1, opt2, opt3, opt4;
    public static int timer = 15;

    Quiz() {
        setBounds(50, 0, 1800, 1050);
        getContentPane().setBackground(new Color(16, 15, 15));
        setLayout(null);

        ImageIcon i2 = new ImageIcon("images/quiz2.jpg");
        JLabel image2 = new JLabel(i2);
        image2.setBounds(0, 0, 1700, 430);
        add(image2);

        questionNumber = new JLabel();
        questionNumber.setBounds(100, 550, 60, 60);
        questionNumber.setFont(new Font("Mongolian Baiti", Font.BOLD, 30));
        questionNumber.setForeground(Color.white);
        add(questionNumber);

        question = new JLabel();
        question.setBounds(140, 550, 600, 60);
        question.setFont(new Font("Mongolian Baiti", Font.BOLD, 30));
        question.setForeground(Color.white);
        add(question);

        questions[0][0] = "How many minutes are in a full week?";
        questions[0][1] = "3 600";
        questions[0][2] = "10 080";
        questions[0][3] = "8 960";
        questions[0][4] = "9 600";

        questions[1][0] = "How many elements are in the periodic table? ";
        questions[1][1] = "110";
        questions[1][2] = "98";
        questions[1][3] = "118";
        questions[1][4] = "151";

        questions[2][0] = "What is the 4th letter of the Greek alphabet?";
        questions[2][1] = "Alfa";
        questions[2][2] = "Delta";
        questions[2][3] = "Gamma";
        questions[2][4] = "Epsilon";

        questions[3][0] = "Which planet has the most moons?";
        questions[3][1] = "Earth";
        questions[3][2] = "Venus";
        questions[3][3] = "Mercury";
        questions[3][4] = "Saturn";

        questions[4][0] = "What Netflix show had the most streaming views in 2021? ";
        questions[4][1] = "Squid Game";
        questions[4][2] = "Sex Education";
        questions[4][3] = "Sherlock Holmes";
        questions[4][4] = "Rockstar";

        questions[5][0] = "In what country is the Chernobyl nuclear plant located?";
        questions[5][1] = "Ukraine";
        questions[5][2] = "Poland";
        questions[5][3] = "Russia";
        questions[5][4] = "Belarus";

        questions[6][0] = "What is the largest Spanish-speaking city in the world?";
        questions[6][1] = "Madrid";
        questions[6][2] = "Sevillia";
        questions[6][3] = "Mexico City";
        questions[6][4] = "Lisbon";

        questions[7][0] = "What city is known as \"The Eternal City\"?";
        questions[7][1] = "Paris";
        questions[7][2] = "Berlin";
        questions[7][3] = "New York";
        questions[7][4] = "Rome";

        questions[8][0] = "Who was the Ancient Greek God of the Sun?";
        questions[8][1] = "Apollo";
        questions[8][2] = "Zeus";
        questions[8][3] = "Ares";
        questions[8][4] = "Poseidon";

        questions[9][0] = "What country has won the most World Cups?";
        questions[9][1] = "France";
        questions[9][2] = "Brazil";
        questions[9][3] = "Germany";
        questions[9][4] = "USA";

        answers[0][1] = "10 080";
        answers[1][1] = "118";
        answers[2][1] = "Delta";
        answers[3][1] = "Saturn";
        answers[4][1] = "Squid Game";
        answers[5][1] = "Ukraine";
        answers[6][1] = "Mexico City";
        answers[7][1] = "Rome";
        answers[8][1] = "Apollo";
        answers[9][1] = "Brazil";

        opt1 = new JRadioButton();
        opt1.setBounds(170, 620, 400, 30);
        opt1.setBackground(new Color(16, 15, 15));
        opt1.setForeground(Color.white);
        opt1.setFont(new Font("Mongolian Baiti", Font.BOLD, 28));
        add(opt1);

        opt2 = new JRadioButton();
        opt2.setBounds(170, 690, 400, 30);
        opt2.setBackground(new Color(16, 15, 15));
        opt2.setForeground(Color.white);
        opt2.setFont(new Font("Mongolian Baiti", Font.BOLD, 28));
        add(opt2);

        opt3 = new JRadioButton();
        opt3.setBounds(170, 720, 400, 30);
        opt3.setBackground(new Color(16, 15, 15));
        opt3.setForeground(Color.white);
        opt3.setFont(new Font("Mongolian Baiti", Font.BOLD, 28));
        add(opt3);

        opt4 = new JRadioButton();
        opt4.setBounds(170, 770, 400, 30);
        opt4.setBackground(new Color(16, 15, 15));
        opt4.setForeground(Color.white);
        opt4.setFont(new Font("Mongolian Baiti", Font.BOLD, 28));
        add(opt4);

        ButtonGroup groupoptions = new ButtonGroup();
        groupoptions.add(opt1);
        groupoptions.add(opt2);
        groupoptions.add(opt3);
        groupoptions.add(opt4);

        JButton next = new JButton("NEXT");
        next.setBounds(750, 580, 200, 60);
        next.setBackground(Color.CYAN);
        next.setFont(new Font("Mongolian Baiti", Font.BOLD, 24));
        add(next);

        JButton hint = new JButton("HINT 50/50");
        hint.setBounds(750, 680, 200, 60);
        hint.setBackground(Color.YELLOW);
        hint.setFont(new Font("Mongolian Baiti", Font.BOLD, 24));
        add(hint);

        JButton submit = new JButton("SUBMIT");
        submit.setBounds(750, 780, 200, 60);
        submit.setBackground(Color.MAGENTA);
        submit.setFont(new Font("Mongolian Baiti", Font.BOLD, 24));
        submit.setEnabled(false);
        add(submit);

        start(0);

        setVisible(true);
    }

    private void start(int i) {
        questionNumber.setText("" + i + 1 + " . ");
        question.setText(questions[i][0]);
        opt1.setText(" " + questions[i][1]);
        opt2.setText(" " + questions[i][2]);
        opt3.setText(" " + questions[i][3]);
        opt4.setText(" " + questions[i][4]);
    }

    public void paint(Graphics g) {
        super.paint(g);
        String time = "TIME LEFT: " + timer + " seconds";
        g.setColor(Color.WHITE);
        g.setFont(new Font("Mongolian Baiti", Font.BOLD, 32));
        if (timer > 0) {
            g.drawString(time, 1100, 750);
        }
        else {
            g.drawString("TIME HAS PASSED!", 1100, 750);
        }
        timer--;
        try {
            Thread.sleep(1000);
            repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Quiz();
    }
}
