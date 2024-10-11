package org.launchcode;

import main.java.org.launchcode.CD;
import main.java.org.launchcode.DVD;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.

     CD takeMeBackToEden = new CD ("Take me Back to Eden", 100, "Album");
        takeMeBackToEden.addSong("Chokehold", "5:05");
        takeMeBackToEden.addSong("The Summoning", "10");
        takeMeBackToEden.addSong("Granite", "3:46");
        takeMeBackToEden.addSong("Aqua Regia", "3:56");
        takeMeBackToEden.addSong("Vore", "5:39");
        takeMeBackToEden.addSong("Ascensionism", "7:08");
        takeMeBackToEden.addSong("Are you Really Okay?", "5:06");
        takeMeBackToEden.addSong("The Apparition", "4:28");
        takeMeBackToEden.addSong("DYWTYLM", "4:00");
        takeMeBackToEden.addSong("Rain", "4:12");
        takeMeBackToEden.addSong("Take Me Back to Eden", "8:20");
        takeMeBackToEden.addSong("Euclid", "5:13");

        takeMeBackToEden.displayTracks();
        takeMeBackToEden.writeData(100, "Take Me Back to Eden");
        takeMeBackToEden.readData();
        takeMeBackToEden.spin();
        takeMeBackToEden.reportData();


        DVD dvd = new DVD("Movie Collection", 7000, "Movie");
        dvd.writeData(4.7, "Random Movie Data");
        dvd.readData();
        dvd.reportData();
        dvd.spin();
        dvd.playScene();

    }
}