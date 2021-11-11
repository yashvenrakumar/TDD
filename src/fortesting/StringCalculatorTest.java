
// class StringCalculatorTest {

// static StringCalculator sc = new StringCalculator();
// static Calculator2 sc2 = new Calculator2();

// public static void emptyStringReturnsZero() {
// int result = sc.add("");
// int result2 = sc.add("1");
// int result3 = sc.add("1,2");
// // assertEquals(0, result);
// System.out.println(" ___________Create a simple String calculator with a
// method signature:______");
// System.out.println(" empty string then returns : " + result);
// System.out.println(" 1 string then returns : " + result2);
// System.out.println(" 1,2 string then sum returns : " + result3);

// }

// public static void addnewline() {
// int result = sc2.add("1\n,2");
// // assertEquals(3, result);
// System.out.println(" 3 case passed : " + result);
// }

// public static void basicAddition() {
// System.out.println("A single number returns the value: " + sc.getSum(new
// String[] { "1,3" }));
// }

// // Two numbers, comma delimited, returns the sum
// public static void getBasicDelimiter() {
// String input = "//;\n1;2";

// System.out.println("when Delimiter appers : " + sc.getDelimiter(input));
// }

// public static void onePlusTwo() {
// int result = sc.add("1,2");
// // assertEquals(3, result);
// System.out.println(" :" + result);
// }

// public static void onePlusTwoPlus3() {
// int result = sc.add("1,2,3");
// // assertEquals(6, result);
// System.out.println(" :" + result);
// }

// public static void onePlusTwoWithNewLineNAndComma() {
// int result = sc.add("1\n2,3");
// // assertEquals(6, result);
// System.out.println(" :" + result);
// }

// public static void onePlusTwoWithNewLineRAndComma() {
// int result = sc.add("1\r2,3");
// // assertEquals(6, result);
// System.out.println(" :" + result);
// }

// public static void onePlusTwoWithNewLinesRandN() {
// int result = sc.add("1\r2\n3");
// // assertEquals(6, result);
// System.out.println(" :" + result);
// }

// public static void onePlusOneWithDelimiter() {
// int result = sc.add("//;\n1;1");
// // assertEquals(2, result);
// System.out.println(" :" + result);
// }

// public static void negativeNumbersThrowException() {
// // Assertions.assertThrows(IllegalArgumentException.class, () ->
// // sc.add("4,-1"));
// System.out.println(" :" + sc.add("4,-1"));
// }

// public static void exceptionMessageIsCorrectForOneNegative() {
// String message = "";
// try {
// sc.add("4,-1");
// } catch (IllegalArgumentException e) {
// message = e.getMessage();
// }
// // assertEquals("Negatives not allowed: -1 ", message);
// System.out.println(" :" + message);
// }

// public static void exceptionMessageIsCorrectForThreeNegatives() {
// String message = "";
// try {
// sc.add("4,-1,5,-6,7,-5");
// } catch (IllegalArgumentException e) {
// message = e.getMessage();
// }
// // assertEquals("Negatives not allowed: -1 -6 -5 ", message);
// System.out.println(" :" + message);
// }

// public static void adds1000() {
// int result = sc.add("1,2,1000");
// // assertEquals(1003, result);
// System.out.println(" :" + result);
// }

// public static void ignoresNumbersGreaterThan1000() {
// int result = sc.add("1,1,1001,1,2345");
// // assertEquals(3, result);
// System.out.println(" :" + result);
// }

// public static void randomLengthDelimiter() {
// String input = "//[***]\n1***2***3";
// String result = sc.getDelimiter(input);
// // assertEquals("***", result);
// System.out.println(" :" + result);
// }

// public static void defaultDelimiter() {
// String input = "1,2";
// // assertEquals("[,\n\r]", sc.getDelimiter(input));
// System.out.println("" + sc.getDelimiter(input));
// }

// // ********************driver code for testing the TDD Kata - The String
// // Calculator****************** */
// //
// // ****************************Yashvendra Kumar (Software developer
// // )******************************** */
// public static void main(String[] args) {
// emptyStringReturnsZero();
// addnewline();
// // basicAddition();
// // onePlusTwo();
// // getBasicDelimiter();
// // onePlusTwoPlus3();
// // defaultDelimiter();
// // onePlusTwoWithNewLineRAndComma();
// // onePlusTwoWithNewLinesRandN();
// // randomLengthDelimiter();
// // onePlusOneWithDelimiter();
// // exceptionMessageIsCorrectForOneNegative();
// // exceptionMessageIsCorrectForThreeNegatives();
// // adds1000();
// // ignoresNumbersGreaterThan1000();

// }

// }
