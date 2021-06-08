
package virusgame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    private JProgressBar deadBar;
    private JLabel coldResLabel;
    private JLabel heatResLabel;
    private JLabel cureLabel;
    private JLabel popLabel;
    private JButton transmissionButton;


    public virusGUI(Country[] countries) {

        transmissionButton.setVisible(false);



        brazilButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                countryInfectedLabel.setText("Infected: " + countries[0].getMyInfected());
                deadLabel.setText("Dead: " + countries[0].getMyDead());
                coldResLabel.setText("Cold Resistance: " + countries[0].getMyColdRes());
                heatResLabel.setText("Heat Resistance: " + countries[0].getMyHotRes());
                popLabel.setText("Population: " + countries[0].getMyPopulation());
            }
        });
        USAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                countryInfectedLabel.setText("Infected: " + countries[1].getMyInfected());
                deadLabel.setText("Dead: " + countries[1].getMyDead());
                coldResLabel.setText("Cold Resistance: " + countries[1].getMyColdRes());
                heatResLabel.setText("Heat Resistance: " + countries[1].getMyHotRes());
                popLabel.setText("Population: " + countries[1].getMyPopulation());
            }
        });
        canadaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                countryInfectedLabel.setText("Infected: " + countries[2].getMyInfected());
                deadLabel.setText("Dead: " + countries[2].getMyDead());
                coldResLabel.setText("Cold Resistance: " + countries[2].getMyColdRes());
                heatResLabel.setText("Heat Resistance: " + countries[2].getMyHotRes());
                popLabel.setText("Population: " + countries[2].getMyPopulation());
            }
        });
        greenlandButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                countryInfectedLabel.setText("Infected: " + countries[3].getMyInfected());
                deadLabel.setText("Dead: " + countries[3].getMyDead());
                coldResLabel.setText("Cold Resistance: " + countries[3].getMyColdRes());
                heatResLabel.setText("Heat Resistance: " + countries[3].getMyHotRes());
                popLabel.setText("Population: " + countries[3].getMyPopulation());
            }
        });
        englandButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                countryInfectedLabel.setText("Infected: " + countries[4].getMyInfected());
                deadLabel.setText("Dead: " + countries[4].getMyDead());
                coldResLabel.setText("Cold Resistance: " + countries[4].getMyColdRes());
                heatResLabel.setText("Heat Resistance: " + countries[4].getMyHotRes());
                popLabel.setText("Population: " + countries[4].getMyPopulation());
            }
        });
        chinaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                countryInfectedLabel.setText("Infected: " + countries[5].getMyInfected());
                deadLabel.setText("Dead: " + countries[5].getMyDead());
                coldResLabel.setText("Cold Resistance: " + countries[5].getMyColdRes());
                heatResLabel.setText("Heat Resistance: " + countries[5].getMyHotRes());
                popLabel.setText("Population: " + countries[5].getMyPopulation());
            }
        });
        indiaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                countryInfectedLabel.setText("Infected: " + countries[6].getMyInfected());
                deadLabel.setText("Dead: " + countries[6].getMyDead());
                coldResLabel.setText("Cold Resistance: " + countries[6].getMyColdRes());
                heatResLabel.setText("Heat Resistance: " + countries[6].getMyHotRes());
                popLabel.setText("Population: " + countries[6].getMyPopulation());
            }
        });
        upgradesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (transmissionButton.isVisible() == false) {
                    transmissionButton.setVisible(true);
                }
                if (transmissionButton.isVisible() == true) {
                    transmissionButton.setVisible(false);
                }
            }
        });
    }



    public void runGUI(Country[] countries) {
        JFrame frame = new JFrame("It's Going to Schmitz");
        frame.setContentPane(new virusGUI(countries).virusPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}