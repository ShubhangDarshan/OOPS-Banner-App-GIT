
public class OOPSBannerAppUC7  {

    // --- Part 2: Inner Static Class ---
    /**
     * Encapsulates a character and its corresponding 7-line banner pattern.
     */
    public static class CharacterPatternMap {
        private final char character;
        private final String[] pattern;

        /**
         * @param character The character represented (e.g., 'O')
         * @param pattern   The 7-line string array representing the banner
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() { return character; }
        public String[] getPattern() { return pattern; }
    }

    // --- Part 3: Outer Class Utility Static Methods ---
    /**
     * Assembles a single row of the banner by combining patterns from multiple objects.
     * @param chars Array of CharacterPatternMap objects
     * @param rowIndex The specific line (0-6) to build
     * @return A combined string for that row
     */
    public static String buildBannerRow(CharacterPatternMap[] chars, int rowIndex) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            sb.append(chars[i].getPattern()[rowIndex]);
            if (i < chars.length - 1) {
                sb.append("  "); // Add spacing between letters
            }
        }
        return sb.toString();
    }

    // --- Part 4: Main Method ---
    public static void main(String[] args) {
        // 1. Define patterns
        String[] oPattern = {"  *** ", " ** ** ", "** **", "** **", "** **", " ** ** ", "  *** "};
        String[] pPattern = {"****** ", "** **", "** **", "****** ", "** ", "** ", "** "};
        String[] sPattern = {" ***** ", "** ", "** ", " **** ", "    ** ", "    ** ", "***** "};

        // 2. Create Instances (Encapsulation)
        CharacterPatternMap charO = new CharacterPatternMap('O', oPattern);
        CharacterPatternMap charP = new CharacterPatternMap('P', pPattern);
        CharacterPatternMap charS = new CharacterPatternMap('S', sPattern);

        // 3. Store in an Array of Objects
        CharacterPatternMap[] oops = { charO, charO, charP, charS };

        // 4. Render using StringBuilder-based logic
        System.out.println("--- OOPS Banner (UC7: Object-Oriented Approach) ---");
        for (int i = 0; i < 7; i++) {
            System.out.println(buildBannerRow(oops, i));
        }
    }
}