package calculadoraSimples;

import java.util.Scanner;

public class Conta {

	float valor1, valor2, resultado;
	String operacao;
	Scanner ent = new Scanner(System.in);

	public void inicia() {
		System.out.println("Bem Vindo a Calculadora Simples !!");
		leitura();
	}

	public void leitura() {
		System.out.println("Digite o Primeiro Valor:");
		valor1 = ent.nextFloat();
		System.out.println("Digite o Segundo Valor:");
		valor2 = ent.nextFloat();
		ent.nextLine();
		escolhaOperacao();
	}

	public void escolhaOperacao() {
		System.out.println("Você pode somar, subtrair,multiplicar ou dividir ambos valores.");
		operacao = ent.nextLine();
		switch (operacao) 
		{
		case "somar":
			resultado = valor1 + valor2;
			System.out.println("Resultado: "+ resultado);
			repetir();
		case "subtrair":
			resultado = valor1 - valor2;
			System.out.println("Resultado: "+ resultado);
			repetir();
		case "multiplicar":
			resultado = valor1 * valor2;
			System.out.println("Resultado: "+ resultado);
			repetir();
		case "dividir":
			resultado = valor1 / valor2;
			System.out.println("Resultado: "+ resultado);
			repetir();
		default:
			System.out.println("Operação Inválida !!");
			escolhaOperacao();
		}
	}
	
	public void repetir()
	{
		String rep=null;
		System.out.println("Deseja fazer outra conta ? S/N");
		rep=ent.nextLine();
		switch (rep)
		{
			case "S":
				case "s":
					leitura();
			case "N":
				case "n":
					System.exit(0);
		}
	}
}
