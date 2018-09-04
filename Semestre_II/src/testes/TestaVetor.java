package testes;

import java.util.Scanner;

public class TestaVetor {
	
	static Scanner in = new Scanner(System.in);

	// Altera o valor default de cada posicao do vetor
	public static boolean alteraValorDefault(int vetor[]) {
		
		int emptyPos = 0;
		boolean vetorPreenchido = false;
		
		for( int i = 0; i < vetor.length; i++ ) {
			
			vetor[ i ] = -1;
			emptyPos++;
			
		}
		
		if( emptyPos != 0 ) {
			
			vetorPreenchido = true;
			
		}
		
		return vetorPreenchido;
		
	} // fim preencherVetor()
	
	
	// Preenche o vetor com dados do usuario
	public static void preencheVetor(int vetor[]) {
		
		for( int i = 0; i < vetor.length; i++ ) {
			
			System.out.print((i + 1) + " Valor: ");
			vetor[ i ] = in.nextInt();
		}
		
	} // fim preencheVetor()
	
	
	// Ordena os dados do vetor usando o algoritmo de Selecao Direta
	public static void ordenaDados(int vetor[]) {
		
		int indexAtual;
		int valorAtual;
		
		for( int i = 0; i < vetor.length - 1; i++ ) {
			
			indexAtual = i;
			valorAtual = vetor[ i ];
			
			for( int j = i + 1; j < vetor.length; j++ ) {
				
				if( vetor[ j ] < valorAtual ) {
					
					indexAtual = j;
					valorAtual = vetor[ j ];
					
				} // fim do if
				
			} // fim do for interno
			
			vetor[ indexAtual ] = vetor[ i ];
			vetor[ i ] = valorAtual;
			
		}
		
	} // fim ordenaDados
	
	
	// Exibe os valores do vetor
	public static void mostraValores(int vetor[]) {
		
		for( int i = 0; i < vetor.length; i++ ) {
			
			System.out.println("[" + i + "] >>> " + vetor[ i ]);
			
		} // fim do for
		
	} // fim mostraValores()
	
	
	public static void main(String[] args) {
	
		int vetor[] = new int[ 5 ];
		boolean statusVetor;
		
		statusVetor = alteraValorDefault(vetor);
		
		if( statusVetor == true ) {
			
			System.out.print("Vetor populado");
			
		} else {
			
			System.out.print("Vetor vazio");
			
		}
		
		System.out.println();
		
		preencheVetor(vetor);
		
		ordenaDados(vetor);
		
		mostraValores(vetor);
		
	}

}
