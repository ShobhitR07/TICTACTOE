public class player {

	private String name ;
	private char symbol ;
	
	public player(String name,char symbol){
		
		setname(name) ;
		setsymbol(symbol) ;
		
		
	}
	
	public void setname(String name){
		
		if(!name.isEmpty()) {
			this.name=name ;
		}
		
	}

	public void setsymbol(char symbol) {
		
		if(symbol !='\0') {
			this.symbol=symbol ;
		}
		
	}
	
	public String getname() {
		return this.name ;
	}
	
	public char getsymbol() {
		return this.symbol ;
		
	}
	
	
	
}
