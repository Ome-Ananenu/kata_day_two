import java.util.Arrays;

public class SmashWords {

	public static String smash(String... words) {
    // TODO Write your code below this comment please
    String word = "";
    for(int i=0; i < words.length; i++){
      word += words[i] += " ";
    }
    return word.trim();
  }
   public static String smash2(String... words) {
    return String.join(" ", words);
  }
}