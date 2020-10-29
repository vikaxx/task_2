package ua.profitsoft;

public class Main {
    public static void main(String[] args) {
        System.out.println(interviewRecursionTest("hello"));
        System.out.println(interviewRecursionTest("healo"));
        System.out.println(interviewRecursionTest("abc"));
        System.out.println(interviewRecursionTest("oab"));
    }

    public static String interviewRecursionTest(String line) {
        return recursion(line, "");
    }

    private static String recursion(String line, String newLine) {
        if (line.isEmpty()) {
            return newLine;
        }

        char current = line.charAt(0);
        if (current == 'a' || current == 'e' || current == 'y' || current == 'u' ||
                current == 'i' || current == 'o') {
            if (newLine.length() > 0 && !(newLine.endsWith("*"))) {
                newLine = newLine + "*";
            }
            newLine = newLine + current;
            if (line.length() > 1) {
                newLine = newLine + "*";
            }
            return recursion(line.substring(1, line.length()), newLine);
        }

        newLine = newLine + current;
        return recursion(line.substring(1, line.length()), newLine);
    }

}
