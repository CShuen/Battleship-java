import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
	private int x;
	private int y;
	private int count = 0;
	private static Game ga = new Game();
	
	//ArrayList<Integer> slist = new ArrayList<>();

	/*
	 * public Game(int x, int y){ setRow(x); setCol(y); }
	 */

	public void setRow(int r) {
		// TODO Auto-generated method stub
		x = r;
	}

	public int getRow() {
		return x;
	}

	public void setCol(int c) {
		y = c;
	}

	public int getCol() {
		return y;
	}

	public int[][] Beginnercheckship(int[][] backgrid) {
		int ship = 80;
		Random random = new Random();
		
		
		while (count < ship) {
			Ship r = new Ship();
			r.createShipCol();
			r.createShipRow();
			int shipcol = r.getShipCol();
			int shiprow = r.getShipRow();

			boolean hvship = false;

			int length = random.nextInt(3) + 3;
			if (shipcol < 54) {
				for (int a = shipcol; a < shipcol + (length + 1); a++) {

					if (backgrid[shiprow][shipcol] == 1) {

						hvship = true;

					}
				}
				if (shipcol > 0) {
					if (backgrid[shiprow][shipcol - 1] == 1) {
						hvship = true;
					}
				}
				if (!hvship) {
					for (int a = shipcol; a < shipcol + length; a++) {
						backgrid[shiprow][a] = 1;
					}
				}
			} else {
				for (int a = shipcol; a > shipcol - (length + 1); a--) {
					if (backgrid[shiprow][a] == 1) {
						hvship = true;
					}
				}
				if (shipcol < 59) {
					if (backgrid[shiprow][shipcol + 1] == 1) {
						hvship = true;
					}
				}
				if (!hvship) {
					for (int a = shipcol; a > shipcol - length; a--) {
						backgrid[shiprow][a] = 1;
					}
				}
			}
			count++;

			if (hvship) {
				hvship = false;

				count -= 1;
			} else {
				
				backgrid[shiprow][shipcol] = 1;
			}
			

		}
		
		return backgrid;
	}
	public int[][] Intermediatecheckship(int[][] backgrid) {
		int ship = 50;
		Random random = new Random();
		

		while (count < ship) {
			Ship r = new Ship();
			r.createShipCol();
			r.createShipRow();
			int shipcol = r.getShipCol();
			int shiprow = r.getShipRow();

			boolean hvship = false;

			int length = random.nextInt(3) + 3;
			if (shipcol < 54) {
				for (int a = shipcol; a < shipcol + (length + 1); a++) {

					if (backgrid[shiprow][shipcol] == 1) {

						hvship = true;

					}
				}
				if (shipcol > 0) {
					if (backgrid[shiprow][shipcol - 1] == 1) {
						hvship = true;
					}
				}
				if (!hvship) {
					for (int a = shipcol; a < shipcol + length; a++) {
						backgrid[shiprow][a] = 1;
					}
				}
			} else {
				for (int a = shipcol; a > shipcol - (length + 1); a--) {
					if (backgrid[shiprow][a] == 1) {
						hvship = true;
					}
				}
				if (shipcol < 59) {
					if (backgrid[shiprow][shipcol + 1] == 1) {
						hvship = true;
					}
				}
				if (!hvship) {
					for (int a = shipcol; a > shipcol - length; a--) {
						backgrid[shiprow][a] = 1;
					}
				}
			}
			count++;

			if (hvship) {
				hvship = false;

				count -= 1;
			} else {
			
				backgrid[shiprow][shipcol] = 1;
			}
			

		}
		return backgrid;
	}
	public int[][] Advancecheckship(int[][] backgrid) {
		int ship = 20;
		Random random = new Random();
		
		
		while (count < ship) {
			Ship r = new Ship();
			r.createShipCol();
			r.createShipRow();
			int shipcol = r.getShipCol();
			int shiprow = r.getShipRow();

			boolean hvship = false;

			int length = random.nextInt(3) + 3;
			if (shipcol < 54) {
				for (int a = shipcol; a < shipcol + (length + 1); a++) {

					if (backgrid[shiprow][shipcol] == 1) {

						hvship = true;

					}
				}
				if (shipcol > 0) {
					if (backgrid[shiprow][shipcol - 1] == 1) {
						hvship = true;
					}
				}
				if (!hvship) {
					for (int a = shipcol; a < shipcol + length; a++) {
						backgrid[shiprow][a] = 1;
					}
				}
			} else {
				for (int a = shipcol; a > shipcol - (length + 1); a--) {
					if (backgrid[shiprow][a] == 1) {
						hvship = true;
					}
				}
				if (shipcol < 59) {
					if (backgrid[shiprow][shipcol + 1] == 1) {
						hvship = true;
					}
				}
				if (!hvship) {
					for (int a = shipcol; a > shipcol - length; a--) {
						backgrid[shiprow][a] = 1;
					}
				}
			}
			count++;

			if (hvship) {
				hvship = false;

				count -= 1;
			} else {
				
				backgrid[shiprow][shipcol] = 1;
			}
			

		}
		return backgrid;
	}
	
	public int[][] Beginnerchecktrap(int[][] backgrid){
		int traplevel = 10;
		
		
	while(count < traplevel){
		Trap t = new Trap();
		t.setTRow();
		t.setTCol();
		t.setTType();
		int trow = t.getTRow();
		int tcol = t.getTCol();
		
		
		boolean placetraps = false;
		
		if(backgrid[trow][tcol] != 1){
			backgrid[trow][tcol] = 3;
			placetraps = true;
			}
		else if(backgrid[trow][tcol] != 3){
			backgrid[trow][tcol] = 3;
			placetraps = true;
		}
		
		count++;
		if(placetraps = false){
			count --;
			}else {
				
				backgrid[trow][tcol] = 3;
			}
		}
	return backgrid;
	}
	public int[][] Intermediatechecktrap(int[][] backgrid){
		int traplevel = 20;
		
	while(count < traplevel){
		Trap t = new Trap();
		t.setTRow();
		t.setTCol();
		t.setTType();
		int trow = t.getTRow();
		int tcol = t.getTCol();
		
		
		boolean placetraps = false;
		
		if(backgrid[trow][tcol] != 1){
			backgrid[trow][tcol] = 3;
			placetraps = true;
			}
		else if(backgrid[trow][tcol] != 3){
			backgrid[trow][tcol] = 3;
			placetraps = true;
		}
		
		count++;
		if(placetraps = false){
			count --;
			}else {
				
				backgrid[trow][tcol] = 3;
			}
		}
	return backgrid;
	}
	public int[][] Advancechecktrap(int[][] backgrid){
		int traplevel = 30;
		
	while(count < traplevel){
		Trap t = new Trap();
		t.setTRow();
		t.setTCol();
		t.setTType();
		int trow = t.getTRow();
		int tcol = t.getTCol();
		
		
		boolean placetraps = false;
		
		if(backgrid[trow][tcol] != 1){
			backgrid[trow][tcol] = 3;
			placetraps = true;
			}
		else if(backgrid[trow][tcol] != 3){
			backgrid[trow][tcol] = 3;
			placetraps = true;
		}
		
		count++;
		if(placetraps = false){
			count --;
			}else {
				
				backgrid[trow][tcol] = 3;
			}
		}
	return backgrid;
	}
	public int[][] checkpotion(int[][] backgrid){
		int potion = 18;
		
	while(count < potion){
		Potion p = new Potion();
		p.createPotionRow();
		p.createPotionCol();
		int prow = p.getPotionRow();
		int pcol = p.getPotionCol();
		
		
		boolean placepotion = false;
		
		if(backgrid[prow][pcol] != 1){
			backgrid[prow][pcol] = 4;
			placepotion = true;
			}
		else if(backgrid[prow][pcol] != 1){
			backgrid[prow][pcol] = 4;
			placepotion = true;
		}
		
		count++;
		if(placepotion = false){
			count --;
			}else {
				backgrid[prow][pcol] = 4;
			}
		}
	return backgrid;
	}
	/*public void setBeginner(){
		Grid grids = new Grid();
		grids.setGridShip(Beginnercheckship(backgrid));
		grids.setGridShip(Beginnerchecktrap(backgrid));
		grids.setGridShip(checkpotion(backgrid));
	}
	/*
	public void setIntermediate(){
		Grid grids = new Grid();
		grids.setGridShip(Intermediatecheckship(backgrid));
		grids.setGridTrap(Intermediatechecktrap(backgrid));
		grids.setGridPotion(checkpotion(backgrid));
	}
	public void setAdvance(){
		Grid grids = new Grid();
		grids.setGridShip(Advancecheckship(backgrid));
		grids.setGridTrap(Advancechecktrap(backgrid));
		grids.setGridPotion(checkpotion(backgrid));
	}*/
	/*public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Please choose a level by typing in the number.\n 1.Beginner\n 2.Intermediate\n 3.Advance");
		int userinput = input.nextInt();
		
		
	}*/

}
