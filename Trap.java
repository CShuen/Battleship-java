import java.util.Random;


public class Trap {
	
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
		traptype = random.nextInt(1);
	
		if (traptype == 0){
			Life life = new Life();
			life.reducelife();
			System.out.println(life.getLife());
		}
		else if(traptype == 1){
			Trap trap = new Trap();
			int live = 2;
			Life life = new Life();
			int userlife = life.getLife();
			life.setLife(userlife-live);
			System.out.println(life.getLife());
		}
		
	}
	
	public int getTType(){
		return traptype;
	}
	
}
