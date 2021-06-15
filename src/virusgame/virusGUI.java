
package virusgame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class virusGUI {
    private JPanel virusPanel;
    private JButton brazilButton;
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
    private JLabel coldResLabel;
    private JLabel heatResLabel;
    private JLabel cureLabel;
    private JLabel popLabel;
    private JButton transmissionButton;
    private JButton symptomButton;
    private JLabel transmissionCostLabel;
    private JLabel symptomCostLabel;
    private JButton coldUpgrade;
    private JButton heatButton;
    private JLabel coldCost;
    private JLabel heatCost;
    private JLabel extinctionLabel;
    private JLabel worldPopulation;
    private JButton updateButton;
    Disease disease;
    Boolean hotClick = false;
    Boolean coldClick = false;
    Boolean maxTransmission = false;
    Boolean maxSymptom = false;
    int transmissionCnt = 0;
    int symptomCnt = 0;


    public virusGUI(Country[] countries, Disease disease, Game game) {

        transmissionButton.setVisible(false);
        symptomButton.setVisible(false);
        coldUpgrade.setVisible(false);
        heatButton.setVisible(false);
        transmissionCostLabel.setVisible(false);
        symptomCostLabel.setVisible(false);
        coldCost.setVisible(false);
        heatCost.setVisible(false);

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
                if (transmissionButton.isVisible()) {
                    transmissionButton.setVisible(false);
                } else if (!transmissionButton.isVisible() && !maxTransmission) {
                    transmissionButton.setVisible(true);
                }

                if (symptomButton.isVisible()) {
                    symptomButton.setVisible(false);
                } else if (!symptomButton.isVisible() && !maxSymptom) {
                    symptomButton.setVisible(true);
                }

                if (coldUpgrade.isVisible()) {
                    coldUpgrade.setVisible(false);
                } else if (!coldUpgrade.isVisible() && !coldClick) {
                    coldUpgrade.setVisible(true);
                }

                if (heatButton.isVisible()) {
                    heatButton.setVisible(false);
                } else if (!heatButton.isVisible() && !hotClick) {
                    heatButton.setVisible(true);
                }

                if (transmissionCostLabel.isVisible()) {
                    transmissionCostLabel.setVisible(false);
                } else if (!transmissionCostLabel.isVisible() && !maxTransmission) {
                    transmissionCostLabel.setVisible(true);
                }

                if (symptomCostLabel.isVisible()) {
                    symptomCostLabel.setVisible(false);
                } else if (!symptomCostLabel.isVisible() && !maxSymptom) {
                    symptomCostLabel.setVisible(true);
                }

                if (coldCost.isVisible()) {
                    coldCost.setVisible(false);
                } else if (!coldCost.isVisible() && !coldClick) {
                    coldCost.setVisible(true);
                }

                if (heatCost.isVisible()) {
                    heatCost.setVisible(false);
                } else if (!heatCost.isVisible() && !hotClick) {
                    heatCost.setVisible(true);
                }


            }
        });

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double minutes = game.getMyCurrentGameLength() / 60;
                System.out.println(game.getMyCurrentGameLength());

                pointsLabel.setText("Points: " + game.getMyPoints());
                infectedLabel.setText("Infected: " + game.findInfectedPopulation());
                extinctionLabel.setText("Dead: " + game.findTotalDeath());
                cureLabel.setText("Cure: " + minutes + " / 5 minutes");
                worldPopulation.setText("Population: "  + (game.findWorldPopulation() - game.findTotalDeath()));
            }
        });

        coldUpgrade.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (game.getMyPoints() >= 2 && disease.isMyColdResistance() && !coldClick) {
                    disease.setMyColdResistance(true);
                    game.myPointsDecrease();
                    game.myPointsDecrease();
                    coldClick = true;
                    coldUpgrade.setVisible(false);
                    coldCost.setVisible(false);
                }
            }
        });

        heatButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (game.getMyPoints() >= 1 && !disease.isMyHeatResistance() && !hotClick) {
                    disease.setMyHeatResistance(true);
                    game.myPointsDecrease();
                    hotClick = true;
                    heatButton.setVisible(false);
                    heatCost.setVisible(false);
                }
            }
        });

        transmissionButton.setText("Air");
        transmissionCostLabel.setText("Cost: 1");

        transmissionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (transmissionCnt < 5) {

                    if(transmissionCnt == 0 && game.getMyPoints() >= 1) {
                        game.myPointsDecrease();
                        disease.setMyAir(true);
                        transmissionCnt++;

                    }
                    if (transmissionCnt == 1 && game.getMyPoints() >= 2) {
                        game.myPointsDecrease();
                        game.myPointsDecrease();
                        disease.setMyBlood(true);
                        transmissionCnt++;

                    }
                    if(transmissionCnt == 2 && game.getMyPoints() >= 3) {
                        game.myPointsDecrease();
                        game.myPointsDecrease();
                        game.myPointsDecrease();
                        disease.setMyDroplet(true);
                        transmissionCnt++;

                    }
                    if(transmissionCnt == 3 && game.getMyPoints() >= 4) {
                        game.myPointsDecrease();
                        game.myPointsDecrease();
                        game.myPointsDecrease();
                        game.myPointsDecrease();
                        disease.setMyAnimal(true);
                        transmissionCnt++;

                    }
                    if(transmissionCnt == 4 && game.getMyPoints() >= 5) {
                        game.myPointsDecrease();
                        game.myPointsDecrease();
                        game.myPointsDecrease();
                        game.myPointsDecrease();
                        game.myPointsDecrease();
                        disease.setMyIngestion(true);
                        transmissionCnt++;
                    }

                    if (transmissionCnt == 1) {
                        transmissionButton.setText("Blood");
                        transmissionCostLabel.setText("Cost: 2");
                    }
                    if (transmissionCnt == 2) {
                        transmissionButton.setText("Droplet");
                        transmissionCostLabel.setText("Cost: 3");
                    }
                    if (transmissionCnt == 3) {
                        transmissionButton.setText("Animal");
                        transmissionCostLabel.setText("Cost: 4");
                    }
                    if (transmissionCnt == 4) {
                        transmissionButton.setText("Ingestion");
                        transmissionCostLabel.setText("Cost: 5");
                    }
                }else {
                    transmissionButton.setVisible(false);
                    transmissionCostLabel.setVisible(false);
                    maxTransmission = true;
                }
            }
        });

        symptomButton.setText("Runny Nose");
        symptomCostLabel.setText("Cost: 1");

        symptomButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (symptomCnt < 5) {

                    if(symptomCnt == 0 && game.getMyPoints() >= 1) {
                        game.myPointsDecrease();
                        disease.setMyRunnyNose(true);
                        symptomCnt++;
                    }
                    if (symptomCnt == 1 && game.getMyPoints() >= 2) {
                        game.myPointsDecrease();
                        game.myPointsDecrease();
                        disease.setMyCough(true);
                        symptomCnt++;

                    }
                    if(symptomCnt == 2 && game.getMyPoints() >= 3) {
                        game.myPointsDecrease();
                        game.myPointsDecrease();
                        game.myPointsDecrease();
                        disease.setMyFever(true);
                        symptomCnt++;

                    }
                    if(symptomCnt == 3 && game.getMyPoints() >= 4) {
                        game.myPointsDecrease();
                        game.myPointsDecrease();
                        game.myPointsDecrease();
                        game.myPointsDecrease();
                        disease.setMyHeadache(true);
                        symptomCnt++;

                    }
                    if(symptomCnt == 4 && game.getMyPoints() >= 5) {
                        game.myPointsDecrease();
                        game.myPointsDecrease();
                        game.myPointsDecrease();
                        game.myPointsDecrease();
                        game.myPointsDecrease();
                        disease.setMyVomiting(true);
                        disease.setMyIngestion(true);
                        symptomCnt++;
                    }

                    if (symptomCnt == 1) {
                        symptomButton.setText("Cough");
                        symptomCostLabel.setText("Cost: 2");
                    }
                    if (symptomCnt == 2) {
                        symptomButton.setText("Fever");
                        symptomCostLabel.setText("Cost: 3");
                    }
                    if (symptomCnt == 3) {
                        symptomButton.setText("Headache");
                        symptomCostLabel.setText("Cost: 4");
                    }
                    if (symptomCnt == 4) {
                        symptomButton.setText("Vomiting");
                        symptomCostLabel.setText("Cost: 5");
                    }
                }else {
                    symptomButton.setVisible(false);
                    symptomCostLabel.setVisible(false);
                    maxSymptom = true;
                }
            }
        });
    }


    public void runGUI(Country[] countries, Disease disease, Game game) {
        JFrame frame = new JFrame("It's Going to Schmitz");
        frame.setContentPane(new virusGUI(countries, disease, game).virusPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        if (game.findCurrentAlive() == 0) {
            frame.dispose();
        }

    }

}