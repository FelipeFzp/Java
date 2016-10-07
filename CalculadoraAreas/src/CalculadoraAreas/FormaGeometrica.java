package CalculadoraAreas;

public abstract class FormaGeometrica
{
   public static FormaGeometrica[] formas = new FormaGeometrica[10];
    
    protected double Area;
    
    public abstract Float CalcularArea();
}
