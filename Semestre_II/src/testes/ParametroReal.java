package testes;

import java.util.Scanner;
import java.lang.Math;

public class ParametroReal {
	
	static Scanner in = new Scanner(System.in);
	
	public static int real(double a) {
		
		int res;
		
		// Cast de double para int
		res = (int) Math.pow(2, a);
		
		return res;
		
	} // fim de real()

	public static void main(String[] args) {
		
		int numA;
		
		System.out.println("Valor a ser calculada a potencia de 2: ");
		numA = in.nextInt();

		// Chama real passando um parametro real
		System.out.println("Resultado: " + real(numA));	

	} // fim de main();

}
