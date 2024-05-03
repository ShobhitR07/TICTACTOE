public class board {

	private char[][] board ;
	private int boardsize=3 ;
	private char p1symbol ;
	private char p2symbol ;
	private int marked ;
	
	public final int player1_wins=1 ;
	public final int player2_wins=2 ;
	public final int draw=3 ;
	public final int incomplete=4 ;
	public final int invalid=5 ;
	
	
	public board(char p1symbol,char p2symbol) {
		
		board=new char[boardsize][boardsize] ;
		for(int i=0;i<boardsize;i++) {
			for(int j=0;j<boardsize;j++) {
				board[i][j]=' ' ;
			}
		}
		
		
		this.p1symbol=p1symbol ;
		this.p2symbol=p2symbol ;
		
		
		
	}
	
	
	
	public int move(char symbol,int x,int y) {
		
		if(x<0||x>=boardsize||y<0||y>=boardsize||board[x][y]!=' ') {
			return invalid ;
		}else {
			board[x][y]=symbol ;
			marked++ ;
			for(int i=0;i<boardsize;i++) {
				if(board[x][0]==board[x][i]) {
					if(i==boardsize-1)return symbol==p1symbol?player1_wins:player2_wins ;
					continue ;
				}else {
					break ;
				}
			}
			
			for(int i=0;i<boardsize;i++) {
				if(board[0][y]==board[i][y]) {
					if(i==boardsize-1)return symbol==p1symbol?player1_wins:player2_wins ;
					continue ;
				}else {
					break ;
				}
			}
			
			for(int i=0;i<boardsize;i++) {
				if(board[0][0]==board[i][i]&&board[0][0]!=' ') {
					if(i==boardsize-1)return symbol==p1symbol?player1_wins:player2_wins ;
					continue ;
				}else {
					break ;
				}
			}
			
			for(int i=0;i<boardsize;i++) {
				if(board[0][boardsize-1]==board[i][2-i]&&board[0][boardsize-1]!=' ') {
					if(i==boardsize-1)return symbol==p1symbol?player1_wins:player2_wins ;
					continue ;
				}else {
					break ;
				}
			}
			
			if(marked==boardsize*boardsize)return draw ;
			
			return incomplete ;
			
		}
		
		
		
	}
	
	
	
	public void print() {
		for(int i=0;i<boardsize;i++) {
			for(int j=0;j<boardsize;j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}
	
	
	
	
	
	
	
}
