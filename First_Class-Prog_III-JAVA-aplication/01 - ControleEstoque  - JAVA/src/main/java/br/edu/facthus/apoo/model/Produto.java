package br.edu.facthus.apoo.model;

public class Produto {
	
	private Integer id;
	private String nome;
	
	private Integer id2;
	private String name2;

	
	public void setName(String newName) //metodo Void Set não retorna nada
	{
		nome = newName;
	}
	
	public String getName() //metodo get pega a informação do objeto 
	{	
		return nome;	
	}
	
	public void setId(Integer newId) 
	{
		id = newId;
	}
	
	public Integer getId() 
	{
		return id;
	}
	
	//************************** Name && ID 2 *******************//
	
	public void setName2(String newName2) 
	{
		name2 = newName2;
	}
	
	public String getName2() 
	{
		return name2;
	}
	
	public void setId2(Integer newId2) 
	{
		id2 = newId2;
	}
	
	public Integer getId2() 
	{
		return id2;
	}
}
