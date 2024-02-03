import java.util.Random;

public class QuoteGenerator {
    public static void main(String[] args) {
        // Define an array of quotes
        String[] quotes = {
            "In the middle of every difficulty lies opportunity.  Albert Einstein",
            "The best way to predict the future is to create it. Abraham Lincoln",
            "Life is what happens when you are busy making other plans.  John Lennon",
            "The only limit to our realization of tomorrow will be our doubts of today. Franklin D. Roosevelt",
            "Don't cry because it's over, smile because it happened.  Dr. Seuss"
        };

        // Generate a random index
        Random random = new Random();
        int randomIndex = random.nextInt(quotes.length);

        // Display the random quote
        System.out.println("Random Quote:");
        System.out.println(quotes[randomIndex]);
    }
}