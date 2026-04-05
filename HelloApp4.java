public class HelloApp4 {
    public static void main(String[] args) {
        // HINT 3 & KEY CONCEPT 5: Check args.length to see if names were provided
        if (args.length > 0) {
            
            // HINT 2: Use String.join() to combine all names with a delimiter
            // This efficiently handles commas and spaces between names
            String names = String.join(", ", args);
            
            // MAIN FLOW 6: Display single greeting with all names
            System.out.println("Hello, " + names + "!");
            
        } else {
            // MAIN FLOW 4: If no arguments exist, use the default value "World"
            System.out.println("Hello, World!");
        }

        // MAIN FLOW 7: App terminates
    }
}