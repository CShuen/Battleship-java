import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
	private int x;
	private int y;
	private int count = 0;
	private int[][] backgrid;
	private int[][] trapgrid;
	private int[][] potiongrid;
	private static Game ga = new Game();
	ArrayList<Integer> slist = new ArrayList<>();

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
		Grid g = new Grid();
		backgrid = g.getGrid();
		

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
				g.setGridShip(backgrid);
				backgrid[shiprow][shipcol] = 1;
			}
			

		}
		return backgrid;
	}
	public int[][] Intermediatecheckship(int[][] backgrid) {
		int ship = 50;
		Random random = new Random();
		Grid g = new Grid();
		backgrid = g.getGrid();
		
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
				g.setGridShip(backgrid);
				backgrid[shiprow][shipcol] = 1;
			}
			

		}
		return backgrid;
	}
	public int[][] Advancecheckship(int[][] backgrid) {
		int ship = 20;
		Random random = new Random();
		Grid g = new Grid();
		backgrid = g.getGrid();

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
				g.setGridShip(backgrid);
				backgrid[shiprow][shipcol] = 1;
			}
			

		}
		return backgrid;
	}
	
	public int[][] Beginnerchecktrap(int[][] trapgrid){
		int traplevel = 10;
		Grid tg = new Grid();
		trapgrid = tg.getGrid();
		
		
	while(count < traplevel){
		Trap t = new Trap();
		t.setTRow();
		t.setTCol();
		t.setTType();
		int trow = t.getTRow();
		int tcol = t.getTCol();
		
		
		boolean placetraps = false;
		
		if(trapgrid[trow][tcol] != 1){
			trapgrid[trow][tcol] = 3;
			placetraps = true;
			}
		else if(trapgrid[trow][tcol] != 3){
			trapgrid[trow][tcol] = 3;
			placetraps = true;
		}
		
		count++;
		if(placetraps = false){
			count --;
			}else {
				tg.setGridTrap(trapgrid);
				trapgrid[trow][tcol] = 3;
			}
		}
	return trapgrid;
	}
	public int[][] Intermediatechecktrap(int[][] trapgrid){
		int traplevel = 20;
		Grid tg = new Grid();
		trapgrid = tg.getGrid();
		
	while(count < traplevel){
		Trap t = new Trap();
		t.setTRow();
		t.setTCol();
		t.setTType();
		int trow = t.getTRow();
		int tcol = t.getTCol();
		
		
		boolean placetraps = false;
		
		if(trapgrid[trow][tcol] != 1){
			trapgrid[trow][tcol] = 3;
			placetraps = true;
			}
		else if(trapgrid[trow][tcol] != 3){
			trapgrid[trow][tcol] = 3;
			placetraps = true;
		}
		
		count++;
		if(placetraps = false){
			count --;
			}else {
				tg.setGridTrap(trapgrid);
				trapgrid[trow][tcol] = 3;
			}
		}
	return trapgrid;
	}
	public int[][] Advancechecktrap(int[][] trapgrid){
		int traplevel = 30;
		Grid tg = new Grid();
		trapgrid = tg.getGrid();
		
	while(count < traplevel){
		Trap t = new Trap();
		t.setTRow();
		t.setTCol();
		t.setTType();
		int trow = t.getTRow();
		int tcol = t.getTCol();
		
		
		boolean placetraps = false;
		
		if(trapgrid[trow][tcol] != 1){
			trapgrid[trow][tcol] = 3;
			placetraps = true;
			}
		else if(trapgrid[trow][tcol] != 3){
			trapgrid[trow][tcol] = 3;
			placetraps = true;
		}
		
		count++;
		if(placetraps = false){
			count --;
			}else {
				tg.setGridTrap(trapgrid);
				trapgrid[trow][tcol] = 3;
			}
		}
	return trapgrid;
	}
	public int[][] checkpotion(int[][] potiongrid){
		int potion = 18;
		Grid pg = new Grid();
		potiongrid = pg.getGrid();
		
	while(count < potion){
		Potion p = new Potion();
		p.createPotionRow();
		p.createPotionCol();
		int prow = p.getPotionRow();
		int pcol = p.getPotionCol();
		
		
		boolean placepotion = false;
		
		if(potiongrid[prow][pcol] != 1){
			potiongrid[prow][pcol] = 4;
			placepotion = true;
			}
		else if(potiongrid[prow][pcol] != 1){
			potiongrid[prow][pcol] = 4;
			placepotion = true;
		}
		
		count++;
		if(placepotion = false){
			count --;
			}else {
				pg.setGridPotion(potiongrid);
				potiongrid[prow][pcol] = 4;
			}
		}
	return potiongrid;
	}
	public void setBeginner(){
		Grid grids = new Grid();
		grids.setGridShip(Beginnercheckship(backgrid));
		grids.setGridTrap(Beginnerchecktrap(trapgrid));
		grids.setGridPotion(checkpotion(potiongrid));
	}
	public void setIntermediate(){
		Grid grids = new Grid();
		grids.setGridShip(Intermediatecheckship(backgrid));
		grids.setGridTrap(Intermediatechecktrap(trapgrid));
		grids.setGridPotion(checkpotion(potiongrid));
	}
	public void setAdvance(){
		Grid grids = new Grid();
		grids.setGridShip(Advancecheckship(backgrid));
		grids.setGridTrap(Advancechecktrap(trapgrid));
		grids.setGridPotion(checkpotion(potiongrid));
	}
	/*public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Please choose a level by typing in the number.\n 1.Beginner\n 2.Intermediate\n 3.Advance");
		int userinput = input.nextInt();
		
		
	}*/

}
