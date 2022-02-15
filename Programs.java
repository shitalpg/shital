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

Q5. Program to calculate permutation and combination of 2 number
=>
import java.util.Scanner; 
public class prog5
{ 
  private static void print(String str) 
{ 
   System.out.print(str); 
} 
private static void println(String str)
 {  
   System.out.println(str); 
 } 
public static int factorial(int n) 
{ 
   int fact = 1; 
for (int i = 1; i <= n; i++)
 { 
     fact = fact * i; 
  }
return fact; 
} 
public static void main(String args[]) 
{ 
int n, r; 
Scanner scan = new Scanner(System.in); 
println("To calculate the nCr and nPr values, we need 'n' and 'r' value .");
 print("Enter the value of n : "); 
n = scan.nextInt(); 
print("Enter the value of r : ");
 r = scan.nextInt(); 
int ncr = (factorial(n) / (factorial(n - r) * factorial(r)));
 int npr = (factorial(n) / (factorial(n - r))); 
println("nPr is : " + npr);
 println("nCr is : " + ncr);
 } 
}
Q6. Program print diamond pattern 
=>
import java.util.Scanner;
public class prog6
{ 
public static void main(String args[]) 
{ 
 int n, i, j, space = 1; 
 System.out.print("Enter the number of rows: "); 
 Scanner s = new Scanner(System.in);
  n = s.nextInt();
 space = n - 1; 
for (j = 1; j <= n; j++) 
{ 
for (i = 1; i <= space; i++)
 { 
  System.out.print(" ");
 }  
space--; 
for (i = 1; i <= 2 * j - 1; i++)
 { 
   System.out.print("*"); 
 } System.out.println(""); 
} 
 space = 1;
 for (j = 1; j <= n - 1; j++) 
{ 
 for (i = 1; i <= space; i++)
 {  
   System.out.print(" "); 
  } space++; for (i = 1; i <= 2 * (n - j) - 1; i++) 
{ 
  System.out.print("*"); 
} 
System.out.println("");
 } 
}
}
Q7. Program reverse the letter present in given string.
=>
Java program to reverse a string's words characters
package com.howtodoinjava.example;
 
import java.util.Scanner;
 
public class prog7
{
  public static void main(String[] args) 
{
    Scanner scanner = new Scanner(System.in);
    System.out.print("Original string : ");
 
    String originalStr = scanner.nextLine();
    scanner.close();
 
    String words[] = originalStr.split("\\s");
    String reversedString = "";
 
    for (int i = 0; i < words.length; i++) 
    {
      String word = words[i];
      String reverseWord = "";
      for (int j = word.length() - 1; j >= 0; j--) {
        reverseWord = reverseWord + word.charAt(j);
      }
      reversedString = reversedString + reverseWord + " ";
    }
 
    // Displaying the string after reverse
    System.out.print("Reversed string : " + reversedString);
  }
}
Q8. Program check wether given array in mirror inverse or not.
=>

public class prog8
 {
 

    static boolean isMirrorInverse(int arr[])

    {

        for (int i = 0; i < arr.length; i++)
       {
 

            if (arr[arr[i]] != i)

                return false;

        }
 

        return true;

    }

    public static void main(String[] args)

    {

        int arr[] = { 1, 2, 3, 0 };

        if (isMirrorInverse(arr))

            System.out.println("Yes");

        else

            System.out.println("No");

    }
}

Q9. Program to remove elements in array list.
=>
import java.util.ArrayList;

import java.util.List;


public class prog9
{


    public static void main(String[] args)

    {

       List<Integer> al = new ArrayList<>();

        al.add(10);

        al.add(20);

        al.add(30);

        al.add(1);

        al.add(2);
       System.out.println(al);
        al.remove(1);
        al.remove(1);
       System.out.println(al);

    }
}

Q10. Program to find tranpose of given matrix. 
=>
import java.util.Scanner;
public class prog10
{
    public static void main(String args[])  
    {
	int i, j;
	System.out.println("Enter total rows and columns: ");
	Scanner s = new Scanner(System.in);
	int row = s.nextInt();
	int column = s.nextInt();
	int array[][] = new int[row][column];
	System.out.println("Enter matrix:");
 	for(i = 0; i < row; i++)
  	{
   	    for(j = 0; j < column; j++) 
     	    {
        	array[i][j] = s.nextInt();
        	System.out.print(" ");
            }
  	}
	System.out.println("The above matrix before Transpose is ");
  	for(i = 0; i < row; i++)
    	{
      	    for(j = 0; j < column; j++)
            {
          	System.out.print(array[i][j]+" ");
            }
            System.out.println(" ");
        }
 	System.out.println("The above matrix after Transpose is ");
  	for(i = 0; i < column; i++)
    	{
      	    for(j = 0; j < row; j++)
            {
                System.out.print(array[j][i]+" ");
            }
            System.out.println(" ");
        }
    }
}
