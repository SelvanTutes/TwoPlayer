package TicTacToe.TwoPlayer.entity;

public class Player {
	private String coin;
	private String name;
	public Player(String coin,String name)
	{
		this.name=name;
		this.coin=coin;
	}
	public String getCoin()
	{
		return this.coin;
	}
	public String getName()
	{
		return this.name;
	} 
	
	
}
