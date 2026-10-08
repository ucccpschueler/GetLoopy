import java.util.Random;
import java.util.Scanner;

public class DieRoller {
  public static void main(String[] args) {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    String again;

    do {
      System.out.println("Roll\t\tDie1\t\tDie2\t\tDie3\t\tSum");
      System.out.println("----------------------------------------------------------");

      int roll = 1;
      while (true) {
        int die1 = random.nextInt(6) + 1;
        int die2 = random.nextInt(6) + 1;
        int die3 = random.nextInt(6) + 1;
        int sum = die1 + die2 + die3;

        System.out.printf("%4d\t\t%d\t\t%d\t\t%d\t\t%d%n", roll, die1, die2, die3, sum);

        if (die1 == die2 && die2 == die3) {
          break;
        }
        roll++;
      }

      System.out.print("Play again? [Y/N]: ");
      again = scanner.next();
    } while (again.equalsIgnoreCase("Y"));

    System.out.println("Thanks for playing!");
    scanner.close();
  }
}