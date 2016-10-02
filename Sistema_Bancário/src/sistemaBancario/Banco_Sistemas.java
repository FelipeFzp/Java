package sistemaBancario;

import java.util.Scanner;

public class Banco_Sistemas
{
	Scanner in = new Scanner(System.in);
	static final int MAX = 30;
	private int qtdContasRegistradas = 0;
	Banco_Contas VetContas[] = new Banco_Contas[MAX];
	
	public void ExibirMenu()
	{
		System.out.println("--- Sistema Bancário ---");
		System.out.println("1 - Entrar com uma conta");
		System.out.println("2 - Abrir uma nova conta");
		System.out.println("3 - Fechar uma conta");
		System.out.println("0 - Sair do sitema");
		EscolherOpcao();
	}

	private void EscolherOpcao()
	{
		String opcao = in.nextLine();
		switch (opcao)
		{
		case "1":
			EntrarConta();
			break;
		case "2":
			NovaConta();
			break;
		case "3":
			FecharConta();
			break;
		case "0":
			System.exit(0);
			break;
		default:
			System.out.println("Opção Inválida.");
			ExibirMenu();
		}
	}

	private void FecharConta()
	{
		System.out.println("FECHAMENTO DE CONTAS");
		System.out.println("Você realmente deseja fechar uma conta ? S/N");
		String opcao= in.nextLine();
		if (opcao.equalsIgnoreCase("S"))
		{
			String NumeroConta;
			String NumeroAgencia;
			String Senha;
			
			System.out.println("Insira o Numero da Conta");
			NumeroConta = in.nextLine();
			System.out.println("Insira o Numero da Agência");
			NumeroAgencia = in.nextLine();
			System.out.println("Insira a Senha da Conta Bancária");
			Senha = in.nextLine();
			for (int i=0;i<VetContas.length;i++)
			{
				if (VetContas[i].NumeroConta.equalsIgnoreCase(NumeroConta))
				{
					if (VetContas[i].NumeroAgencia.equalsIgnoreCase(NumeroAgencia))
					{
						if(VetContas[i].Senha.equalsIgnoreCase(Senha))
						{
							
						}
						else
						{
							System.out.println("Conta Inexistente");
							ExibirMenu();
						}
					}
					else
					{																																																						
						System.out.println("Conta Inexistente");
						ExibirMenu();
					}
				}
				else
				{
					System.out.println("Conta Inexistente");
					ExibirMenu();
				}
			}
		}
		ExibirMenu();
	}

	private void NovaConta()

	{
		System.out.println("CADASTRO DE CONTAS");
		System.out.println("Deseja cadastrar uma nova conta ? S/N");
		String opcao = in.nextLine();
		if (opcao.equalsIgnoreCase("S"))
		{
			System.out.println("Quantidade Maxima: " + MAX + ", Quantidade Atual: " + qtdContasRegistradas);
			if (qtdContasRegistradas > MAX)
			{
				System.out.println("Quantidade máxima de contas registradas atingida.");
				NovaConta();
			} else
			{
				String Nome;
				String NumeroConta;
				String NumeroAgencia;
				String Senha;
				System.out.println("Insira o nome do Proprietario");
				Nome = in.nextLine();
				System.out.println("Insira o Numero da Conta");
				NumeroConta = in.nextLine();
				System.out.println("Insira o Numero da Agência");
				NumeroAgencia = in.nextLine();
				System.out.println("Cadastre uma senha somente com números, 6 Digitos");
				Senha = in.nextLine();
				int i = 0;
				while (VetContas[i] != null)
				{
					if (NumeroConta.equals(VetContas[i].NumeroConta))
					{
						System.out.println("Conta já existente !!");
						System.out.println("Cadastre com um Numero de Conta ou com uma Agência Diferente");
						NovaConta();
					}
					i++;
				}
				
				Banco_Contas Conta = new Banco_Contas(Nome, NumeroConta, NumeroAgencia, Senha);
				VetContas[i]=Conta;
				qtdContasRegistradas++;
				System.out.println("Conta Criada com Sucesso\n");
			}
		}
		ExibirMenu();
	}

	private void ExibirMenuConta(int i)
	{
		System.out.println("Bem Vindo " + VetContas[i].getNome());
		System.out.println("Seu Saldo Atual: " + VetContas[i].getSaldo());
		System.out.println("O Que deseja Efetuar ?");
		System.out.println("1 - Saque");
		System.out.println("2 - Depósito");
		System.out.println("3 - Transferencia");
		System.out.println("0 - Sair da Conta");
		EscolhaOpcaoConta(i);
	}

	private void EscolhaOpcaoConta(int i)
	{
		String opcao = in.nextLine();
		switch (opcao)
		{
		case "1":
			System.out.println(VetContas[i].Saque(i, VetContas));
			ExibirMenuConta(i);
			break;
		case "2":
			System.out.println(VetContas[i].Deposito(i, VetContas));
			ExibirMenuConta(i);
			break;
		case "3":
			System.out.println(VetContas[i].Transferencia(i, VetContas));
			ExibirMenuConta(i);
			break;
		case "0":
			System.out.println("Encerrando Conta...");
			ExibirMenu();
			break;
		default:
			System.out.println("Opção Inválida.");
			EscolhaOpcaoConta(i);
		}
	}

	private void EntrarConta()
	{
		String NumeroConta, Senha;
		System.out.print("Digite o Numero da Conta:");
		NumeroConta = in.nextLine();
		System.out.print("\nDigite a Senha:");
		Senha = in.nextLine();

		for (int i = 0; i < VetContas.length; i++)
		{
			// bug aqui,for nao sai do i=0
			System.out.println(i);
			if (NumeroConta.equals(VetContas[i].NumeroConta) && Senha.equals(VetContas[i].Senha))
			{
				System.out.println("Acessando Conta...");
				int conta = i;
				ExibirMenuConta(conta);
			} else
			{
				if (VetContas[i+1] == null)
				{
					System.out.println("Numero da Conta ou Senha Inválida.");
					ExibirMenu();
				}
			}
		}
	}
}
