package virusgame;

import virusgame.Country;
import virusgame.Disease;

import java.util.Timer;
import java.util.TimerTask;

public class Game {

    double myPeopleKilled;
    double myWorldPopulation;
    int myInfectedPopulation;
    int myGameLength = 600;
    int myCurrentGameLength = 0;
    int myPoints=0;
    int pointsCounter;
    int tick;
    boolean loseCondition = false;
    boolean winCondition = false;


    Country[] countries;

    Timer timer = new Timer();

    public Game() {

    }


    public void gameTimer(Disease disease) {
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                myCurrentGameLength += 10;

                diseaseSpread(disease);
                worldDeath(disease);
                findWorldPopulation();

                int points = getPoints(findInfectedPopulation());


                if(myCurrentGameLength == myGameLength) {
                    loseCondition = true;
                }

                if (myWorldPopulation <= 0) {
                    winCondition = true;
                }

                System.out.println("Tick: " + tick);
                System.out.println("_________________________________________________");
                System.out.println();
                displayCountries(countries);

                System.out.println(points);
                tick ++;

            }
        }, 10000, 10000);
    }


    public Country[] createCountries() {
        countries = new Country[7];
        //Do not change population
        countries[0] = new Country("Brazil", false, false, 210_000_000, 10, 0);
        countries[1] = new Country("USA", true, false, 320_000_000, 0, 0 );
        countries[2] = new Country("Canada", false, true, 37_000_000, 0, 0 );
        countries[3] = new Country("Greenland", false, true, 56_000, 0, 0);
        countries[4] = new Country("England", true, true, 66_000_000, 0, 0);
        countries[5] = new Country("China", false, false, 1_400_000_000, 0, 0);
        countries[6] = new Country("India", true, false, 1_360_000_000, 0, 0);

        return countries;
    }

    public int getMyCurrentGameLength() {
        return myCurrentGameLength;
    }

    private void diseaseSpread(Disease disease) {
        disease.setSpreadRate();
        for (int index = 0; index <= 5; index++) {
            if (countries[index].getMyInfected() > 0 && countries[index].getMyInfected() < countries[index].getMyPopulation()) {

                countries[index].spread(disease);
                if (countries[index + 1].getMyInfected() == 0.0 && countries[index + 1].getMyInfected() < countries[index + 1].getMyPopulation()) {

                    countries[index + 1].spread(disease);
                }
            }
        }
    }


    private void worldDeath(Disease disease)
    {
        disease.setDeathRate();
        for (int index=0; index <=5; index++)
        {
            countries[index].death(disease);
        }
    }

    public void displayCountries(Country[] countries) {
        for (Country c : countries) {
            System.out.println(c.toString());
        }
        System.out.println();
    }

    public int findWorldPopulation() {
        myWorldPopulation=0;
        for (Country c : countries) {
            myWorldPopulation += c.getMyPopulation();
        }
        return (int) myWorldPopulation;
    }

    public int findInfectedPopulation()
    {
        myInfectedPopulation=0;
        for(Country c : countries){
            myInfectedPopulation += c.getMyInfected();
        }
        return myInfectedPopulation;
    }

    public int getPoints(int infected){
        if (infected > 100 && pointsCounter == 0){
            myPoints ++;
            pointsCounter ++;
        }else if(infected > 10000 && pointsCounter == 1){
            myPoints ++;
            pointsCounter ++;
        }else if(infected > 10000 && pointsCounter == 2){
            myPoints ++;
            pointsCounter ++;
        }else if(infected > 50000 && pointsCounter == 3){
            myPoints ++;
            pointsCounter ++;
        }else if (infected > 100000 && pointsCounter == 4){
            myPoints ++;
            pointsCounter ++;
        }
        return myPoints;
    }


    public int myPointsDecrease()
    {
       return myPoints--;
    }
}




