import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("Введите выражение. Аргументы и знак должны быть разделены пробелом");
        System.out.println("Программа принимает арабские и римские числа");
        System.out.println("Числа от 0 до 10 включительно и от I до X включительно");
		System.out.println(" ");
        System.out.println("Enter an expression. Arguments and sign must be separated by a space");
        System.out.println("The program accepts Arabic and Roman numbers");
        System.out.println("Numbers from 0 to 10 inclusive and from I to X inclusive");

        try (Scanner sc = new Scanner(System.in)) {
            String result = new Calculator().calculate(sc.nextLine().trim().split(" "));
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Введены неверные данные");
        }

    }

}
