package CalculadoraAreas;

public class Retangulo extends FormaGeometrica
{
    private Float Base;
    private Float Altura;
    
    public Retangulo(Float base, Float altura)
    {
	this.Base=base;
	this.Altura=altura;
    }

    @Override
    public Float CalcularArea()
    {
	Area=(this.Base)*(this.Altura);
	return (float) Area;
    }



}
