import java.util.Scanner;

/**
 * This program will determine if a number the user inputs is even or odd
 * @author Dafna Khripun
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * 
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user for one integer
    System.out.println("Please enter an integer:");
    // declare and initialize a variable for integer 1
    int integer = input.nextInt();

    // declare and calculate the remainder when divided by 2
    int remainder = integer % 2;

    // telling the user weather the integer is even or odd
    if (remainder == 0) {
      System.out.println(integer + " is an even number");
    } else {
      System.out.println(integer + " is an odd number");
    }
  }
}
