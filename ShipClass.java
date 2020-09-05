package myNewPackage;

 import java.util.*;

public class ShipClass {

	public static void main(String[] args) {
		
		String a;
		System.out.println("Enter the serial no. of the ship: ");
		Scanner scanner=new Scanner(System.in);
		String s=scanner.next();
		
		switch(s.charAt(0))
		{
		case 'b':
		case 'B':
			System.out.println("Battleship");
			break;
		case 'c':
		case 'C':
			System.out.println("Cruiser");
			break;
		case 'd':
		case 'D':
			System.out.println("Destroyer");
			break;
		case 'f':
		case 'F':
			System.out.println("Frigate");
			break;
			
		default:
			System.out.println("No such ship class exists.\nCheck your serial no.Bt76");
		}
		
	}

}
