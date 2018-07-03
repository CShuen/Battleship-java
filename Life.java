
public class Life {
	
	private int life = 15;
	
	
	public void setLife(int l){
		life = l;
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
