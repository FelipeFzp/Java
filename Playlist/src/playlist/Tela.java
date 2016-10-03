package playlist;

import java.util.Scanner;

public class Tela
{
	Scanner in = new Scanner(System.in);

	Playlist pl = new Playlist();

	public void mostrarMenu()
	{
		
		System.out.println("Playlist " + pl.getNome());
		System.out.println("1 - Adicionar música");
		System.out.println("2 - Adicionar vídeo");
		System.out.println("3 - Mostrar playlist");

		char escolha = in.next().charAt(0);
		in.nextLine();

		switch (escolha)
		{
    		case '1':
    			addMusica();
    			mostrarMenu();
    			break;
    		case '2':
    			addVideo();
    			mostrarMenu();
    			break;
    		case '3':
    			mostrarPlaylist();
    			mostrarMenu();
    			break;
    		default:
    		    mostrarMenu();
    		    break;
		}
	}

	private void addMusica()
	{
		System.out.println("");

		System.out.println("Nome da música: ");
		String nome = in.nextLine();

		System.out.println("Duração da música: ");
		Integer duracao = in.nextInt();
		in.nextLine();

		System.out.println("Artista da música: ");
		String artista = in.nextLine();

		System.out.println("");

		pl.addMusica(nome, duracao, artista);
	}

	private void addVideo()
	{
		System.out.println("");

		System.out.println("Nome do vídeo: ");
		String nome = in.nextLine();

		System.out.println("Duração do vídeo: ");
		Integer duracao = in.nextInt();
		in.nextLine();

		System.out.println("Diretor do vídeo: ");
		String diretor = in.nextLine();

		System.out.println("");

		pl.addVideo(nome, duracao, diretor);
	}

	private void mostrarPlaylist()
	{
		System.out.println(pl.getNome());
		System.out.println(pl.getDescricao());
		System.out.println(pl.getDuracaopl() + " segundos\n");

		for (int i = 0; pl.getLista()[i] != null; i++)
		{
			System.out.println(pl.getLista()[i].toString());
		}
		System.out.println("");
	}
}
