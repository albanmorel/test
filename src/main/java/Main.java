import java.nio.charset.Charset;
import java.util.Scanner;


public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in, Charset.defaultCharset());
    boolean exit = false;
    while (!exit) {
      System.out.println("Choose action : ");
      System.out.println("1: Add");
      System.out.println("2: Sub");
      System.out.println("3: Multiplie");
      System.out.println("4: Divide");
      System.out.println("5: IsEven");
      System.out.println("6: IsPrime");
      System.out.println("Any: Exit");

      String choice = input.nextLine();

      Calculator calc = new Calculator();
      int value1;
      int value2;
      switch (choice) {
        case "1":
          System.out.print("Value 1 :");
          value1 = input.nextInt();
          System.out.print("\nValue 2 :");
          value2 = input.nextInt();
          System.out.println(calc.add(value1, value2));
          break;
        case "2":
          System.out.print("Value 1 :");
          value1 = input.nextInt();
          System.out.print("\nValue 2 :");
          value2 = input.nextInt();
          System.out.println(calc.subtract(value1, value2));
          break;
        case "3":
          System.out.print("Value 1 :");
          value1 = input.nextInt();
          System.out.print("\nValue 2 :");
          value2 = input.nextInt();
          System.out.println(calc.multiplie(value1, value2));
          break;
        case "4":
          System.out.print("Value 1 :");
          value1 = input.nextInt();
          System.out.print("\nValue 2 :");
          value2 = input.nextInt();
          System.out.println(calc.divide(value1, value2));
          break;
        case "5":
          System.out.print("Value :");
          value1 = input.nextInt();
          System.out.println(calc.isEven(value1));
          break;
        case "6":
          System.out.print("Value :");
          value1 = input.nextInt();
          System.out.println(calc.isPrime(value1));
          break;
        default:
          exit = true;
      }
    }
    input.close();
  }
}
