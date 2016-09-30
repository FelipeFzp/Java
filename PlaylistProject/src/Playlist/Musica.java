package Playlist;

public class Musica extends Midia {
	
	public String Artista;
	
	public Musica(String nome, Integer duracao, String artista)
	{
		super(nome, duracao);
		this.Artista=artista;
	}

	@Override
	public String toString() {
		return "Musica [Artista=" + Artista + ", Nome=" + Nome + ", Duracao=" + Duracao + "]";
	}
}
