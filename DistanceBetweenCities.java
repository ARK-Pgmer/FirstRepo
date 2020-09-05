package myNewPackage;

import java.util.Scanner;

public class DistanceBetweenCities {

	public static void main(String[] args) {
		
		double a,b,c;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Distance Between two Cities ");
		a=scan.nextInt();
		b=a*0.621371;
		c=a*3280.84;
		System.out.println(" Distance Between two Cities in miles "+b);
		System.out.println(" Distance Between two Cities in foots "+c);

	}

}
