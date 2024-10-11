package main.java.org.launchcode;

import java.util.ArrayList;
import java.util.HashMap;
import main.java.org.launchcode.BaseDisc;
import main.java.org.launchcode.OpticalDisc;

public class DVD extends BaseDisc implements OpticalDisc {

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately

    private HashMap<String, String> bestScene; //Stores movie scenes and quotes

    //DVD constructor
    public DVD ( String name, int capacity, String discType) {
        super(name, capacity, discType);
        this.bestScene = new HashMap<>();
        this.capacity = capacity;
        this.discType = "DVD";
        populateMovies(); //populates movies when a DVD is created

    }

    public void populateMovies() {
            addScene("Inception", "You mustn't be afraid to dream a little bigger, darling.");
            addScene("The Matrix", "There is no spoon.");
            addScene("Pulp Fiction", "What ain't no country I ever heard of.  They speak English in what?");
            addScene("The Lord of the Rings", "One does not simply walk into Mordor.");
    }

    public void addScene(String movieTitle, String sceneQuote) {
        bestScene.put(movieTitle, sceneQuote);
    }

    public String playScene(){
        String sceneQuote = bestScene.get(this.getName());
        if (sceneQuote != null) {
            return "Now playing: " + this.getName() + ". Best scene: \"" + sceneQuote + "\"";
        } else {
            return "No scene available for " + this.getName();
        }
    }

    public String getContent() {
        return content;
    }


    @Override
    public String spin(){
        return "I'm a " + discType + ".  Ready to watch a movie?";
    }


    @Override
    public void writeData(double storage, String data) {
        populateMovies();
        ArrayList<String> movieTitles = new ArrayList<>(bestScene.keySet());

        int randomIndex = (int) (Math.random() * movieTitles.size());
        String randomMovie = movieTitles.get(randomIndex);

        this.setName(randomMovie);
        String randomQuote = bestScene.get(randomMovie);

        this.setContent("Movie: " + randomMovie + ".  Best Scene: \"" + randomQuote + "\"");


        System.out.println("Burning data \"" + data + "\" onto DVD, using " + storage + "GB of storage.");
        System.out.println("Selected Movie: " + randomMovie + ".  Best Scene: \"" + randomQuote + "\"");
    }

    @Override
    public void reportData() {
        System.out.println("Disc " + this.name + " has a capacity of " + this.capacity + "GB");
        if (!this.content.isEmpty()) {
            System.out.println("It contains the following data: " + this.content);
        } else {
            System.out.println("The disc is empty.");
        }
    }

    @Override
    public void readData() {
        System.out.println("Reading data from " + this.getName());
    }
}
