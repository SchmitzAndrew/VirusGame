package virusgame;

public class Main {
    public static void main(String[] args) {
        System.out.println("It's going to Schmitz Test");
        Disease disease = new Disease(" ", 0, 0, false, false,  false, false, false, false, false, false, false, false, false, false, false);
        Game game = new  Game();
        Country[] countries = game.createCountries(); //creates an array of the questions
        game.displayCountries(countries); // Outputs to console the data on the countries
        game.gameTimer(disease); // Runs the game timer method which handles spread and death methods for each country to run every 5 seconds

        virusGUI GUI = new virusGUI(countries, disease, game); // Constructs the GUI using objects from every class
        GUI.runGUI(countries, disease, game); // Runs the GUI, using objects from every class
    }
}
