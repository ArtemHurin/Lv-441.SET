package com.academy.max.N7_Regex.hw7_1_five_words;

public class ExceptionWrongAmountOfWords extends Exception {

    public ExceptionWrongAmountOfWords() {
        System.err.println("Please enter FIVE words sentence!");
    }
}

