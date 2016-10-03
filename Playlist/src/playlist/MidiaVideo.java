package playlist;

public class MidiaVideo extends Midia
{
	private String diretor;

	public MidiaVideo(String nome, Integer duracao, String diretor)
	{
		super(nome, duracao);
		this.diretor = diretor;
	}

	public String getDiretor()
	{
		return diretor;
	}

	@Override
	public String toString()
	{
		return "V�deo: " + nome + " | Dura��o: " + duracao + " | Diretor: " + diretor;
	}
}