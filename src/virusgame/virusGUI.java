
package virusgame;

import virusgame.Country;
import virusgame.Disease;
import virusgame.Game;
import javax.swing.*;

public class virusGUI {
    private JPanel virusPanel;
    private JButton brazilButton;
    private JProgressBar cureBar;
    private JProgressBar infectedBar;
    private JLabel infectedLabel;
    private JLabel deadLabel;
    private JButton upgradesButton;
    private JLabel pointsLabel;
    private JProgressBar progressBar4;
    private JButton canadaButton;
    private JButton chinaButton;
    private JButton greenlandButton;
    private JButton englandButton;
    private JButton indiaButton;
    private JButton USAButton;
    private JLabel countryInfectedLabel;
    private JProgressBar progressBar1;

    public static void main(String[] args){
        System.out.println("It's going to Schmitz Test");
        Disease disease = new Disease(" ", 0, 0, true, false, true, false, false, false, false, false, false, false, false, false, false, false);
        Game game = new  Game();
        Country[] countries = game.createCountries(); //creates an array of the questions
        game.displayCountries(countries);
        game.gameTimer(disease);

        JFrame frame = new JFrame("It's Going to Schmitz");
        frame.setContentPane(new virusGUI().virusPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
//*hacker voice* I'm in
