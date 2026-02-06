import java.util.Scanner;
public class PRACTICAL3{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Simple Calculator");
System.out.print("Enter first number: ");
double num1 = sc.nextDouble();
System.out.print("Enter second number: ");
double num2 = sc.nextDouble();
System.out.print("Enter an operator (+, -, *, /): ");
char op = sc.next().charAt(0);
double result;
switch (op) {
case '+':
result = num1 + num2;
System.out.println("Result = " + result);
break;
case '-':
result = num1 - num2;
System.out.println("Result = " + result);
break;
case '*':
result = num1 * num2;
System.out.println("Result = " + result);
break;
case '/':
if (num2 != 0) {
result = num1 / num2;
System.out.println("Result = " + result);
} else {
System.out.println("Error! Division by zero.");
}
break;
default:
System.out.println("Invalid operator!");
}
sc.close();
}
}