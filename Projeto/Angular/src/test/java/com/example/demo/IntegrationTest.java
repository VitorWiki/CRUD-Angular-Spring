package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.example.SpringApp.entities.Pessoa;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=Pessoa.class)
public class IntegrationTest
{	
	@Test
	public void nomeNuloDeveLancarException()
	{
		Pessoa pessoa = new Pessoa();
		try
		{
			pessoa.setNome(null);
		} catch (NullPointerException np)
		{
			System.out.println(np.getMessage());
		}
	}
	
	@Test
	public void sobrenomeNuloDeveLancarException()
	{
		Pessoa pessoa = new Pessoa();
		try
		{
			pessoa.setSobrenome(null);
		} catch (NullPointerException np)
		{
			System.out.println(np.getMessage());
		}
	}
}