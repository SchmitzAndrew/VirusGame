

public class Main {
    public static void main(String[] args){
        System.out.println("It's going to Schmitz");
        Disease disease = new Disease(" ", 0, 0, false, false, true, false, false, false, false, false, false, false, false, false, false, false);
        Game game = new  Game();
        Country[] countries = game.createCountries(); //creates an array of the questions
        game.displayCountries(countries);
    }

}


