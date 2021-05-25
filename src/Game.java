import java.util.Timer;

public class Game {

    double peopleKilled;
    double worldPop;
    int cureProgress;


    public Game(){

    }

    public Country[] createCountries(){
        Country[] countries = new Country[7];
        countries[0] = new Country("USA", 2, 1, 30000000, 1);

        return countries;


    }
    public boolean winCondition() {
        if(peopleKilled - worldPop == 0) {
            return true;
        }else {
            return false;
        }
    }

    public boolean loseCondition() {
        if (cureProgress == 100) {
            return true;
        }else {
            return false;
        }
    }


}
