import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Random RANDOM = new Random();
        Scanner SCANNER = new Scanner(System.in);

        int i = 0;
        System.out.println("""
                \nSzia!
                \nEzzel a programmal szorzásokat gyakorolhatsz.
                \nHány kört szeretnél játszani?
                """);
        int numberOfRounds = SCANNER.nextInt();
        int pass = 0;
        int fail = 0;

        while (i < numberOfRounds) {
            int firstNumber = RANDOM.nextInt(6) + 4;
            int secondNumber = RANDOM.nextInt(6) + 4;

            System.out.println(firstNumber + " x " + secondNumber);
            System.out.print("\nA megoldásod: ");
            int solution = SCANNER.nextInt();

            if (solution == firstNumber * secondNumber) {
                System.out.println("\nÜgyes vagy! :)");
                pass++;
            } else {
                System.out.println("\nSajnos nem sikerült :(");
                fail++;
            }

            i++;
            if (numberOfRounds - i != 0) {
                System.out.println("\nMég " + (numberOfRounds - i) + " feladat van hátra\n");
            }
        }


        System.out.println("\nKész is vagy!");
        if (fail !=0) {
            System.out.println(numberOfRounds + " feladatból " + pass + " sikerült, és " + fail + " nem sikerült.");
        }
        else System.out.println("Minden feladatot jól oldottál meg!");

        Calculation calc = new Calculation();
//        System.out.println(pass);
//        System.out.println(calc.percentage(pass, numberOfRounds));

        int result = (calc.rate(calc.percentage(pass, numberOfRounds)));
        System.out.println("A DOLGOZATOD EREDMÉNYE: " + result);
    }
}