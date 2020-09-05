package myNewPackage;

import java.util.Scanner;

public class DailyDrivingCost {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Total miles driven per day: ");
		float i1=scan.nextFloat();
		
		System.out.println("Cost per gallon of gasoline: ");
		float i2=scan.nextFloat();
	
	    System.out.println("Average miles per gallon: ");
		float i3=scan.nextFloat();

		System.out.println("Parking fees per day: ");
		float i4=scan.nextFloat();

		System.out.println("Tolls per day: ");
		float i5=scan.nextFloat();

		System.out.println("Daily Driving Cost: "+((i1/i3)*i2+i4+i5));
	}

}
