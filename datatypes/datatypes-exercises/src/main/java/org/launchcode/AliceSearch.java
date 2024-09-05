package org.launchcode;

import java.util.Scanner;

public class AliceSearch {
    public static void main(String[] args) {
        String aliceExcerpt = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’";

        Scanner input;
        input = new Scanner(System.in);

        System.out.println("Enter a term to search in this excerpt");
        String searchTerm = input.nextLine();

        boolean found = aliceExcerpt.toLowerCase().contains(searchTerm.toLowerCase());

        System.out.println("Search term found: " + found);

        Integer index = aliceExcerpt.indexOf(searchTerm);
        Integer length = searchTerm.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String modifiedSentence = aliceExcerpt.replace(searchTerm, "");
        System.out.println(modifiedSentence);

        input.close();
    }
}
