package TicTacToe.TwoPlayer.services;
import TicTacToe.TwoPlayer.entity.Coordinates;
import TicTacToe.TwoPlayer.entity.Player;
import TicTacToe.TwoPlayer.entity.PlayersStack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PlayersStackServices {
	@Autowired
	private PlayersStack PS=new PlayersStack();
	public PlayersStackServices()
	{
		
	}
	
	public Player isAvailable()
	{
		Player pl=PS.addPlayer();
			return pl;
		
			
	}
	public Player getPlayer(int num)
	{
		return PS.getPlayer(num);
	}
	public boolean makeMove(Coordinates crd)
	{
		return true;
	}
}
