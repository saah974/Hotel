package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Rooms;

public class Exercise1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rooms[] vect = new Rooms[10];
		
		System.out.print("How many rooms will be rented? ");
		int rentedRooms = sc.nextInt();
		
		for (int i=0; i < rentedRooms; i++) {
			System.out.println("Rent #" + (i+1) +":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("E-mail: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			System.out.println();
			vect[room] = new Rooms(name, email);			
		}
		
		System.out.println("Busy rooms: ");
		for (int i=0; i < 10; i++ ) {
			if (vect[i]	!= null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		
		sc.close();
	}

}
