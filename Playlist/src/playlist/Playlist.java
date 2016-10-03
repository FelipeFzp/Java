package playlist;

public class Playlist
{
	private final String nome = "Tarde Acústica";
	private final String descricao = "Uma boa música acústica para curtir hoje a tarde";
	private Integer duracaopl = 0;

	private Midia lista[] = new Midia[20];

	public String getNome()
	{
		return nome;
	}

	public String getDescricao()
	{
		return descricao;
	}

	public Integer getDuracaopl()
	{
		return duracaopl;
	}

	public Midia[] getLista()
	{
		return lista;
	}

	public void addMusica(String nome, Integer duracao, String artista)
	{
		for (int i = 0; i < lista.length; i++)
		{
			if (lista[i] == null)
			{
				MidiaMusica mm = new MidiaMusica(nome, duracao, artista);
				lista[i] = mm;
				duracaopl += duracao;
				break;
			}
		}
	}

	public void addVideo(String nome, Integer duracao, String diretor)
	{
		for (int i = 0; i < lista.length; i++)
		{
			if (lista[i] == null)
			{
				MidiaVideo mm = new MidiaVideo(nome, duracao, diretor);
				lista[i] = mm;
				duracaopl += duracao;
				break;
			}
		}
	}
}