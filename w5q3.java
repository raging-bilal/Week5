import java.util.Scanner;
import java.util.StringTokenizer;

public class w5q3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the text input
        System.out.println("Enter the text:");
        String text = scanner.nextLine();
        
        // Count the number of words using StringTokenizer
        StringTokenizer tokenizer = new StringTokenizer(text);
        int wordCount = tokenizer.countTokens();
        
        // Count the number of sentences by splitting text using '.' as delimiter
        String[] sentences = text.split("\\.");
        int sentenceCount = sentences.length;
        
        // Count the occurrences of letter 'e' and 'z'
        int eCount = 0;
        int zCount = 0;
        for (char c : text.toCharArray()) {
            if (c == 'e' || c == 'E') {
                eCount++;
            } else if (c == 'z' || c == 'Z') {
                zCount++;
            }
        }
        
        // Print the results
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of sentences: " + sentenceCount);
        System.out.println("Number of times 'e' occurs: " + eCount);
        System.out.println("Number of times 'z' occurs: " + zCount);
        
        scanner.close();
    }
}
