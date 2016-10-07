package CalculadoraAreas;

public class Triangulo extends FormaGeometrica
{

    private float Base;
    private float Altura;
    
    public Triangulo(float base, float altura)
    {
	this.Base=base;
	this.Altura=altura;
    }

    @Override
    public Float CalcularArea()
    {
	Area = ((this.Base)*(this.Altura))/2;
	return (float) Area;
    }

}
