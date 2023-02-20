import javax.swing.*;
import java.awt.*;

public class Quiz extends JFrame {
    String questions[][] = new String[10][5];
    String answers[][] = new String[10][2];

    Quiz() {
        setBounds(50, 0, 1800, 1050);
        getContentPane().setBackground(new Color(16, 15, 15));
        setLayout(null);

        ImageIcon i2 = new ImageIcon("images/quiz2.jpg");
        JLabel image2 = new JLabel(i2);
        image2.setBounds(0, 0, 1700, 430);
        add(image2);

        JLabel questionNumber = new JLabel("1");
        questionNumber.setBounds(100,450,60,60);
        questionNumber.setFont(new Font("Mongolian Baiti", Font.BOLD, 28));
        questionNumber.setForeground(Color.white);
        add(questionNumber);

        JLabel question = new JLabel("This is a question");
        question.setBounds(150,450,600,60);
        question.setFont(new Font("Mongolian Baiti", Font.BOLD, 24));
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

        setVisible(true);
    }

    public static void main(String[] args) {
        new Quiz();
    }
}
