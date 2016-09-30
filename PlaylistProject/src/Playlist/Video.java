package Playlist;

public class Video extends Midia {

	public String Diretor;
	
	public Video(String nome, Integer duracao,String diretor) 
	{
		super(nome, duracao);
		this.Diretor=diretor;		
	}

	@Override
	public String toString() {
		return "Video [Diretor=" + Diretor + ", Nome=" + Nome + ", Duracao=" + Duracao + "]";
	}
	
	
}
