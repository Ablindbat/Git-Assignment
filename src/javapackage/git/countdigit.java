package javapackage.git;

import java.util.Scanner;

public class countdigit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scan.nextInt();
		int count = 0;
		scan.close();
		while (number != 0) {
			number=number/10;
			count++;
		}
		System.out.println("Number digit is: "+count);
	}

}
