public class HelloApp3 {
    public static void main(String[] args) {
        // HINT 3: Check if arguments exist before accessing them
        if (args.length > 0) {
            // HINT 2: Access the first argument using args[0]
            String name = args[0];

            // HINT 4: Use string concatenation with the + operator
            // MAIN FLOW 3: Display "Hello, [name]!" to the console
            System.out.println("Hello, " + name + "!");
        } else {
            // Optional: Provide feedback if no name was provided
            System.out.println("Please provide a name as a command-line argument.");
        }
        
        // MAIN FLOW 4: App terminates
    }
}