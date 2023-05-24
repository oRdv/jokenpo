package br.senai.jandira.sp;

import java.util.Random;
import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		Random random = new Random();

		String escolha, escolhaComputador;
		int resultado, num;

		System.out.println("***************************************");
		System.out.println("                JOKÊNPO                ");
		System.out.println("***************************************");

		System.out.println("             1 - Pedra                 ");
		System.out.println("             2 - Papel                 ");
		System.out.println("             3 - Tesoura               ");
		System.out.println("---------------------------------------");

		System.out.println("Faça sua escolha de 1 á 3");
		resultado = teclado.nextInt();
		num = random.nextInt(3) + 1;
		escolha = "";
		
		if (resultado == 1) {
			escolha = "Pedra";
		} else if (resultado == 2) {
			escolha = "Papel";
		} else if (resultado == 3) {
			escolha = "Tesoura";
		} else {
			
			
			System.out.println("INSIRA UM NÚMERO VÁLIDO.");
			System.exit(1);
		}
		 
		escolhaComputador = "";

		if (num == 1 ) {
			escolhaComputador = "Pedra";
			
		} else if (num == 2) {
			escolhaComputador = "Papel";
		
		} else if (num == 3) {
		escolhaComputador = "Tesoura";
		}
	
		System.out.println("Você escolheu: " + escolha);
		System.out.println("O computador escolheu: " + escolhaComputador);

		if (escolha == escolhaComputador) {
			System.out.println("EMPATE");
		} else if (resultado == 1 && random.nextInt() == 3 || resultado == 2 && random.nextInt() == 1
				|| resultado == 3 && random.nextInt() == 2 || resultado == 1 && random.nextInt() == 2) {
			System.out.println("VOCÊ VENCEU!!");
		} else {
			System.out.println("VOCÊ PERDEU!");
		}

	}

}
