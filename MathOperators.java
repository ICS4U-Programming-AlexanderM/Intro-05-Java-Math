/**
* This program does math and prints results.
*
* @author  Alexander Matheson
* @version 1.0
* @since   2023-02-07
*/

public final class MathOperators {

    /**
    * For style checker.
    *
    * @exception IllegalStateException Utility class.
    * @see IllegalStateException
    */
    private MathOperators() {
        throw new IllegalStateException("Utility class");
    }

    /**
    * Print messages.
    *
    * @param args Unused
    */
    public static void main(String[] args) {
        // Addition
        System.out.println("3 + 4 = " + (4 + 3));
        // Subtraction
        System.out.println("9 - 4 = " + (9 - 4));
        // Multiplication
        System.out.println("2 * 3 = " + (2 * 3));
        // Division
        System.out.println("6 / 2 = " + (6 / 2));
        // Division with decimals
        System.out.println("1 / 3 = " + (1d / 3d));
        // Exponent
        System.out.println("2 ^ 2 = " + (Math.pow(2, 2)));
        // Exponent 2
        System.out.println("2 ^ 3 = " + (Math.pow(2, 3)));
        // Square root
        System.out.println("sqrt(9) = " + (Math.sqrt(9)));
    }
}
