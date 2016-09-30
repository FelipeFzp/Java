package cadastroLojaAnimais;

import java.util.Scanner;

public class Cadastro
{

	static final int MAX = 30;
	Animal[] VetAnimal = new Animal[MAX];
	int QtdAnimaisVet;

	public void ExibirMenu()
	{
		System.out.println("---- CADASTRO ----");
		System.out.println("1 - Cadastrar Animais");
		System.out.println("2 - Editar Animais Cadastrados");
		System.out.println("3 - Sair do Programa de Cadastro");
		EscolherOpcao();
	}

	private void EscolherOpcao()
	{
		Scanner ent = new Scanner(System.in);
		char x = ent.next().charAt(0);
		switch (x)
		{
		case '1':
			Cadastrar();
			break;
		case '2':
			AnimaisCadastrados();
			break;
		case '3':

			break;
		default:
			System.out.println("Opção Invalida !!");
			ExibirMenu();
			break;
		}
		ent.close();
	}

	private void Cadastrar()
	{
		String Tipo, Raca, Nome, Codigo;
		Integer Idade;
		int qtd;
		Scanner ent = new Scanner(System.in);

		System.out.println("---- Cadastrar novo animal ----");
		System.out.println("Quantidade de Animais Cadastrados:" + QtdAnimaisVet + "/" + MAX);
		do
		{
			System.out.println("Quantos animais deseja cadastrar ?");
			qtd = ent.nextInt();
		} while (qtd > MAX || qtd < 1);
		QtdAnimaisVet = QtdAnimaisVet + qtd;
		if (QtdAnimaisVet >= MAX)
		{
			System.out.println("Quantidade máxima de animais atingida.");
			QtdAnimaisVet = QtdAnimaisVet - qtd;
			ExibirMenu();
		} else
			for (int i = 0; i < qtd; i++)
			{
				while (VetAnimal[i] != null)
				{
					qtd++;
					i++;
				}
				System.out.println("Animal " + (i + 1));
				System.out.println("Tipo do Animal: ");
				Tipo = ent.next();
				System.out.println("Raça do " + Tipo + ": ");
				Raca = ent.next();
				System.out.println("Código do " + Tipo + ": ");
				Codigo = ent.next();
				System.out.println("Nome do " + Tipo + ": ");
				Nome = ent.next();
				System.out.println("Idade do " + Tipo + ": ");
				Idade = ent.nextInt();
				VetAnimal[i] = new Animal(Tipo, Raca, Nome, Codigo, Idade);
			}
		ExibirMenu();
		ent.close();
	}

	private void AnimaisCadastrados()
	{
		Scanner ent = new Scanner(System.in);
		System.out.println("---- Animais Cadastrados ----");
		System.out.println("Código - Tipo - Raça - Nome - Idade");
		String Tipo, Raca, Nome, Codigo, esc;
		Integer Idade;
		for (int i = 0; VetAnimal[i] != null; i++)
		{
			Tipo = VetAnimal[i].getTipo();
			Raca = VetAnimal[i].getRaca();
			Nome = VetAnimal[i].getNome();
			Codigo = VetAnimal[i].getCodigo();
			Idade = VetAnimal[i].getIdade();
			System.out.println(Codigo + " - " + Tipo + " - " + Raca + " - " + Nome + " - " + Idade);
		}
		System.out.println("Deseja remover algum Animal S/N?");
		esc = ent.nextLine();
		switch (esc)
		{
		case "S":
		case "s":
			Editor();
			break;
		case "N":
		case "n":
			ExibirMenu();
			break;
		default:
			System.out.println("Dgite uma opção Valida !!");
			ent.close();
			ExibirMenu();
			break;
		}
	}

	private void Editor()
	{
		Scanner ent = new Scanner(System.in);
		String codigocmp;
		String Tipo, Raca, Nome, Codigo;
		Integer Idade;
		System.out.println("Digite o código do animal que deseja remover do sistema.");
		codigocmp = ent.next();
		for (int i = 0; VetAnimal[i] != null; i++)
		{
			if (codigocmp.equals(VetAnimal[i].Codigo) == true)
			{
				int x;
				for (x = i; VetAnimal[x + 1] != null; x++)
				{
					VetAnimal[x].setCodigo(VetAnimal[x + 1].getCodigo());
					VetAnimal[x].setIdade(VetAnimal[x + 1].getIdade());
					VetAnimal[x].setNome(VetAnimal[x + 1].getNome());
					VetAnimal[x].setRaca(VetAnimal[x + 1].getRaca());
					VetAnimal[x].setTipo(VetAnimal[x + 1].getTipo());
				}
				VetAnimal[x].setCodigo(null);
				VetAnimal[x].setIdade(null);
				VetAnimal[x].setNome(null);
				VetAnimal[x].setRaca(null);
				VetAnimal[x].setTipo(null);
				QtdAnimaisVet--;
			}
		}
		System.out.println("Lista de Animais Atualizada...");
		System.out.println("Código - Tipo - Raça - Nome - Idade");
		for (int i = 0; VetAnimal[i + 1] != null; i++)
		{
			Tipo = VetAnimal[i].getTipo();
			Raca = VetAnimal[i].getRaca();
			Nome = VetAnimal[i].getNome();
			Codigo = VetAnimal[i].getCodigo();
			Idade = VetAnimal[i].getIdade();
			System.out.println(Codigo + " - " + Tipo + " - " + Raca + " - " + Nome + " - " + Idade);
		}
		ent.close();
		ExibirMenu();
	}
}
