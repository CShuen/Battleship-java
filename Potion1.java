import java.util.Random;


public class Potion1 {
	private int row;
	private int col;
	private int potiontype;
	
	public void createPotionRow(){
		Random random = new Random();
		row = random.nextInt(20);
		
	}
	public int getPotionRow(){
		return row;
	}
	
	
	public void createPotionCol(){
		Random random = new Random();
		col = random.nextInt(60);
	}
	
	public int getPotionCol(){
		return col;
	}
	public void lifesaverpotion(){
		Player life = new Player();
		life.increaselife();
		life.getLife();
	}
	public void traprevealpotion(){
		
		
	}
	public void shipreveal(){
		
	}
}