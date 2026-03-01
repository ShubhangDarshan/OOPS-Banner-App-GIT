import java.util.HashMap;
import java.util.Map;

public class OOPSBannerAppU8 {

    /**
     * Creates and populates a HashMap with character patterns.
     * @return A Map where the key is the Character and value is its 7-line pattern.
     */
    public static Map<Character, String[]> getCharacterMap() {
        Map<Character, String[]> patterns = new HashMap<>();

        patterns.put('O', new String[]{
            "  *** ", " ** ** ", "** **", "** **", "** **", " ** ** ", "  *** "
        });
        patterns.put('P', new String[]{
            "****** ", "** **", "** **", "****** ", "** ", "** ", "** "
        });
        patterns.put('S', new String[]{
            " ***** ", "** ", "** ", " **** ", "    ** ", "    ** ", "***** "
        });

        return patterns;
    }

    /**
     * Renders any string message as a banner using the provided pattern map.
     * Uses Nested Loops: Outer for rows, Inner for characters.
     */
    public static void displayBanner(String message, Map<Character, String[]> patternMap) {
        for (int row = 0; row < 7; row++) {
            StringBuilder sb = new StringBuilder();
            for (char c : message.toUpperCase().toCharArray()) {
                String[] pattern = patternMap.get(c);
                if (pattern != null) {
                    sb.append(pattern[row]).append("  ");
                }
            }
            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) {
        // 1. Initialize the pattern library
        Map<Character, String[]> characterLibrary = getCharacterMap();

        // 2. Define the message to display
        String message = "OOPS";

        // 3. Render the output
        System.out.println("--- OOPS Banner (UC8: HashMap & Rendering Function) ---");
        displayBanner(message, characterLibrary);
    }
}