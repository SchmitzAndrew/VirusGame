package virusgame;

import javax.swing.*;

public class endScreen extends Game {
    private JPanel panel1;
    private JLabel winLabel;
    private JLabel loseLabel;

    public void runEndScreen() {
        JFrame frame = new JFrame("It's Going to Schmitz");
        frame.setContentPane(new endScreen().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }
}
