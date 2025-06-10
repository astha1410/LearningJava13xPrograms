package Maps;

import java.util.HashMap;

public class CharacterCounter {
    public static void main(String[] args) {
        String input = "Java";

        // Create a HashMap to store character counts
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Convert the string to character array
        char[] charArray = input.toCharArray();

        // Iterate through each character
        for (char c : charArray) {
            // If character is already present in the map, increment its count
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            }
            // Otherwise, add the character to the map with count 1
            else {
                charCountMap.put(c, 1);
            }
        }

        // Print the character counts
        System.out.println("Character counts in the string \"" + input + "\":");
        for (HashMap.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "' : " + entry.getValue());
        }
    }
}