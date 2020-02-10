package calculator;

import java.util.Scanner;

public class Calculator {
	public static void main(String args[]) {
	int number1,number2;
	char ch;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter first number:");
	number1=scan.nextInt();
	System.out.println("Enter second number");
	number2=scan.nextInt();
	System.out.println("Enter your choice: 1.+  2.-  3.*  4./");
	ch=scan.next().charAt(0);
	switch(ch) {
	case '+':System.out.println("sum of two numbers:"+(number1+number2));
	         break;
	case '-':System.out.println("difference:"+(number1-number2));
	         break;
	case '*':System.out.println("Multiplication:"+(number1*number2));
	         break;
	case '/':if(number2==0)System.out.println("Division not possible");
	else{
		System.out.println("Division: "+(number1/number2));
	}
	        break;
			
	}
}
}
