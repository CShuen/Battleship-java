import java.util.ArrayList;
import java.util.Random;

public class Game {
	private int x;
	private int y;
	// ArrayList<Integer> slist = new ArrayList<>();

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
		int count = 0;
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
}