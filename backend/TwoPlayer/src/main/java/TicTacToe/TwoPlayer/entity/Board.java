package TicTacToe.TwoPlayer.entity;

import org.springframework.stereotype.Component;

@Component
public class Board {
	private String [][] ticBoard;
	private int currentPlayer;
	private String status="PLAYING";
	public Board()
	{
		currentPlayer=0;
		ticBoard=new String[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				ticBoard[i][j]="-";
			}
		}
	}
	public void isDraw()
	{
		int count=0;
		for(int i=0;i<3;i++)
		{
		
			for(int j=0;j<3;j++)
			{
				if(ticBoard[i][j]=="-")
				{
					count++;
				}
			}
			
		}
		if(count==0)
		{
			status="DRAW";
		}
		
	}
	public String checkSuccess(String coin)
	{
		int count=0;
		//check row wise
		for(int i=0;i<3;i++)
		{
			count=0;
			for(int j=0;j<3;j++)
			{
				if(ticBoard[i][j]==coin)
				{
					count++;
				}
			}
			if(count==3)
			{
				status=coin+"=>win";
				return coin+"=>win";
			}
		}
		//check column wise
				for(int j=0;j<3;j++)
				{
					count=0;
					for(int i=0;i<3;i++)
					{
						if(ticBoard[i][j]==coin)
						{
							count++;
						}
					}
					if(count==3)
					{
						status=coin+"=>win";
						return coin+"=>win";
					}
				}
				if(ticBoard[0][0]==coin && ticBoard[1][1]==coin && ticBoard[2][2]==coin)
				{
					status=coin+"=>win";
					return coin+"=>win";
				}
				else if(ticBoard[0][2]==coin && ticBoard[1][1]==coin && ticBoard[2][0]==coin)
				{
					status=coin+"=>win";
					return coin+"=>win";
				}
				else
				{
					if(currentPlayer==0)
					{
						currentPlayer=1;
					}
					else
					{
						currentPlayer=0;
					}
					
					return "added";
				}
	}
	public String addCoin(int row,int col,Player p)
	{
		if(ticBoard[row][col]=="-")
		{
			ticBoard[row][col]=p.getCoin();
			return checkSuccess(p.getCoin());
			
		}
		else
		{
			return "no";
		}
	}
	public String[][] getTicBoard()
	{
		return this.ticBoard;
	}
	public String getStatus()
	{
		isDraw();
		return status;
	}
	public int getCurrentPlayer()
	{
		return currentPlayer;
	}

}
