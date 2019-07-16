package com.example.SpringApp.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Pessoa implements Serializable
{
    private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "sobrenome")
    private String sobrenome;

	public Pessoa()
	{
		
	}
    
	public Pessoa(String nome, String sobrenome)
	{
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	public void setId(int id)
	{
		this.id = id;
	}
	

	public int getId()
	{
		return id;
	}

	public String getNome()
	{
		return nome;
	}
	
	public void setNome(String nome) throws NullPointerException
	{
		if (nome != null)
		{
			this.nome = nome;
		}
		else
		{
			throw new NullPointerException("ERROUUUUUUUUUUUUU");
		}
	}

	public String getSobrenome()
	{
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) throws NullPointerException
	{
		if (sobrenome != null)
		{
			this.sobrenome = sobrenome;
		}
		else
		{
			throw new NullPointerException("ERROUUUUUUUUUUUUU");
		}
	}
}