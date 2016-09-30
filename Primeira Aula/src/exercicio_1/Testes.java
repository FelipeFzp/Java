package exercicio_1;

import java.util.Scanner;

public class Testes {
	Scanner ent= new Scanner(System.in);
	float lado_a,lado_b,lado_c;

	public void leitura()
	{
		lado_a=ent.nextFloat();
		lado_b=ent.nextFloat();
		lado_c=ent.nextFloat();
		ent.close();
		teste();
	}
	
	private void teste()
	{
		if (lado_a == lado_b && lado_a == lado_c)
		{
			System.out.println("Triangulo Equilatero");
		}
		else
			if (lado_a != lado_b && lado_b != lado_c)
			{
				System.out.println("Triangulo Escaleno");
			}
			else
			{
				System.out.println("Triangulo Isoseles");
			}
	}

}
