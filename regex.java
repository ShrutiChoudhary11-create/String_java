import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class regex {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
         Scanner sc = new Scanner(System.in);
    int testCases = sc.nextInt(); // Number of test cases
    sc.nextLine(); // Consume the newline character

    for (int i = 0; i < testCases; i++) {
        String pattern = sc.nextLine(); // Input regex pattern
        try {
            Pattern.compile(pattern); // Attempt to compile the pattern
            System.out.println("Valid");
        } catch (PatternSyntaxException e) {
            System.out.println("Invalid");
        }
    }
}
}
