package TicTacToe.TwoPlayer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import TicTacToe.TwoPlayer.entity.Board;
import TicTacToe.TwoPlayer.entity.Coordinates;
import TicTacToe.TwoPlayer.entity.Player;
import TicTacToe.TwoPlayer.entity.sample;
import TicTacToe.TwoPlayer.services.PlayersStackServices;
@RestController
public class GameController {
	//@Autowired
	//PlayersStack PS;
	@Autowired
	PlayersStackServices Players;
	Board board=new Board();
@GetMapping("/start")
public Player startGame()
{
	Player p=Players.isAvailable();
	return p;
}
@PostMapping("/addMove")
public String addMove(@RequestBody Coordinates crd)
{
	if(board.getStatus()=="PLAYING")
	{
	if((crd.getPlayerNumber()-1)==board.getCurrentPlayer())
	{
	String result=board.addCoin(crd.getRow(),crd.getCol(),Players.getPlayer(crd.getPlayerNumber()-1));
	
	return result;
	}
	return "wait";
	}
	return board.getStatus();
}
@PostMapping("/notify")
public Board check()
{
	
	return this.board;
}

}
