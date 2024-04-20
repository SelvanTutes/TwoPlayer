package TicTacToe.TwoPlayer.entity;

import org.springframework.stereotype.Component;

@Component

public class PlayersStack {
	private Player [] p;
	private String [] coins={"O","X"};
	private String [] names={"Player1","Player2"};
	private int count;
	public PlayersStack()
	{	
		
		count=0;
		p=new Player[2];
		
	}
	//we can do this as firstPlayer,secondPlayer
	public Player getPlayer(int num)
	{
		return p[num];
	}
	public Player addPlayer(String coin,String name)
	{
		if(count<2)
		{
			p[count]=new Player(coin,name);
			count++;
			return p[count-1];
		}
		else
		{
			return null;
		}
	}
	public Player addPlayer()
	{
		if(count<2)
		{
			
			p[count]=new Player(coins[count],names[count]);
			count++;
			
			return p[count-1];
		}
		else
		{
			return null;
		}
	}
}
