public class HelloApp5 {
    public static void main(String[] args) {
        // HINT 1: Use args.length == 0 to detect missing arguments
        if (args.length == 0) {
            // MAIN FLOW 3: Default to "World"
            System.out.println("Hello, World!");
        } else {
            // HINT 3 & KEY CONCEPT 4: Use StringBuilder for efficiency
            StringBuilder namesList = new StringBuilder();

            // HINT 2 & KEY CONCEPT 3: Enhanced for loop (for-each)
            for (String name : args) {
                // HINT 4: Avoid trailing commas by checking if StringBuilder is empty
                if (namesList.length() > 0) {
                    namesList.append(", ");
                }
                namesList.append(name);
            }

            // MAIN FLOW 6: Print single greeting
            System.out.println("Hello, " + namesList.toString() + "!");
        }
        
        // MAIN FLOW 7: App terminates
    }
}