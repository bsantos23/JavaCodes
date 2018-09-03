package lista02;

import java.util.Scanner;

public class Lista02_n09 {
	
	// RETORNA O MENOR VALOR
	public static int menorValor(int valorA, int valorB) {
		
		int menorValor = 0;
		
		if( valorA < valorB ) {
			menorValor = valorA;
		} else {
			menorValor = valorB;
		}
		
		return menorValor;
		
	} // fim da funcao menorValor()
	
	// MAIN
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int valorA;
		int valorB;
		
		System.out.print("Informe um valor inteiro: ");
		valorA = in.nextInt();
		
		System.out.print("Informe outro valor inteiro: ");
		valorB = in.nextInt();
		
		// Chama a funcao menorValor() passando os parametros reais
		System.out.print("\nO menor valor informado foi: " + menorValor(valorA, valorB));

	} // fim da funcao main()

} // fim da classe Lista02_n09
