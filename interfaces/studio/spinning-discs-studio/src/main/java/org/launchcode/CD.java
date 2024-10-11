package main.java.org.launchcode;

import main.java.org.launchcode.BaseDisc;
import main.java.org.launchcode.OpticalDisc;

import java.util.HashMap;
import java.util.Map;

public class CD extends BaseDisc implements OpticalDisc {

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    private HashMap<String, String> songs;
    // String can be the song title, Integer can be the song length

    public CD ( String name, int capacity, String discType) {
        super(name, capacity, discType);
        this.songs = new HashMap<>();

    }

    public void addSong(String title, String duration) {
        songs.put(title, duration);

    }

    public void displayTracks() {
        for (String title : songs.keySet()) {
            System.out.println(this.name + "has a song list of" + songs.get(title));
        }
    }

   @Override
    public String spin(){
       return "I'm a " + "\n" + "\n" + discType + ".  Let's here some music!";
    }

    @Override
    public void writeData(double storage, String data) {
        this.setContent(data); //Save the data into the content field from BaseDisc
        System.out.println("Writing the album " + data + " to CD, using " + storage + "MB of storage.");
    }

    @Override
    public void reportData() {
        System.out.println("Disc " + this.name + " has a capacity of " + this.capacity + "MB");
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

   @Override
    public String toString() {
        return "CD Name: " + getName() + ", Capacity: " + getCapacity() + "MB, Type: " + getDiscType();
    }

    public String getContent() {
        return content;
    }

    public void setSongs(HashMap<String, String> songs) {
        this.songs = songs;
    }

    public HashMap<String, String> getSongs() {
        return songs;
    };


}