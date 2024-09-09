/**
 * Solve the FizzBuzz challenge using while loop.
 */
class FizzBuzz {

    public static void main(String[] args) {

        int i = 1; // Initialize the counter

        while (i < 100) {

            i = doFizzBuzz(i);
        }
    }

    private static int doFizzBuzz(int i) {
        // Find out which numbers divide i.
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        // Print the appropriate result.
        if (divisibleBy3 && divisibleBy5) {

            System.out.println("Fizz Buzz");

        } else if (divisibleBy3) {

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(i);

        }

        // Increment the counter to avoid an infinite loop
        i++;
        return i;
    }
}
