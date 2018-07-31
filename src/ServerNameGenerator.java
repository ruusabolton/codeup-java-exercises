import java.util.Arrays;

public class ServerNameGenerator {

    public static void main(String[] args) {

        //adjectives
        String[] adjectives = new String[10];
        adjectives[0] = "happy";
        adjectives[1] = "sad";
        adjectives[2] = "tired";
        adjectives[3] = "excited";
        adjectives[4] = "radiant";
        adjectives[5] = "sunny";
        adjectives[6] = "cloudy";
        adjectives[7] = "soft";
        adjectives[8] = "hard";
        adjectives[9] = "difficult";

        //nouns
        String[] nouns = new String[10];
        nouns[0] = "restaurant";
        nouns[1] = "suit";
        nouns[2] = "subject";
        nouns[3] = "element";
        nouns[4] = "toy";
        nouns[5] = "lizard";
        nouns[6] = "movie";
        nouns[7] = "car";
        nouns[8] = "laptop";
        nouns[9] = "cat";


        String randomAdj =  adjectives[(int)(Math.random() * adjectives.length)];
        String randomNoun =  nouns[(int)(Math.random() * nouns.length)];

        System.out.println("Here is your server name: \n"+ randomAdj+" - "+ randomNoun);

    }
}
