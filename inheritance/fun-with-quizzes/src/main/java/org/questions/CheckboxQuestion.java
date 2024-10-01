package org.questions;

public class CheckboxQuestion extends Question{

    public MultipleChoice(Sting Question, Choice[] choiceArray) {
        super(question, choiceArray);
    }

    @Override
    public String toString() {
        String newline = System.lineSeparator();
        return newline + "CHOOSE ONE:" + newline +
                getQuestion() + newline +
                getFormattedChoices();
    }
}
