public class HelloApp6 {
    public static void main(String[] args) {
        // HINT 1: Detect missing arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // KEY CONCEPT 2: Use StringBuilder for efficiency
            StringBuilder nameBuilder = new StringBuilder();

            // HINT 2: Enhanced for loop
            for (String name : args) {
                // HINT 3: Always append the delimiter after each name
                nameBuilder.append(name).append(", ");
            }

            // MAIN FLOW 6 & HINT 4: Use substring() to remove the trailing ", "
            // The last two characters are the comma (,) and space ( )
            String finalNames = "";
            
            // HINT 5: Check length before calling substring to avoid errors
            if (nameBuilder.length() > 0) {
                finalNames = nameBuilder.substring(0, nameBuilder.length() - 2);
            }

            // MAIN FLOW 7: Print the final greeting
            System.out.println("Hello, " + finalNames + "!");
        }
    }
}