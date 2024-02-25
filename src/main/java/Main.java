package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write something");
        String input = scanner.nextLine();
        int length = input.length();
        if (length == 0) {
            System.out.println("Empty");
            return;
        }
        if (length == 1) {
            System.out.println(input);
            return;
        }
        System.out.println(generateAllPossibleDotSeparatedStrings(input));
    }
    private static List<String> generateAllPossibleDotSeparatedStrings(String input) {
        ArrayList<String> list = new ArrayList<>();
        generateAllPossibleDotSeparatedStringsRecursive(input, 0, "", list);
        return list;
    }
    private static void generateAllPossibleDotSeparatedStringsRecursive(String input, int index, String current, List<String> list) {
        if (index == input.length()) {
            list.add(current);
            return;
        }
        generateAllPossibleDotSeparatedStringsRecursive(input, index + 1, current + input.charAt(index), list);
         if (index > 0) {
            generateAllPossibleDotSeparatedStringsRecursive(input, index + 1, current + "." + input.charAt(index), list);
        }
    }
}
