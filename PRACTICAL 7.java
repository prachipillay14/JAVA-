import java.util.Scanner;
public class Pract7 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
try {
System.out.print("Enter dividend: ");
int dividend = input.nextInt();
System.out.print("Enter divisor: ");
int divisor = input.nextInt();
int result = dividend / divisor;
System.out.println("Result: " + result);
} catch (ArithmeticException e) {
System.out.println("Error: Cannot divide by zero.");
} catch (Exception e) {
System.out.println("Error: Please enter valid integers.");
} finally {
System.out.println("Execution of the try-catch block is complete.");
input.close();
}
}
}