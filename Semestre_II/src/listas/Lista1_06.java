package listas;

import java.util.Scanner;

public class Lista1_06 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String[] animals = { "Elefante", "Ovelha", "Canguru", "Leao", "Tigre", "Onca", "Camelo", "Coruja", "Cavalo", "Jacare" };
		String animalName;
		int count = 0;
		boolean found = false;
		
		System.out.print("Informe o nome de um animal: ");
		animalName = in.next();
		
		while( count < animals.length && found == false ) {
			
			if( animals[ count ].equalsIgnoreCase(animalName) ) {
				found = true;
			}
			
			count++;
			
		}
		
		if( found == true ) {
			System.out.print("\nFound..... Position - [" + count + "]");
		} else {
			System.out.print("\nThe animal " + animalName + " is not found");
		}	

	}

}
