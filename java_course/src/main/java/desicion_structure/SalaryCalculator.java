package desicion_structure;
import java.util.Scanner;
public class SalaryCalculator {
    public static void main(String[] args) {
        double salary = 1000;
        double bonus = 200;
        int quote = 10;

        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if (sales > quote) {
            salary = salary + bonus;
        }

        System.out.println("The employee's pay is: " + salary);
    }
}
