public class HelloApp2 {
    public static void main(String[] args) {
        // Hint 3: Check if arguments exist before accessing them 
        // to avoid ArrayIndexOutOfBoundsException
        if (args.length > 0) {
            
            // Hint 2: Access the first argument using args[0]
            String name = args[0];
            
            // Hint 4: Use string concatenation with the + operator
            // Main Flow Step 3: App displays "Hello, [Name]!"
            System.out.println("Hello, " + name + "!");
            
        } else {
            // Optional: Handle the case where no name is provided
            System.out.println("Error: Please provide a name as a command-line argument.");
            System.out.println("Example usage: java HelloApp John");
        }
        
        // Main Flow Step 4: App terminates
    }
}