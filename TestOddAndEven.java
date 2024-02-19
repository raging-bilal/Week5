import java.util.Scanner;

class OddAndEven {
    private int countOfOdd;
    private int countOfEven;

    public OddAndEven() {
        countOfOdd = 0;
        countOfEven = 0;
    }

    public void addNumber(int number) {
        if (number % 2 == 0) {
            countOfEven++;
        } else {
            countOfOdd++;
        }
    }

    @Override
    public String toString() {
        return "Number of Odd: " + countOfOdd + ", Number of Even: " + countOfEven;
    }
}

public class TestOddAndEven {
    public static void main(String[] args) {
        OddAndEven oddAndEven = new OddAndEven();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers (type 'Q' to quit):");
        while (scanner.hasNext()) {
            String input = scanner.next();
            if (input.equalsIgnoreCase("Q")) {
                break;
            }
            try {
                int number = Integer.parseInt(input);
                oddAndEven.addNumber(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or 'Q' to quit.");
            }
        }

        System.out.println(oddAndEven);
        scanner.close();
    }
}
