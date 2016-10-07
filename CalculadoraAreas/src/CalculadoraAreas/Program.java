package CalculadoraAreas;

public class Program
{

    public static void main(String[] args)
    {
	Tela tela = new Tela();   // InputMismatchException ;
	tela.MostrarMenu();       // Tentei passar tudo pra float, tudo pra double, Cast de float pra double, de double pra float;
				  // nada adiantou, continua dando a Exception;
    }

}
