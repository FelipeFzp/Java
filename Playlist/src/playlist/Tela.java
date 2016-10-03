package playlist;

import java.util.Scanner;

public class Tela
{
	Scanner in = new Scanner(System.in);

	Playlist pl = new Playlist();

	public void mostrarMenu()
	{
		
		System.out.println("Playlist " + pl.getNome());
		System.out.println("1 - Adicionar m�sica");
		System.out.println("2 - Adicionar v�deo");
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

		System.out.println("Nome da m�sica: ");
		String nome = in.nextLine();

		System.out.println("Dura��o da m�sica: ");
		Integer duracao = in.nextInt();
		in.nextLine();

		System.out.println("Artista da m�sica: ");
		String artista = in.nextLine();

		System.out.println("");

		pl.addMusica(nome, duracao, artista);
	}

	private void addVideo()
	{
		System.out.println("");

		System.out.println("Nome do v�deo: ");
		String nome = in.nextLine();

		System.out.println("Dura��o do v�deo: ");
		Integer duracao = in.nextInt();
		in.nextLine();

		System.out.println("Diretor do v�deo: ");
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
