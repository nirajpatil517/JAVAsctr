//Write a Java program to calculate a Factorial of a number.

package P1;

import java.util.Scanner;
public class Q3 {

    public static void main(String[] args) {

    	//We will find the factorial of this number
        int number;
        System.out.println("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        scanner.close();
        long fact = 1;
        int i = 1;
        while(i<=number)
        {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}