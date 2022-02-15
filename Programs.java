Q1. program  to perform basic calculator operation
=>
import java.util.Scanner;

class prog1
{
  public static void main(String[] args) 
{

    char operator;
    Double number1, number2, result;

    // create an object of Scanner class
    Scanner input = new Scanner(System.in);

    // ask users to enter operator
    System.out.println("Choose an operator: +, -, *, or /");
    operator = input.next().charAt(0);

    // ask users to enter numbers
    System.out.println("Enter first number");
    number1 = input.nextDouble();

    System.out.println("Enter second number");
    number2 = input.nextDouble();

    switch (operator) {

      // performs addition between numbers
      case '+':
        result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
        break;

      // performs subtraction between numbers
      case '-':
        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
        break;

      // performs multiplication between numbers
      case '*':
        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
        break;

      // performs division between numbers
      case '/':
        result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }

    input.close();
  }
}
Q2.program to calculate fabonice series upto n numbers
=>
import java.util.Scanner;
class prog2
{
  public static void main(String[] args) 
{
     Scanner sc=new Scanner(System.in);
    int n , firstTerm = 0, secondTerm = 1;
     n=sc.nextInt();
    System.out.println("Fibonacci Series till " + n + " terms:");

    for (int i = 1; i <= n; ++i) {
      System.out.print(firstTerm + ", ");

      // compute the next term
      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
    }
  }
}

Q3. Program to calculate factorial number
=>
import java.util.Scanner; 
public class prog3
{    
  Public static void main(String args[])
{       int i =1, factorial=1, number;      
 System.out.println("Enter the number to which you need to find the factorial:");       
Scanner sc = new Scanner(System.in);      
 number = sc.nextInt();      
 while(i <=number)
 {         
     factorial = factorial * i;         
     i++;       
}       
System.out.println("Factorial of the given number is:: "+factorial);   
 } 
}

Q4. Program to find string is palindrome or not
=>
 public class prog4
{
    public static void main(String args[])
    {
        String a, b = "";
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string you want to check:");
        a = s.nextLine();
        int n = a.length();
        for(int i = n - 1; i >= 0; i--)
        {
            b = b + a.charAt(i);
        }
        if(a.equalsIgnoreCase(b))
        {
            System.out.println("The string is palindrome.");
        }
        else
        {
            System.out.println("The string is not palindrome.");
        }
    }
}
