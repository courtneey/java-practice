import java.util.Scanner;

public class AverageOfThreeNums {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Give the first number:");
    int firstNum = Integer.valueOf(scanner.nextLine());

    System.out.println("Give the second number:");
    int secondNum = Integer.valueOf(scanner.nextLine());

    System.out.println("Give the third number:");
    int thirdNum = Integer.valueOf(scanner.nextLine());

    System.out.println("The average is " + ((firstNum + secondNum + thirdNum) / 3.0));

  }

}
