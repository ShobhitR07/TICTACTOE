public class tictactoe {

	private player player1,player2 ;
	private board Board ;
	
	
	public void startgame() {
		Scanner s=new Scanner(System.in) ;
		player1=createplayer(1) ;
		player2=createplayer(2) ;
		
		while(player1.getsymbol()==player2.getsymbol()) {
			System.out.println("symbol already taken.Pick another symbol") ;
			player2.setsymbol(s.next().charAt(0));	
			}
		
		Board=new board(player1.getsymbol(),player2.getsymbol()) ;
		
		int turn=1;
		int status=Board.incomplete ;
		
		while(status==Board.incomplete||status==Board.invalid) {
			
			if(turn==1) {
				
				System.out.println("player "+turn+"'s turn : ") ;
				System.out.println("enter x:") ;
				int x=s.nextInt();
			    System.out.println("enter y:") ;
			    int y=s.nextInt();
			    status=Board.move(player1.getsymbol(), x, y) ;
				
				if(status==Board.invalid) {
					System.out.println("invalid input! retry") ;
				}else {
					turn=2 ;
					Board.print();
					
				}
				
				
				
				
			}else {
				
				System.out.println("player "+turn+"'s turn : ") ;
				System.out.println("enter x:") ;
				int x=s.nextInt();
			    System.out.println("enter y:") ;
			    int y=s.nextInt();
			    status=Board.move(player2.getsymbol(), x, y) ;
				
				if(status==Board.invalid) {
					System.out.println("invalid input! retry") ;
				}else {
					turn=1 ;
					Board.print();
					
				}
				
			}
			
		}
		
		if(status==Board.player1_wins)System.out.println("player1 wins!!!!") ;
		else if(status==Board.player2_wins)System.out.println("player2 wins!!!!") ;
		else System.out.println("it is a draw") ;
		
	}
	
	private player createplayer(int num) {
		Scanner s=new Scanner(System.in) ;
		System.out.println("enter player"+" "+num+" name:") ;
		String name=s.nextLine() ;
		System.out.println("enter player"+" "+num+" symbol:") ;
		char symbol=s.next().charAt(0) ;
		return new player(name,symbol) ;
	}
	
	
	
	
	
	
	
	
	
	
	
}
