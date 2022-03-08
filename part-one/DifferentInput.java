import java.util.Scanner;

public class DifferentInput {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Give a string:");
    String stringInput = scanner.nextLine();

    System.out.println("Give an integer:");
    int integerInput = Integer.valueOf(scanner.nextLine());

    System.out.println("Give a double:");
    double doubleInput = Double.valueOf(scanner.nextLine());

    System.out.println("Give a boolean:");
    boolean booleanInput = Boolean.valueOf(scanner.nextLine());

    System.out.println("You gave the string " + stringInput);
    System.out.println("You gave the integer " + integerInput);
    System.out.println("You gave the double " + doubleInput);
    System.out.println("You gave the boolean " + booleanInput);
  }
}
