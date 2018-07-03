
public class Player {
	
	private int life = 15;
	
	
	public void setLife(){
		life = 15;
	}
	public int getLife(){
		return life;
	}
	
	public void reducelife(){
		life -= 1;
	}
	
	public void increaselife(){
		life += 1;
	}
	
}