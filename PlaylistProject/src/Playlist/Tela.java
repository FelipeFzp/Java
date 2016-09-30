package Playlist;

import java.util.Scanner;

public class Tela {
	
	Scanner in = new Scanner(System.in);
	Playlist Playlist = new Playlist();
	
	public void mostrarMenu()
	{
		System.out.println("1 - Adicionar Musica");
		System.out.println("2 - Adicionar Video");
		System.out.println("3 - Mostrar Playlist");
		EscolherOpcao();
	}
	
	private void EscolherOpcao() 
	{
		int op = in.nextInt();
		switch (op)
		{
		case 1:
			addMusica();
			break;
		case 2:
			addVideo();
			break;
		case 3:
			mostrarPlaylist();
			break;
		default:
			System.out.println("Opcao Invalida");
			break;
		}
	}
	
	private void addMusica()
	{
		String Nome,Artista;
		Integer Duracao;
		System.out.println("Insira o Nome da Musica");
		Nome= in.nextLine();
		System.out.println("Insira o Nome do Artista");
		Artista = in.nextLine();
		System.out.println("Insira a Duracao da Musica");
		Duracao = in.nextInt();
		in.next();
		Playlist.addMusica(Nome, Duracao, Artista);
	}
	
	private void addVideo()
	{
		String Nome,Diretor;
		Integer Duracao;
		System.out.println("Insira o Nome da Musica");
		Nome= in.nextLine();
		System.out.println("Insira o Nome do Diretor");
		Diretor = in.nextLine();
		System.out.println("Insira a Duracao da Musica");
		Duracao = in.nextInt();
		in.next();
		Playlist.addMusica(Nome, Duracao, Diretor);
	}
	
	private void mostrarPlaylist()
	{
		System.out.println("Nome da Playlist :"+Playlist.Nome+" Duracao: "+Playlist.getDuracaoPlaylist());
		System.out.println(Playlist.Descricao);
		System.out.println("Midias:");
		for (int i=0;i<Playlist.Lista.length;i++)
		{
			if (Playlist.Lista[i]!=null)
			Playlist.Lista[i].toString();
			else
				break;
		}
	}
}
