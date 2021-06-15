package virusgame;

import java.util.Timer;
import java.util.TimerTask;

public class Game {

    // Collection of variables to be used in the methods in Game class
    long myWorldPopulation;
    long myInfectedPopulation;
    long myDeadPopulation;
    int myGameLength = 300;
    int myCurrentGameLength = 0;
    int myPoints = 0;
    int pointsCounter;
    int tick;
    boolean loseCondition = false;
    boolean winCondition = false;

    // Creates new array for countries
    Country[] countries;

    // Creates new timer object
    Timer timer = new Timer();


    public Game() {

    }

    // Game timer class, handles time of current game, disease spread, disease death, and game points at current time
    public void gameTimer(Disease disease) {
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                myCurrentGameLength += 5;


                diseaseSpread(disease);
                worldDeath(disease);
                findWorldPopulation();

                int points = getPoints(findInfectedPopulation());

                if (myCurrentGameLength == myGameLength) {
                    loseCondition = true;
                }

                if (findCurrentAlive() <= 0) {
                    winCondition = true;
                }

                System.out.println("Tick: " + tick);
                System.out.println("_________________________________________________");
                System.out.println();
                displayCountries(countries);

                getPoints(findInfectedPopulation());
                setMyPoints(myPoints);
                System.out.println("points="+myPoints);
                System.out.println("World population="+findWorldPopulation());

                tick++;

            }
        }, 5000, 5000);
    }

    // Constructs 7 countries into the array
    public Country[] createCountries() {
        countries = new Country[7];
        //Do not change population
        countries[0] = new Country("Brazil", false, false, 210_000_000, 10, 0);
        countries[1] = new Country("USA", true, false, 320_000_000, 0, 0);
        countries[2] = new Country("Canada", false, true, 37_000_000, 0, 0);
        countries[3] = new Country("Greenland", false, true, 56_000, 0, 0);
        countries[4] = new Country("England", true, true, 66_000_000, 0, 0);
        countries[5] = new Country("China", false, false, 1_400_000_000, 0, 0);
        countries[6] = new Country("India", true, false, 1_360_000_000, 0, 0);

        return countries;
    }

    public int getMyCurrentGameLength() {
        return myCurrentGameLength;
    } // Returns current game length, in seconds, goes up by increments of 5 because the game ticks every 5 seconds

    // Method for determining if the country next in the array should be infected, or spread to
    private void diseaseSpread(Disease disease) {
        disease.setSpreadRate();
        for (int index = 0; index <= 5; index++) {
            if (countries[index].getMyInfected() > 0 && countries[index].getMyInfected() < countries[index].getMyPopulation()) {

                countries[index].spread(disease);
                if ( countries[index + 1].getMyInfected() == 0.0 && countries[index + 1].getMyInfected() < countries[index + 1].getMyPopulation()) {

                    countries[index + 1].spread(disease);
                }
            }
        }
        if (countries[6].getMyInfected() > 0 && countries[6].getMyInfected() < countries[6].getMyPopulation()){
            countries[6].spread(disease);
        }
    }

    // Method for counting current amount of people dead in the world
    private void worldDeath(Disease disease) {
        disease.setDeathRate();
        for (Country c : countries) {
            if (c.getMyInfected() > 0 && c.getMyDead()<c.getMyPopulation()) {
                c.death(disease);
            }
        }
    }

    // Method for displaying data on countries in "countries" array
    public void displayCountries(Country[] countries) {
        for (Country c : countries) {
            System.out.println(c.toString());
        }
        System.out.println();
    }

    // Method to find the total world population
    public long findWorldPopulation() {
        myWorldPopulation = 0;
        for (Country c : countries) {
            myWorldPopulation += c.getMyPopulation();
        }
        return myWorldPopulation;
    }

    // Method to find the total of world population infected with disease
    public long findInfectedPopulation() {
        myInfectedPopulation = 0;
        for (Country c : countries) {
            myInfectedPopulation += c.getMyInfected();
        }
        return myInfectedPopulation;
    }

    // Method to find the total people dead in the world from the disease
    public long findTotalDeath() {
        myDeadPopulation = 0;
        for(Country c : countries) {
            myDeadPopulation += c.getMyDead();
        }
        return myDeadPopulation;
    }

    // Method to find the remaining people alive
    public long findCurrentAlive() {
        return (findWorldPopulation() - findTotalDeath());
    }

    // Method to determine when to give out points to the player based on the amount of people infected or killed
    public int getPoints(long infected) {
        if (infected > 100 && pointsCounter == 0) {
            myPoints++;
            pointsCounter++;
        } else if (infected > 10000 && pointsCounter == 1) {
            myPoints++;
            pointsCounter++;
        } else if (infected > 10000 && pointsCounter == 2) {
            myPoints++;
            pointsCounter++;
        } else if (infected > 50000 && pointsCounter == 3) {
            myPoints++;
            pointsCounter++;
        } else if (infected > 100000 && pointsCounter == 4) {
            myPoints++;
            pointsCounter++;
        }
        else if (infected > 500000 && pointsCounter == 5) {
            myPoints++;
            pointsCounter++;
        }
        else if (infected > 500000 && pointsCounter == 6) {
            myPoints++;
            pointsCounter++;
        }
        else if (infected > 1000000 && pointsCounter == 7) {
            myPoints++;
            myPoints++;
            pointsCounter++;
        }
        else if (infected > 100000000 && pointsCounter == 8) {
            myPoints++;
            myPoints++;
            myPoints++;
            pointsCounter++;
        }
        else if (infected > 1000000000 && pointsCounter == 9) {
            myPoints++;
            myPoints++;
            myPoints++;
            myPoints++;
            pointsCounter++;
        }
        else if (findTotalDeath() > (findWorldPopulation() / 2) && pointsCounter == 10) {
            myPoints++;
            myPoints++;
            myPoints++;
            myPoints++;
            myPoints++;
            pointsCounter++;
        }

        return myPoints;
    }


    // Decrements points by 1
    public void myPointsDecrease() {
        this.myPoints--;
    }

    // Setter method for points
    public void setMyPoints(int myPoints) {
        this.myPoints = myPoints;
    }

    // Getter method for points
    public int getMyPoints() {
        return myPoints;
    }
}




