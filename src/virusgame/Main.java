package virusgame;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        System.out.println("It's going to Schmitz Test");
        Disease disease = new Disease(" ", 0, 0, true, false, true, false, false, false, false, false, false, false, false, false, false, false);
        Game game = new Game();
        Country[] countries = game.createCountries();
        game.gameTimer(disease);
        virusGUI GUI = new virusGUI(countries);
        GUI.runGUI();

        JFrame frame = new JFrame("It's Going to Schmitz");
        frame.setContentPane(new virusGUI(countries).virusPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }
}
