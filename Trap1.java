import java.util.Random;


public class Trap1{
	
	private int traprow;
	private int trapcol;
	private int traptype;

	
		
	public void setTRow(){
		Random random = new Random();
		traprow = random.nextInt(20);
	}
	public int getTRow(){
		return traprow;
	}
	
	public void setTCol(){
		Random random = new Random();
		trapcol = random.nextInt(60);
	}
	
	public int getTCol(){
		return trapcol;
	}
	public void setTType(){
		Random random = new Random();
		traptype = random.nextInt(2);
		if (traptype == 0){
			int live = 1;
			Player life = new Player();
			life.setLife();
			//int playerlife = life;
			//life += live;
		}
		else if(traptype == 1){
			Trap1 trap = new Trap1();
			
			
		}
		else if(traptype == 2){
			
		}
	}
	
	public int getTType(){
		return traptype;
	}
	
}