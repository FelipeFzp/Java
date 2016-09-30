package Playlist;

public class Playlist {
	public final String Nome = "Tarde Música";
	public final String Descricao = "Uma boa músca acustica para curtir hoje a tarde";
	private Integer DuracaoPlaylist;
	public Midia Lista[] = new Midia[20];
	

	public void addMusica(String nome,Integer duracao,String artista)
	{
		for (int i=0;i<Lista.length;i++)
		{
			if (Lista[i] == null)
			{
				Musica musica = new Musica (nome,duracao,artista);
				Lista[i] = musica;
				DuracaoPlaylist+=musica.Duracao;
				break;
			}
			
		}
	}
	
	public void addVideo(String nome,Integer duracao,String diretor)
	{
		for (int i=0;i<Lista.length;i++)
		{
			if (Lista[i] == null)
			{
				Musica video = new Musica (nome,duracao,diretor);
				Lista[i] = video;
				DuracaoPlaylist+=video.Duracao;
				break;
			}
			
		}
	}

	public Integer getDuracaoPlaylist() 
	{
		return DuracaoPlaylist;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
