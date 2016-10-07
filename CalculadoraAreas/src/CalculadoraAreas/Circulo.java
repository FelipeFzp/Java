package CalculadoraAreas;

public class Circulo extends FormaGeometrica
{
    private float Raio;
    
    public Circulo(Float raio)
    {
	this.Raio=raio;
    }

    @Override
    public Float CalcularArea()
    {
	Area=((3.14)*((this.Raio)*(this.Raio)));
	return (float) Area;
    }
    

}
