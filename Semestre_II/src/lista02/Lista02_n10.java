package lista02;

import java.util.Scanner;

public class Lista02_n10 {

	static Scanner in = new Scanner(System.in);
	
	// PREENCHER VETOR
	public static void preencherVetor(int vetor[]) {
		
		for( int i = 0; i < vetor.length; i++ ) {
			
			System.out.print((i + 1) + " - Valor: ");
			vetor[ i ] = in.nextInt();
			
		}
		
	} // fim de preencherVetor()
	
	
	// SOMAR POSICOES DO VETOR
	public static int soma(int vetor[]) {
		
		int resultado = 0;
		
		for( int i = 0; i < vetor.length; i++ ) {
			resultado += vetor[ i ];
		}
		
		return resultado;
		
	} // fim de soma()
	
	
	// MAIN
	public static void main(String[] args) {
		
		int tamanho = 5;
		int vetor[] = new int[ tamanho ];
		
		preencherVetor(vetor);
		
		System.out.print("\nSoma total dos valores informados: " + soma(vetor));

	} // fim de main()

} // fecha a classe Lista02_n10
