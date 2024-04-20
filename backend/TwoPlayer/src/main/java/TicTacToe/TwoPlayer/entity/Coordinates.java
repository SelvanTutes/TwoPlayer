package TicTacToe.TwoPlayer.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Coordinates {
	private int row;
	private int col;
	private int playerNumber;
	
	@Autowired
	public Coordinates()
	{
		
	}
	public int getRow()
	{
		return row;
	}
	public int getCol()
	{
		return col;
	}
	public int getPlayerNumber()
	{
		return playerNumber;
	}
	
}
