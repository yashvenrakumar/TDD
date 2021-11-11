
// public class StringCalculator {

// //
// ___________________________________________________________________________________

// public int add(String numbersWithDelimiter) throws IllegalArgumentException {
// // for the string is empty
// if (numbersWithDelimiter.isEmpty()) {
// return 0;
// }

// String delimiter = this.getDelimiter(numbersWithDelimiter);

// String numberString = numbersWithDelimiter.replaceAll("//",
// "").replaceAll("[\\[\\]]", "");
// if (!Character.isDigit(numberString.charAt(0))) {
// numberString = numberString.substring(1);
// }

// String[] numbers = numberString.split(delimiter);

// return getSum(numbers);
// }

// // ____________________Allow the Add method to handle new lines between
// numbers
// // (instead of commas).
// // 1. the following input is ok: “1\n2,3” == 6
// // 2. the following is INVALID input so do not expect it : “1,\n” (not need
// to
// // write a
// // test for it)

// public int addnewline(String text) throws IllegalArgumentException {

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

// //
// _____________________________________________________________________________
// // A single number returns the value
// public int getSum(String[] numberList) {
// int answer = 0;
// StringBuilder error = new StringBuilder();

// for (String s : numberList) {
// s = s.replace("\n", "").replace("\r", "");
// int value = Integer.parseInt(s);
// if (value < 0) {
// error.append(s).append(" ");
// } else if (value < 1001) {
// answer += value;
// }
// }
// if (error.length() > 0)
// throw new IllegalArgumentException("Negatives not allowed: " +
// error.toString());
// return answer;
// }

// //
// _______________________________________________________________________________________
// public String getDelimiter(final String input) {
// String delimiter = "[,\n\r]";
// if (input.indexOf("//[") == 0) {
// var indexOfEnd = input.indexOf("]\n");
// delimiter = input.substring("//[".length(), indexOfEnd);
// } else if (input.indexOf("//") == 0) {
// delimiter = input.substring(2, 3);
// }

// return delimiter;
// }

// //
// _________________________________________________________________________--

// private static int toInt(String number) {
// return Integer.parseInt(number);
// }

// private static String[] splitNumbers(String numbers, String divider) {
// return numbers.split(divider);
// }

// public static int sum(String[] numbers) {
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

// }
