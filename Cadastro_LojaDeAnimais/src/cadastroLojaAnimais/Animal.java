
package cadastroLojaAnimais;

public class Animal
{
    String Tipo;
    String Raca;
    String Nome;
    String Codigo;  
    Integer Idade;
    
    public Animal(String tipo, String raca, String nome, String codigo, Integer idade)
    {
	
	this.Tipo = tipo;
	this.Raca = raca;
	this.Nome = nome;
	this.Codigo = codigo;
	this.Idade = idade;
    }
    
    public String getCodigo()
    {
	return Codigo;
    }
    
    public void setCodigo(String codigo)
    {
	this.Codigo = codigo;
    }
    
    public String getTipo()
    {
	return Tipo;
    }
    
    public void setTipo(String tipo)
    {
	this.Tipo = tipo;
    }
    
    public String getRaca()
    {
	return Raca;
    }
    
    public void setRaca(String raca)
    {
	this.Raca = raca;
    }
    
    public String getNome()
    {
	return Nome;
    }
    
    public void setNome(String nome)
    {
	this.Nome = nome;
    }
    
    public int getIdade()
    {
	return Idade;
    }
    
    public void setIdade(Integer idade)
    {
	Idade = idade;
    }
    
}