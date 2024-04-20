package TicTacToe.TwoPlayer.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;


@Component
public class sample {
	private int id;
	private String name;
	@Autowired
	public sample()
	{
		
	}
	
	public sample(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}
}
