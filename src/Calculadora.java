import java.util.Scanner;


public class Calculadora {
	public static double valor1,valor2;
	static Scanner leitor = new Scanner(System.in);
	public static double resultado;
	
	
	public static void soma() {
		System.out.println("\n\nDigite o 1º valor:");
		valor1 = leitor.nextDouble();
		System.out.println("\n\nDigite o 2º valor:");
		valor2 = leitor.nextDouble();
		resultado = valor1 + valor2;
		System.out.println("O resultado foi " + resultado + "!\n\n");
	}
	
	
	public static void subtracao() {
		System.out.println("\n\nDigite o 1º valor:");
		valor1 = leitor.nextDouble();
		System.out.println("\n\nDigite o 2º valor:");
		valor2 = leitor.nextDouble();
		resultado = valor1 - valor2;
		System.out.println("O resultado foi " + resultado + "!\n\n");
	}
	public static void multiplicacao() {
		System.out.println("\n\nDigite o 1º valor:");
		valor1 = leitor.nextDouble();
		System.out.println("\n\nDigite o 2º valor:");
		valor2 = leitor.nextDouble();
		resultado = valor1 * valor2;
		System.out.println("O resultado foi " + resultado + "!\n\n");
	}
	public static void divisao() {
		System.out.println("\n\nDigite o 1º valor:");
		valor1 = leitor.nextDouble();
		System.out.println("\n\nDigite o 2º valor:");
		valor2 = leitor.nextDouble();		
		resultado = valor1 / valor2;
		System.out.println("O resultado foi " + resultado + "!\n\n");
	}
	public static void menu() {
		System.out.println("PROGRAMA CALCULADORA");
		System.out.println("Escolha sua opção!");
		System.out.println("1 - Digitar valores");
		System.out.println("2 - Realizar soma");
		System.out.println("3 - Realizar subtração");
		System.out.println("4 - Realizar divisão");
		System.out.println("5 - Realizar multiplicação");
		System.out.println("6 - Sair");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		int opcao = 0;
		
		while (opcao!=6) {
			menu();
			opcao = leitor.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.println("\n\nDigite o 1º valor:");
				valor1 = leitor.nextDouble();
				System.out.println("\n\nDigite o 2º valor:");
				valor2 = leitor.nextDouble();
				
				System.out.println("Os valores " + valor1 + " e " + valor2 + " foram armazenados\n\n");
				
				break;
			case 2:
				soma();
				
				break;
			case 3:
				subtracao();
				break;
			case 4:
				divisao();
				break;
			case 5:
				multiplicacao();
				break;
			case 6:
				System.out.println("Saindo do sistema");
				break;
			}
			
		}
		leitor.close();
		

	}

}
