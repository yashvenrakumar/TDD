// package fortesting;

// public class Calculator {
// public static int count = 0;

// public static int add(String text) {
// count++;
// if (text.equals("")) {
// return 0;
// } else {
// String delimiter = ",";
// if (text.matches("//(.*)\n(.*)")) {
// delimiter = Character.toString(text.charAt(2));
// text = text.substring(4);
// }

// String numList[] = splitNumbers(text, delimiter + "|\n");
// return sum(numList);
// }
// }

// private static int toInt(String number) {
// return Integer.parseInt(number);
// }

// private static String[] splitNumbers(String numbers, String divider) {
// return numbers.split(divider);
// }

// private static int sum(String[] numbers) {
// int total = 0;
// String negString = "";

// for (String number : numbers) {
// if (toInt(number) < 0) {
// if (negString.equals(""))
// negString = number;
// else
// negString += ("," + number);
// }
// if (toInt(number) < 1000)
// total += toInt(number);
// }

// if (!negString.equals("")) {
// throw new IllegalArgumentException("Negatives not allowed: " + negString);
// }

// return total;
// }

// // 7. Using TDD, Add a method to StringCalculator
// // called public int GetCalledCount()
// // that returns how many times Add() was invoked.
// // Remember - Start with a failing (or even non compiling) test.
// public static int GetCalledCount() {
// return count;

// }
// //
// _________________________________________________________________________________________

// // 8 (.NET Only) Using TDD, Add an event to the StringCalculator class named
// // public event Action<string, int> AddOccured ,
// // that is triggered after every Add() call.

// // Hint:
// // Create the event declaration first:
// // then write a failing test that listens to the event
// // and proves it should have been triggered when calling Add().
// // Hint 2:
// // Example:
// // string giveninput = null;
// // sc.AddOccured += delegate(string input,
// // int result)
// // {
// // giveninput = input;
// // };
// //
// ______________________________________________________________________________________

// // 9. Numbers bigger than 1000 should be ignored, for example: 2 + 1001 == 2
// //
// _________________________________________________________________________________

// // 10. Delimiters can be of any length with the following format:
// // “//[delimiter]\n”
// // for example:
// // “//[***]\n1***2***3” == 6
// //
// __________________________________________________________________________________________

// // 11. Allow multiple delimiters like this: “//[delim1][delim2]\n”
// // for example
// // “//[*][%]\n1*2%3” == 6.
// //
// _________________________________________________________________________________________

// // 12. make sure you can also handle multiple delimiters with length longer
// than
// // one char for example
// // “//[**][%%]\n1**2%%3” == 6.
// //
// _____________________________________________________________________________________________

// }