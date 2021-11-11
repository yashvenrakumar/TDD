
// public class CalculatorTest {

// public static void main(String args[]) {
// testEmptyString();
// testOneNumber();
// testTwoNumbers();
// testThreeNumbers();
// testNewLine();
// testNegativeNumver();
// testOverThousand();
// testOtherDelimiter();
// }

// public static void testEmptyString() {
// // assertEquals(0, Calculator.add(""));
// System.out.println("" + Calculator.add(""));
// }

// public static void testOneNumber() {
// // assertEquals(1, Calculator.add("1"));
// System.out.println("" + Calculator.add("1"));
// }

// public static void testTwoNumbers() {
// // assertEquals(3, Calculator.add("1,2"));
// System.out.println("" + Calculator.add("1,2"));
// }

// public static void testThreeNumbers() {
// // assertEquals(6, Calculator.add("1,2,3"));
// System.out.println("" + Calculator.add("1,2,3"));
// }

// public static void testNewLine() {
// // assertEquals(6, Calculator.add("1\n2,3"));
// System.out.println("" + Calculator.add("1\n2,3"));
// }

// public static void testNegativeNumver() {
// try {
// Calculator.add("-1,2");
// } catch (IllegalArgumentException e) {
// // assertEquals(e.getMessage(), "Negatives not allowed: -1");
// System.out.println("Negatives not allowed: -1");
// }

// try {
// Calculator.add("2,-4,3,-5");
// } catch (IllegalArgumentException e) {
// // assertEquals(e.getMessage(), "Negatives not allowed: -4,-5");
// System.out.println("Negatives not allowed: -4,-5");
// }
// }

// public static void testOverThousand() {
// // assertEquals(2, Calculator.add("1000,2"));
// System.out.println("" + Calculator.add("1000,2"));
// }

// public static void testOtherDelimiter() {
// // assertEquals(3, Calculator.add("//;\n1;2"));
// System.out.println("" + Calculator.add("//;\n1;2"));
// }
// }