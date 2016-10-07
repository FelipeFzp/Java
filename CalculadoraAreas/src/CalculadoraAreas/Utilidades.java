package CalculadoraAreas;

public class Utilidades
{
    public static FormaGeometrica[] VetorDeformas = new FormaGeometrica[10];
    
    private static void AdicionarFormaAoVetor(FormaGeometrica forma)
    {
	int i = 0;
	while(VetorDeformas[i]!=null)
	{
	    i++;
	}
	VetorDeformas[i] = forma;
    }
    
    public static void AdicionarRetangulo(Float base,Float altura)
    {
	Retangulo retangulo = new Retangulo(base,altura);
	AdicionarFormaAoVetor(retangulo);
    }
    
    public static void AdicionarTriangulo(Float base,Float altura)
    {
	Triangulo triangulo = new Triangulo(base,altura);
	AdicionarFormaAoVetor(triangulo);
    }
    
    public static void AdicionarCirculo(Float raio)
    {
	Circulo circulo = new Circulo(raio);
	AdicionarFormaAoVetor(circulo);
    }
    
    public static float CalcularAreaTotal()
    {
	float AreaTotal=0f;
	for (int i=0;VetorDeformas[i]!=null;i++)
	{
	    AreaTotal+=VetorDeformas[i].CalcularArea();
	}
	return AreaTotal;
    }
}
