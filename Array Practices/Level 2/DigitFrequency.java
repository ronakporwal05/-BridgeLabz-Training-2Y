import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = String.valueOf(number).length();
        int[] digits = new int[count];
        int[] frequency = new int[10];

        for (int i = 0; i < count; i++) {
            digits[i] = number % 10;
            frequency[digits[i]]++;
            number /= 10;
        }

        System.out.println("Digit frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + " -> " + frequency[i]);
            }
        }

        sc.close();
    }
}
