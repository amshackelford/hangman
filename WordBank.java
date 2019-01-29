import java.util.Random;

public class WordBank {
  private static String[] answers = {
    "apple", "banana", "peach", "pear", "watermelon", "raspberry", "grape", "lemon", "orange", "pineapple",
    "car", "bus", "train", "trolley", "bike", "boat", "airplane", "scooter", "motorcycle", "helicoptor",
    "basketball", "football", "soccer", "hockey", "baseball", "volleyball", "boxing", "lacrosse", "wrestling", "tennis",
    "blue", "red", "green", "yellow", "white", "black", "purple", "pink", "brown","indigo",
    "america", "canada", "china", "india", "mexico", "spain", "germany", "brazil", "japan", "korea",
    "sun", "mercury", "venus", "earth", "mars", "jupiter", "saturn", "neptune", "uranus", "pluto"
  };
  
  public static String getRandomWord() {
    Random randomNum = new Random();
    int randomGenerator = randomNum.nextInt(answers.length);
    return answers[randomGenerator];
  }
}