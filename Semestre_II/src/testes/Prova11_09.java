package testes;

import java.util.Scanner;

public class Prova11_09 {

	static Scanner entrada = new Scanner(System.in);	
	
	public static void menu() {
		System.out.print("\n1 - CADASTRAR FUNCIONARIO"
				+ "\n2 - VALOR DE VENDA MENSAL"
				+ "\n0 - SAIR"
				+ "\n\nOpcao ......: ");
	}
	
	public static void calculaSalarioFinal(double venda[], double salarioFinal[]) {
		double pontos = 0;
		for( int i = 0; i < venda.length; i++ ) {
			pontos = (venda[ i ] /50) * 2;
			salarioFinal[ i ] = pontos * 25;
		}
	}
	
	public static void cadastra(String nome[], double venda[]) {
		for( int i = 0; i < nome.length; i++ ) {
			System.out.print("\n# REGISTRO :: " + (i + 1) + " #");
			System.out.print("\nFuncionario .......: ");
			nome[ i ] = entrada.next().toUpperCase();
			
			System.out.print("\nVenda Mensal ......: ");
			venda[ i ] = entrada.nextDouble();
		}
	}
	
	public static void ordena(String nome[], String nomesEmOrdem[]) {
		String min = null;
		for( int i = 0; i < nome.length - 1; i++ ) {
			min = nome[ i ];
			if( nome[ i + 1 ].compareTo(min) < 0 ) {
				nomesEmOrdem[ i ] = nome[ i + 1 ];
			}
		}
		nomesEmOrdem[ nome.length -1 ] = min;
	}
	
	public static void main(String[] args) {
		int tam = 2;
		String nomeFuncionario[] = new String[ tam ];
		String nomeEmOrdem[] = new String[ tam ];
		double vendaMensal[] = new double[ tam ];
		double salarioFinal[] = new double[ tam ];
		char opcao;
		
		do {
			menu();
			opcao = entrada.next().charAt(0);
			
			switch( opcao ) {
				case '1':
					cadastra(nomeFuncionario, vendaMensal);
					break;
				
				case '2':
					calculaSalarioFinal(vendaMensal, salarioFinal);
					System.out.print("\n>>>>>> SALARIO FINAL <<<<<<");
					for( int i = 0; i < salarioFinal.length; i++ ) {
						System.out.print("\n\n# REGISTRO :: " + (i + 1) + " #");
						System.out.print("\nFuncionario .......: " + nomeFuncionario[ i ]);
						System.out.print("\nSalario ...........: " + salarioFinal[ i ] + "\n");
					}
					break;
			
				case '0':
					ordena(nomeFuncionario, nomeEmOrdem);
					System.out.print("\n>>>>>> LISTA DE FUNCIONARIOS <<<<<<\n");
					break;
			}
		}
		

	}
	
}
