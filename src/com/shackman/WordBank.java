package com.shackman;

// This class is used to get a random word that will be guessed during game if no arg was provided

import java.util.Random;

public class WordBank {
    private static String[] answers = {
            "apple", "banana", "peach", "pear", "watermelon", "raspberry", "grape", "lemon", "orange", "pineapple",
            "car", "bus", "train", "trolley", "bike", "boat", "airplane", "scooter", "motorcycle", "helicoptor",
            "basketball", "football", "soccer", "hockey", "baseball", "volleyball", "boxing", "lacrosse", "wrestling", "tennis",
            "blue", "red", "green", "yellow", "white", "black", "purple", "pink", "brown","indigo",
            "america", "canada", "china", "india", "mexico", "spain", "germany", "brazil", "japan", "korea",
            "sun", "mercury", "venus", "earth", "mars", "jupiter", "saturn", "neptune", "uranus", "pluto",
            "a dime a dozen", "a piece of cake", "burst your bubble", "cut to the chase","two peas in a pod","not my cup of tea", "down and out", "photo finish", "jumping the gun", "sitting ducks", "jeopardy",
            "lion", "eagle", "tiger", "elephant", "platypus", "kangaroo", "cheetah", "panda bear", "duckling", "armadillo",
            "china", "russia", "united states", "mexico", "germany", "canada", "brazil", "columbia", "denmark", "sweden",
            "cheeseburger", "spaghetti", "grilled cheese", "hot dog", "mashed potatoes", "ice cream", "biscuit", "french fries", "pancakes", "waffles"
    };

    // Returns random word from answers array that will be guessed
    public static String getRandomWord() {
        Random randomNum = new Random();
        int randomGenerator = randomNum.nextInt(answers.length);
        return answers[randomGenerator];
    }
}