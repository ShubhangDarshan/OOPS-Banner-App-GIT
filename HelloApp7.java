public class HelloApp7 {
    public static void main(String[] args) {
        // HINT 1: Use args.length == 0 to detect missing arguments
        if (args.length == 0) {
            // MAIN FLOW 3: Default value fallback
            System.out.println("Hello, World!");
        } else {
            // MAIN FLOW 4 & HINT 2: Use String.join() for automatic concatenation
            // This method takes (delimiter, array/elements)
            String names = String.join(", ", args);

            // MAIN FLOW 5: Print the greeting
            System.out.println("Hello, " + names + "!");
        }
        
        // MAIN FLOW 6: App terminates
    }
}