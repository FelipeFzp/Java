package playlist;

public abstract class Midia
{
	protected String nome;
	protected Integer duracao;

	public Midia(String nome, Integer duracao)
	{
		super();
		this.nome = nome;
		this.duracao = duracao;
	}

	public String getNome()
	{
		return nome;
	}

	public Integer getDuracao()
	{
		return duracao;
	}
}
