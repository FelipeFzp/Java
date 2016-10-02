package sistemaBancario;

import java.util.Scanner;

public class Banco_Contas
{
	Scanner in = new Scanner(System.in);
	String Nome;
	String NumeroConta;
	String NumeroAgencia;
	String Senha;
	Float Saldo;

	public Banco_Contas(String nome, String numeroConta, String numeroAgencia, String senha)
	{
		super();
		Nome = nome;
		NumeroConta = numeroConta;
		NumeroAgencia = numeroAgencia;
		Senha = senha;
		Saldo = 0f;
	}

	@Override
	public String toString()
	{
		return super.toString();
	}

	public String getNome()
	{
		return Nome;
	}

	public void setNome(String Nome)
	{
		this.Nome = Nome;
	}

	public String getNumeroConta()
	{
		return NumeroConta;
	}

	public void setNumeroConta(String NumeroConta)
	{
		this.NumeroConta = NumeroConta;
	}

	public String getNumeroAgencia()
	{
		return NumeroAgencia;
	}

	public void setNumeroAgencia(String NumeroAgencia)
	{
		this.NumeroAgencia = NumeroAgencia;
	}

	public String getSenha()
	{
		return Senha;
	}

	public void setSenha(String senha)
	{
		Senha = senha;
	}

	public Float getSaldo()
	{
		return Saldo;
	}

	public final String Transferencia(int posConta_a_Debitar, Banco_Contas VetorContas[])
	{
		String Conta_a_Creditar, opcao;
		Float ValorTransferido;
		System.out.println("Deseja fazer uma Transferência ?");
		opcao=in.nextLine();
		if (opcao.equalsIgnoreCase("s"))
		{
			System.out.println("Insira a Conta que deseja creditar seu débito:");
			Conta_a_Creditar = in.nextLine();
			for (int i = 0; i < VetorContas.length; i++)
			{
				if (VetorContas[i].NumeroConta.equals(Conta_a_Creditar))
				{
					System.out.println("Insira o valor que deseja transferir para a conta " + Conta_a_Creditar);
					ValorTransferido = in.nextFloat();
					if (ValorTransferido > VetorContas[posConta_a_Debitar].Saldo)
					{
						return "Saldo Insuficiente, Voltando para o Menu...";
					} else
					{
						VetorContas[posConta_a_Debitar].Saldo -= ValorTransferido;
						VetorContas[i].Saldo +=ValorTransferido;
						return "Transefencia de "+ValorTransferido+"R$ completa. Saldo Atual: " + VetorContas[posConta_a_Debitar].Saldo;
					}
				}
				if (VetorContas[i+1]==null)
				{
					System.out.println("Conta Inexistente !!");
					Transferencia(i, VetorContas);
				}
			}
		}
		return "Voltando para o menu Principal...";
	}

	public final String Saque(int posConta, Banco_Contas VetorContas[])
	{
		Float valorSaque;
		System.out.println("Valor do Saque:");
		valorSaque = in.nextFloat();
		if (valorSaque > VetorContas[posConta].Saldo && valorSaque > 0)
		{
			return "Saldo Insuficiente.";
		} else
		{
			VetorContas[posConta].Saldo -= valorSaque;
			return "Saldo Atual: " + VetorContas[posConta].Saldo;
		}
	}

	public final String Deposito(int posConta, Banco_Contas VetorContas[])
	{
		Float valorDeposito;
		System.out.println("Valor do Depósito:");
		valorDeposito = in.nextFloat();
		VetorContas[posConta].Saldo += valorDeposito;
		return "Saldo Atual: " + VetorContas[posConta].Saldo;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Nome == null) ? 0 : Nome.hashCode());
		result = prime * result + ((NumeroAgencia == null) ? 0 : NumeroAgencia.hashCode());
		result = prime * result + ((NumeroConta == null) ? 0 : NumeroConta.hashCode());
		result = prime * result + ((Saldo == null) ? 0 : Saldo.hashCode());
		result = prime * result + ((Senha == null) ? 0 : Senha.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Banco_Contas other = (Banco_Contas) obj;
		if (Nome == null)
		{
			if (other.Nome != null)
				return false;
		} else if (!Nome.equals(other.Nome))
			return false;
		if (NumeroAgencia == null)
		{
			if (other.NumeroAgencia != null)
				return false;
		} else if (!NumeroAgencia.equals(other.NumeroAgencia))
			return false;
		if (NumeroConta == null)
		{
			if (other.NumeroConta != null)
				return false;
		} else if (!NumeroConta.equals(other.NumeroConta))
			return false;
		if (Saldo == null)
		{
			if (other.Saldo != null)
				return false;
		} else if (!Saldo.equals(other.Saldo))
			return false;
		if (Senha == null)
		{
			if (other.Senha != null)
				return false;
		} else if (!Senha.equals(other.Senha))
			return false;
		return true;
	}
}
