package CalculadoraAreas;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Tela
{
    public Scanner in = new Scanner(System.in);
    public void MostrarMenu()
    {
	System.out.println("--- Menu Principal ---");
	System.out.println("1 - Adicionar Retângulo");
	System.out.println("2 - Adicionar Triângulo");
	System.out.println("3 - Adicionar Ciruclo");
	System.out.println("4 - Calcular Área Total");
	System.out.println("5 - Sair");
	try
	{
	    EscolhaOpcao();
	}
	catch (InputMismatchException e)
	{
	    System.out.println("Erro ao pegar valores com casas Decimais !!");
	    MostrarMenu();
	}
	catch (ArrayIndexOutOfBoundsException e)
	{
	    System.out.println("Você chegou ao limite de objetos cadastrados !!");
	}
    }

    private void EscolhaOpcao()
    {
	String op = in.nextLine();
	switch (op)
	{
	case "1":
	    AdicionarRetangulo();
	    MostrarMenu();
	    break;
	case "2":
	    AdicionarTriangulo();
	    MostrarMenu();
	    break;
	case "3":
	    AdicionarCirculo();
	    MostrarMenu();
	    break;
	case "4":
	    System.out.println("Área Total: "+Utilidades.CalcularAreaTotal()+"m³"); 
	    MostrarMenu();
	    break;
	case "5":
	    System.exit(0);
	    break;
	default:
	    System.out.println("Opção Invalida !");
	    MostrarMenu();
	}
    }
    
    private void AdicionarRetangulo()
    {
	Float base,altura;
	System.out.println("Insira a Base do Retangulo");
	base = in.nextFloat();
	in.nextLine();
	System.out.println("Insira o Altura do Retangulo");
	altura = in.nextFloat();
	in.nextLine();
	Utilidades.AdicionarRetangulo(base,altura);
    }
    
    private void AdicionarTriangulo()
    {
	Float base,altura;
	System.out.println("Insira a Base do Triangulo");
	base = in.nextFloat();
	in.nextLine();
	System.out.println("Insira o Altura do Triangulo");
	altura = in.nextFloat();	
	in.nextLine();
	Utilidades.AdicionarTriangulo(base,altura);
    }
    
    private void AdicionarCirculo()
    {
	float raio;
	System.out.println("Insira o Raio do Ciruclo");
	raio = in.nextFloat();
	in.nextLine();
	Utilidades.AdicionarCirculo(raio);
	
    }
    
}
