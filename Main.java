import java.util.Scanner;


public class Main {
	public static void main(String[] args){
	Grid grid = new Grid();
	//grid.map();
	//test
	//test2
	//test3
	

		Scanner input = new Scanner(System.in);
		System.out.println("Please choose a level by typing in the number.\n 1.Beginner\n 2.Intermediate\n 3.Advance");
		int userinput = input.nextInt();
		
			
			grid.map(userinput);
			Life life = new Life();
			
		for(int counter =1; counter >0; counter++){
			life.setLife();
			System.out.println(life);
			System.out.println("Please enter the row.");
			int coorrow = input.nextInt();
			System.out.println("Please enter the col.");
			int coorcol = input.nextInt();
			
			int[][] show = grid.getGrid();
			if(show[coorrow][coorcol] == 1){
				System.out.println("You have reveal a ship");
//				String[coorrow][coorcol] = " ";	//7 is reveal ship
			}
			else if(show[coorrow][coorcol] == 3){
				System.out.println("You have reveal a ship");
				show[coorrow][coorcol] = 7;
			}
		}
			
}
}
