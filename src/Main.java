import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Random RANDOM = new Random();
        Scanner SCANNER = new Scanner(System.in);

        int i = 0;
        System.out.println("Hány kört szeretnél játszani?");
        int numberOfRounds = SCANNER.nextInt();

        while (i < numberOfRounds) {
            int firstNumber = RANDOM.nextInt(5) + 5;
            int secondNumber = RANDOM.nextInt(5) + 5;

            System.out.println(firstNumber + " x " + secondNumber);
            System.out.println("A megoldás:");
            int solution = SCANNER.nextInt();

            if (solution == firstNumber * secondNumber)
                System.out.println("Ügyes vagy! :)");
            else System.out.println("Sajnos nem sikerült :(");

            i++;
        }
    }
}