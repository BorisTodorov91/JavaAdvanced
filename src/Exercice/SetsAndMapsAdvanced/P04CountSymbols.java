package Exercice.SetsAndMapsAdvanced;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P04CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        TreeMap<Character, Integer> symbolMap = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (!symbolMap.containsKey(currentChar)) {
                symbolMap.put(currentChar, 1);
            } else {
                int currentOccurrence = symbolMap.get(currentChar);
                symbolMap.put(currentChar, currentOccurrence + 1);
            }

        }

        for (Map.Entry<Character, Integer> pair : symbolMap.entrySet()) {
            System.out.printf("%s: %d time/s%n", pair.getKey(), pair.getValue());
        }


    }
}
