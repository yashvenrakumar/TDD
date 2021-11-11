import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
    int addCalledCount = 0;

    public int add(String numbers) { // TDD Kata 1 - String Calculator
                                     // for example “” == 0 , “1” == 1 , “1,2” == 3
        addCalledCount++;
        if (numbers.equals(""))
            return 0;
        String customDelimiter;
        if (numbers.startsWith("//")) {
            customDelimiter = getCustomDelimiter(numbers);
            int newLineIndex = numbers.indexOf('\n');
            numbers = numbers.substring(newLineIndex + 1);
        } else
            customDelimiter = "";
        // 1. the following input is ok: “1\n2,3” == 6
        // 2. the following is INVALID input so do not expect it : “1,\n” (not need to
        // write a
        // “//[delimiter]\n[numbers...]”
        // for example
        // “//;\n1;2” == 3
        // since the default delimiter is ‘;’ .
        String[] sNumbers = numbers.split(",|\n" + customDelimiter);
        int count = 0;
        List<String> negativeNumbers = new ArrayList<>();
        for (String v : sNumbers) {
            int number = Integer.parseInt(v.trim());
            if (number < 0)
                negativeNumbers.add(v.trim());
            if (number <= 1000)
                count += number;
        }
        // 5. Calling Add with a negative number will throw an exception “negatives not
        // allowed” -
        // and the negative that was passed.

        // 6. If there are multiple negatives, show all of them in the exception message
        if (negativeNumbers.size() > 0)
            throw new IllegalArgumentException("Negatives not allowed"
                    + (negativeNumbers.size() > 1 ? (" " + String.join(",", negativeNumbers)) : ""));
        return count;
    }

    private String getCustomDelimiter(String numbers) {
        String delimiterString = numbers.substring(2, numbers.indexOf("\n"));
        List<String> delimiters = new ArrayList<>();
        if (delimiterString.contains("[")) {
            while (delimiterString.length() > 0) {
                int cursor = delimiters.indexOf("[") + 1;
                int endIndex = delimiterString.indexOf("]");
                delimiters.add(delimiterString.substring(cursor + 1, endIndex));
                delimiterString = delimiterString.substring(endIndex + 1);
            }
        } else {
            delimiters.add(delimiterString);
        }
        return "|" + String.join("|", delimiters).replace("*", "\\*").replace("%", "\\%");
    }

    // 7. Using TDD, Add a method to StringCalculator
    // called public int GetCalledCount()
    // that returns how many times Add() was invoked.
    // Remember - Start with a failing (or even non compiling) test.
    public int getCalledCount() {
        return addCalledCount;
    }
}
