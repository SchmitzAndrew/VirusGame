import java.util.Timer;

public class Game {

    double myPeopleKilled;
    double myWorldPopulation;
    int myCureProgress;
    int myGameLength = 600;
    Country[] countries;

    Timer timer = new Timer();

    public Game(){

    }


    public Game(){

    }

    public Country[] createCountries(){
        countries = new Country[7];
        //Do not change population
        countries[0] = new Country( "Brazil", 4, 0, 210_000_000, 10);
        countries[1] = new Country("USA", 2, 1, 320_000_000, 0);
        countries[2] = new Country("Canada", 0, 4, 37_000_000, 0 );
        countries[3] = new Country("Greenland", 0, 4, 56_000, 0);
        countries[4] = new Country("England", 1, 3, 66_000_000, 0);
        countries[5] = new Country("China", 1, 1, 1_400_000_000, 0 );
        countries[6] = new Country("India", 3, 1, 1_360_000_000, 0);

        return countries;
    }

    public void diseaseSpread() {
        for (int index =0; index<=5;index++)
        {
            if (countries[index+1].getMyInfected()==0) {
                countries[index].spread(countries[index]);
                countries[index].spread(countries[index + 1]);
            }
            else {
                countries[index].spread(countries[index]);
            }

        }

    }



    public void displayCountries(Country[] countries) {
        for (Country c : countries) {
            System.out.print(c.toString());
        }
    }

    public int findWorldPopulation(Country[] countries){
        for (Country c : countries) {
            myWorldPopulation += c.getMyPopulation();
        }
        return (int) myWorldPopulation;
    }


    //Call  findWordPopulation first
    public boolean winCondition(int worldPopulation) {
        if(myWorldPopulation == 0) {
            return true;
        }else {
            return false;
        }
    }

    public boolean loseCondition() {
        if (myCureProgress == 1) {
            return true;
        }else {
            return false;
        }
    }


}
