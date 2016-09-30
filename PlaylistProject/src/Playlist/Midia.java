package Playlist;

public class Midia {
	
	public String Nome;
	public Integer Duracao;
	
	public Midia(String nome, Integer duracao)
	{
		this.Nome=nome;
		this.Duracao=duracao;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public Integer getDuracao() {
		return Duracao;
	}

	public void setDuracao(Integer duracao) {
		Duracao = duracao;
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
