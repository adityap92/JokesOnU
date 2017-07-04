package com.example;

import java.util.ArrayList;
import java.util.Random;


public class Jokes {

    ArrayList<String> jokesList;
    Random r;
    int random;

    public Jokes(){
        r = new Random();
        //add Jokes to joke list
        jokesList = new ArrayList<String>();
        jokesList.add("Yo momma");
        jokesList.add("The midget fortune teller who kills his customers is a small medium at large.");
        jokesList.add("What does a nosey pepper do? Get jalapeño business.");
        jokesList.add("If you want to catch a squirrel just climb a tree and act like a nut.");
        jokesList.add("You kill vegetarian vampires with a steak to the heart.");
    }

    public String tellJoke(){

        random = r.nextInt(jokesList.size());
        return jokesList.get(random);
    }
}
