import java.util.ArrayList;


public class Grid {
	
	private int row = 20;
	private int col = 60;
	private String mapDisplay = "";
	private int[][] show = new int[row][col];
	Game g = new Game();
	
	
	
	public void map(){
		
		
		for (int i = 0; i <show.length;i++) {
			for ( int j = 0; j < show[i].length; j++) {
				show[i][j] = 0;
				mapDisplay += Integer.toString(show[i][j]);
				}
			mapDisplay += "\n";
			}
		System.out.println(mapDisplay);
		System.out.println();
		show= g.checkpotion(show);
		show= g.Beginnercheckship(show);
		show= g.Beginnerchecktrap(show);
		getGrid();
		
		for (int i = 0; i <show.length;i++) {
			for ( int j = 0; j < show[i].length; j++) {
				mapDisplay += Integer.toString(show[i][j]);
				}
			mapDisplay += "\n";
			}
		System.out.println(mapDisplay);
		
		
	}
	public String getmap(){
		return mapDisplay;
	}
	
	

	
	public void setGrid(int x, int y,int obj){
		//show[20-1]
		show[x][y]=obj;
		
	}
	
	public int checkGrid(int x, int y) {
		return show[x][y];
	}
	
	public void setGridShip(int[][] backgrid){
		show = backgrid;
		
	}
	
	public int[][] getGrid(){
		return show;
	}
	
}
