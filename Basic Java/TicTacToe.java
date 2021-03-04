import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;



public class TicTacToe {

	static ArrayList<Integer> playerposition=new ArrayList<>();
	static ArrayList<Integer> cpuposition=new ArrayList<>();
	public static void main(String[] args) {
	
		char board[][]= {{' ', '|',' ','|',' '},
						 {'-', '+','-','+','-'},
						 {' ', '|',' ','|',' '},
						 {'-', '+','-','+','-'},
						 {' ', '|',' ','|',' '}};
		
	
		while(true)
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your place between 1-9:");
		int playerpos=sc.nextInt();
		while(playerposition.contains(playerpos)||cpuposition.contains(playerpos))
		{
			System.out.println("position taken1 enter new number:");
			playerpos=sc.nextInt();
		}
		
		Placepeace(board, playerpos, "player");
		String res=checkwinner();
		if(res.length()>0)
		{
			System.out.println(res);
			break;
		}
		Random r=new Random();
		int cpupos=r.nextInt(9) + 1;
		while(playerposition.contains(cpupos)||cpuposition.contains(cpupos))
		{
			 cpupos=r.nextInt(9) + 1;
		}
		Placepeace(board, cpupos, "cpu");

		playboard(board);
		res=checkwinner();
		if(res.length()>0)
		{
			System.out.println(res);
			break;
		}
		
		System.out.println(res);
		}
	}
		public static void playboard(char [][]board)
		{
		for(char[] x:board)
		{
			for(char c:x)
			{
				System.out.print(c);
			}
		System.out.println();
		}

		}
		
		public static void Placepeace(char [] []board,int pos,String user)
		{
			char symbol=' ';
			if(user.equals("player"))
			{
				symbol='X';
				playerposition.add(pos);
			}
			else if(user.equals("cpu"))
			{
				symbol='O';
				cpuposition.add(pos);
			}

			switch(pos)
			{
				case 1:
					board[0][0]=symbol;
					break;
				case 2:
					board[0][2]=symbol;
					break;
				case 3:
					board[0][4]=symbol;
					break;
				case 4:
					board[2][0]=symbol;
					break;
				case 5:
					board[2][2]=symbol;
					break;
				case 6:
					board[2][4]=symbol;
					break;
				case 7:
					board[4][0]=symbol;
					break;
				case 8:
					board[4][2]=symbol;
					break;	
				case 9:
					board[4][4]=symbol;
					break;
			}
		}
		public static String checkwinner()
		{

			List toprow=Arrays.asList(1,2,3);
			List midrow=Arrays.asList(4,5,6);
			List bottomrow=Arrays.asList(7,8,9);
			List leftcol=Arrays.asList(1,4,7);
			List midcol=Arrays.asList(2,5,8);
			List rightcol=Arrays.asList(3,6,9);
			List cross1=Arrays.asList(1,5,9);
			List cross2=Arrays.asList(7,5,3);
			
			List<List> winning=new ArrayList<>();
			winning.add(toprow);
			winning.add(midrow);
			winning.add(bottomrow);
			winning.add(leftcol);
			winning.add(midcol);
			winning.add(rightcol);
			winning.add(cross1);
			winning.add(cross2);
			
			for(List l:winning)
			{
				if(playerposition.containsAll(l))
				{
					return "Congratulation you won";
				}
				else if(cpuposition.containsAll(l))
				{
					return "CPU wins! Sorry";
				}
				else if(playerposition.size() + cpuposition.size()==9)
				{
					return "TIE!!!!!";
				}
			}
			
			return "";
		}

}
