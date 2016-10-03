package playlist;

public class MidiaMusica extends Midia
{
	private String artista;

	public MidiaMusica(String nome, Integer duracao, String artista)
	{
		super(nome, duracao);
		this.artista = artista;
	}

	public String getArtista()
	{
		return artista;
	}

	@Override
	public String toString()
	{
		return "Música: " + nome + " | Duração: " + duracao + " | Artista: " + artista;
	}
}
