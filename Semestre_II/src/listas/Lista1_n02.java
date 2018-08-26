package listas;

import java.util.Scanner;

public class Lista1_n02 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		final int arraySize = 5;
		int[] array = new int[ arraySize ]; // cria um array de inteiros
		int option = 0;
		
		// Opcoes para o usuario
		do
		{
			System.out.println("1 - Cadastrar dados no vetor\n"
							 + "2 - Ordenar dados do vetor\n"
							 + "3 - Pesquisar dado no vetor\n"
							 + "4 - Sair");
			
			System.out.println("\nOpcao: ");
			option = in.nextInt();
			
			switch( option )
			{
				case 1:
					System.out.println("");
					break;
				
				case 2:
					
					
			} // fim do switch
			
		} while (option != 4);
		

	}

}
