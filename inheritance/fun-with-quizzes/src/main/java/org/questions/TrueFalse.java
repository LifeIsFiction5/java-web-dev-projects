package org.questions;

public class TrueFalse extends Question {

    public MultipleChoice(Sting Question, Choice[] choiceArray) {
        super(question, choiceArray);
    }

    @Override
    public String toString() {
        String newline = System.lineSeparator();
        return newline + "TRUE OR FALSE:" + newline +
                getQuestion() + newline +
                getFormattedChoices();
    }
}
