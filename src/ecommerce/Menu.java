package ecommerce;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import cores.Cores;


public class Menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int opcao = 0;
	
		while (true) {
			System.out.println(Cores.TEXT_BLUE + Cores.ANSI_BLACK_BACKGROUND
					+ "*****************************************************");

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                E-Commerce                           ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar  Produto                   ");
			System.out.println("            2 - Listar Produtos                      ");
			System.out.println("            3 - Buscar Produto por ID                ");
			System.out.println("            4 - Carrinho                             ");
			System.out.println("            5 - Cupons                               ");
			System.out.println("            6 - Deletar                              ");
			System.out.println("            7-  Categoria                            ");
			System.out.println("            8-  Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);
			
			try {
				opcao = leia.nextInt();
				
			} catch(InputMismatchException e) {
				System.out.println("\nPor favor, Digite uma opção valida!");
				leia.nextLine();
				opcao = 0;
			}
				
			
			if (opcao == 8) {
				System.out.println("\nVolte Sempre!");
				sobre();
				leia.close();
				System.exit(0);
			} 
			
			switch (opcao) {
			case 1:
				System.out.println("Cadastrar Produto\n\n");
				
				keyPress();
				break;
			case 2:
				System.out.println("Listar Produtos\n\n");
				
				keyPress();
				break;
			case 3:
				System.out.println("Buscar Produto por ID\n\n");
				
				keyPress();
				break;
			case 4:
				System.out.println("Carrinho\n\n");
				
				keyPress();
				break;
			case 5:
				System.out.println("Cupons\n\n");
				
				keyPress();
				break;
			case 6:
				System.out.println("Deletar\n\n");
				
				keyPress();
				break;
			case 7:
				System.out.println("Categoria\n\n");
				
				keyPress();
				break;
			default:
				System.out.println("\nOpção Inválida!\n");
				
				keyPress();
				break;
		}
	}
}
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Vania Melo");
		System.out.println("Linkedin-Vania Beatriz");
		System.out.println("github.github.com/Vany005");
		System.out.println("*********************************************************");
	} public static void keyPress() {

		try {

			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para continuar comprando...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
}

}
	

		
		



