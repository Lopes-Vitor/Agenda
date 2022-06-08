package exercicios;

import java.util.Scanner;
import java.util.Arrays;

public class Agenda {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in); // Declarando o scanner

		String agenda[][] = new String[10][5]; // Declarando uma matriz

		for (int i = 0; i < agenda.length; i++) { // Loop FOR (enquanto i for menor que o tamanho da matriz, +1 faça)

			int x = 0; // declarando uma variavel

			System.out.println("Digite o seu nome: "); // imprimindo uma mensagem na tela

			agenda[i][x] = leitor.next(); // recebendo a resposta dentro da matriz

			x++; // acrescentando mais 1 na variavel x

			System.out.println("Digite o seu endereço: "); // imprimindo uma mensagem na tela

			agenda[i][x] = leitor.next(); // recebendo a resposta dentro da matriz

			x++; // acrescentando mais 1 na variavel x

			System.out.println("Digite o seu Codigo Postal: "); // imprimindo uma mensagem na tela

			agenda[i][x] = leitor.next(); // recebendo a resposta dentro da matriz

			x++; // acrescentando mais 1 na variavel x

			System.out.println("Digite o seu Bairro: "); // imprimindo uma mensagem na tela

			agenda[i][x] = leitor.next(); // recebendo a resposta dentro da matriz

			x++; // acrescentando mais 1 na variavel x

			System.out.println("Digite o seu Telefone: "); // imprimindo uma mensagem na tela

			agenda[i][x] = leitor.next(); // recebendo a resposta dentro da matriz

		}

		for (int l = 0; l < 10; l++) { // Loop FOR (enquanto l for menor que 10, +1 Faça)
			for (int j = 0; agenda[l] != null && j < agenda[l].length; j++) { // Loop FOR ( enquanto l da matriz nao for nulo e menor que o tamanho de l da matriz, +1 faça)
																				
																				 
				System.out.print(agenda[l][j] + " "); // imprimindo uma mensagem na tela
			}
			System.out.println(); // imprimindo uma mensagem na tela
		}
	}

}
